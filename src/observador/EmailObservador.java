package observador;

import interfaces.Observador;

public class EmailObservador implements Observador {

    @Override
    public void atualizar(String mensagem) {

        System.out.println("[E-MAIL] " + mensagem);
    }
}
