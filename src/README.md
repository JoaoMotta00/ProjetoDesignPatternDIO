# Projeto simples de Design Patterns em Java

| Padrão    | Arquivos                                        |
|-----------|-------------------------------------------------|
| Singleton | configuracao.Configuracao.java                               |
| Factory   | interfaces.Pagamento*.java, pagamento.PagamentoFactory.java          |
| Strategy  | interfaces.Desconto.java, desconto.SemDesconto, configuracao.Configuracao.DescontoDezPorCento |
| Observer  | interfaces.Observador.java, observador.EmailObservador, observador.EstoqueObservador |

`loja.Loja.java` junta tudo e `Main.java` executa a demonstração.

## Como executar (precisa só do JDK)

    javac *.java
    java Main
