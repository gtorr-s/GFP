package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import model.Transacao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DashboardController {

    public void atualizarDashboard(List<Transacao> transacoes, Label receitasLabel, Label despesasLabel, Label saldoTotalLabel, PieChart graficoDespesas) {
        double receitas = transacoes.stream().filter(t -> t.getTipo().equals("Receita")).mapToDouble(Transacao::getValor).sum();
        double despesas = transacoes.stream().filter(t -> t.getTipo().equals("Despesa")).mapToDouble(Transacao::getValor).sum();
        double saldo = receitas - despesas;

        receitasLabel.setText(String.format("€%.2f", receitas));
        despesasLabel.setText(String.format("€%.2f", despesas));
        saldoTotalLabel.setText(String.format("€%.2f", saldo));

        ObservableList<PieChart.Data> dadosGrafico = FXCollections.observableArrayList();
        Map<String, Double> agrupado = transacoes.stream()
                .filter(t -> t.getTipo().equals("Despesa"))
                .collect(Collectors.groupingBy(Transacao::getCategoria, Collectors.summingDouble(Transacao::getValor)));

        agrupado.forEach((categoria, valor) -> dadosGrafico.add(new PieChart.Data(categoria, valor)));
        graficoDespesas.setData(dadosGrafico);
    }
}
