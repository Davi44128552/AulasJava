package Java.exercícios.ex24;

public class Estudante extends Pessoa {

    // Declarando as variaveis
    String curso;

    // Criando o constructor
    Estudante(String nome, int idade, String curso){

        super(nome,idade);
        this.curso = curso;

    }

    // Criando o metodo especifico
    @Override
    void apresentacao(){
        System.out.printf("Este é %s! Ele estuda %s! \n", nome, curso);
    }

}
