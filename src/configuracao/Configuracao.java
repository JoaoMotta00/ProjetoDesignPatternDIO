package configuracao;

import interfaces.Desconto;

public class Configuracao {

    private static final Configuracao INSTANCIA = new Configuracao();

    private final String nomeLoja = "loja.Loja Design Patterns";

    private Configuracao() { }

    public static Configuracao getInstance() {
        return INSTANCIA;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public static class DescontoDezPorCento implements Desconto {
        @Override
        public double aplicar(double valor) {
            return valor * 0.90;
        }
    }
}
