package conta;

import model.Cliente;
import model.Filme;
import locacao.Locacao;
import java.util.ArrayList;
import java.util.Date;

public class Conta {
    private Cliente cliente;
    private double saldoDevedor;
    private ArrayList<Locacao> historicoLocacao;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldoDevedor = 0.0;
        this.historicoLocacao = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }

    public ArrayList<Locacao> getHistoricoLocacao() {
        return historicoLocacao;
    }

    public void locarFilmes(Filme[] filmes) {
        Locacao locacao = new Locacao(new Date());
        for (Filme filme : filmes) {
            if (filme != null) {
                locacao.addFilme(filme);
            }
        }
        historicoLocacao.add(locacao);
        saldoDevedor += locacao.getValorTotalAPagar();
    }

    public String extratoHistorico() {
        StringBuilder sb = new StringBuilder();
        sb.append(".:: Histórico de Locações de ").append(cliente.getNome()).append("::.\n");
        for (Locacao locacao : historicoLocacao) {
            sb.append(locacao.getDataLocacao()).append(" ");
            for (Filme filme : locacao.getListaFilmes()) {
                sb.append(filme.getNome()).append(", ");
            }
            if (!locacao.getListaFilmes().isEmpty()) {
                sb.setLength(sb.length() - 2); // Remove última vírgula
            }
            sb.append(" ").append(locacao.getValorTotalAPagar()).append("\n");
        }
        return sb.toString();
    }

    public void pagarDebito(double valor) {
        saldoDevedor -= valor;
        if (saldoDevedor < 0) saldoDevedor = 0;
    }
}
