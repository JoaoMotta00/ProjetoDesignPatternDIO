package pagamento;

import interfaces.Pagamento;

public class PagamentoPix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pago R$ " + valor + " via PIX.");
    }

}
