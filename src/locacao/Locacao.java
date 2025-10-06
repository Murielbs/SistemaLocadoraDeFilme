package locacao;

import model.Filme;
import java.util.ArrayList;
import java.util.Date;

public class Locacao {
    private Date dataLocacao;
    private ArrayList<Filme> listaFilmes;
    private double valorTotalAPagar;

    public Locacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
        this.listaFilmes = new ArrayList<>();
        this.valorTotalAPagar = 0.0;
    }

    public void addFilme(Filme filme) {
        listaFilmes.add(filme);
        valorTotalAPagar += filme.getValorLocacao();
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public ArrayList<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public double getValorTotalAPagar() {
        return valorTotalAPagar;
    }
}
