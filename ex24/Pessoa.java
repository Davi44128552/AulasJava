package Java.exercícios.ex24;

public class Pessoa {

    // Declarando as variaveis
    String nome;
    int idade;

    // Criando o constructor
    Pessoa(String nome, int idade){

        this.nome = nome;
        this.idade = idade;

    }

    // Criando um metodo
    void apresentacao(){
        System.out.printf("Esta é %s! Ela é bem legal :)");
    }
    
}
