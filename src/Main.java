import configuracao.Configuracao;
import desconto.SemDesconto;
import loja.Loja;
import observador.EmailObservador;
import observador.EstoqueObservador;

public class Main {

    public static void main(String[] args) {
        // Singleton
        System.out.println("=== " + Configuracao.getInstance().getNomeLoja() + " ===\n");

        Loja loja = new Loja();
        loja.adicionarObservador(new EmailObservador());
        loja.adicionarObservador(new EstoqueObservador());

        System.out.println("--- Compra 1: sem desconto, cartão ---");
        loja.comprar("Teclado", 200.00, new SemDesconto(), "cartao");

        System.out.println("\n--- Compra 2: 10% de desconto, PIX ---");
        loja.comprar("Mouse", 100.00, new Configuracao.DescontoDezPorCento(), "pix");
    }
}
