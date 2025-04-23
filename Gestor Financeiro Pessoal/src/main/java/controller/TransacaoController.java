package controller;

import dao.DatabaseConnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Transacao;

import java.sql.*;
import java.time.LocalDate;

public class TransacaoController {

    public ObservableList<Transacao> carregarTransacoes() {
        ObservableList<Transacao> transacoes = FXCollections.observableArrayList();
        Connection conn = DatabaseConnection.connect();
        if (conn != null) {
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM Transacao")) {
                while (rs.next()) {
                    transacoes.add(new Transacao(
                            rs.getString("tipo"),
                            rs.getString("categoria"),
                            rs.getDouble("valor"),
                            rs.getString("descricao"),
                            rs.getDate("data").toLocalDate()
                    ));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return transacoes;
    }

    public void salvarTransacao(Transacao t, ObservableList<Transacao> listaDestino) {
        Connection conn = DatabaseConnection.connect();
        if (conn != null) {
            String sql = "INSERT INTO Transacao (tipo, categoria, valor, descricao, data) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, t.getTipo());
                stmt.setString(2, t.getCategoria());
                stmt.setDouble(3, t.getValor());
                stmt.setString(4, t.getDescricao());
                stmt.setDate(5, Date.valueOf(t.getData()));
                stmt.executeUpdate();
                listaDestino.add(t);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void limparCampos(TextField valorField, TextField descricaoField, DatePicker dataField, ComboBox<String> tipoBox, ComboBox<String> categoriaBox) {
        valorField.clear();
        descricaoField.clear();
        dataField.setValue(null);
        tipoBox.setValue(null);
        categoriaBox.setValue(null);
    }
}
