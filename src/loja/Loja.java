package loja;

import interfaces.Desconto;
import interfaces.Observador;
import interfaces.Pagamento;
import pagamento.PagamentoFactory;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private final List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador o) {

        observadores.add(o);

    }

    public void comprar(String produto, double preco, Desconto desconto, String tipoPagamento) {
        double total = desconto.aplicar(preco);          // Strategy
        Pagamento pagamento = PagamentoFactory.criar(tipoPagamento); // Factory
        pagamento.pagar(total);
        notificar("Compra de " + produto + " por R$ " + total); // Observer
    }

    private void notificar(String mensagem) {
        for (Observador o : observadores) {
            o.atualizar(mensagem);
        }
    }
}
