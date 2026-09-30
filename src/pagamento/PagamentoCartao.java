package pagamento;

import interfaces.Pagamento;

public class PagamentoCartao implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pago R$ " + valor + " no cartão.");
    }

}
