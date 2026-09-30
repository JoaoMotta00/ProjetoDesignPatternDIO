package pagamento;

import interfaces.Pagamento;

public class PagamentoFactory {

    public static Pagamento criar(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "cartao" -> new PagamentoCartao();
            case "pix" -> new PagamentoPix();
            default -> throw new IllegalArgumentException("Tipo de pagamento inválido: " + tipo);
        };
    }
}
