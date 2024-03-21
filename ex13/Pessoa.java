package Java.exercícios.ex13;

public class Pessoa {

    // Declarando as variaveis
    String nome;
    int idade;

    // Criando o construtor
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Criando a funcao de exibicao de informacoes
    void informacoes(){
        System.out.println("\tINFORMACOES");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

}
