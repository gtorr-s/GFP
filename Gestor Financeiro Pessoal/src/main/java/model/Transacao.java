package model;

import java.time.LocalDate;

public class Transacao {
    private String tipo;
    private String categoria;
    private double valor;
    private String descricao;
    private LocalDate data;

    public Transacao(String tipo, String categoria, double valor, String descricao, LocalDate data) {
        this.tipo = tipo;
        this.categoria = categoria;
        this.valor = valor;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }
}
