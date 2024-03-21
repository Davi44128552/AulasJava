package Java.aula.aula23;

public class aula23c {

    // Declarando as variaveis
    String nome;

        // Criando uma variavel static
    static int contador_amigos; /* Se nao tivesse "static", cada objeto teria essa variavel
                                 Variavel geral para a classe*/

    // Criando o constructor
    aula23c(String nome){

        this.nome = nome;
        contador_amigos++;

    }

    // Criando um metodo static
    static void cont_amigos(){

        System.out.printf("Voce tem %d amigos", contador_amigos);

    }
    
}
