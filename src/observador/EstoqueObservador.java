package observador;

import interfaces.Observador;

public class EstoqueObservador implements Observador {
    @Override
    public void atualizar(String mensagem) {

        System.out.println("[ESTOQUE] Atualizando estoque após: " + mensagem);

    }
}
