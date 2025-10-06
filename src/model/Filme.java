package model;

public class Filme {
    private String nome;
    private double valorLocacao;

    public Filme(String nome, double valorLocacao) {
        this.nome = nome;
        this.valorLocacao = valorLocacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
}
