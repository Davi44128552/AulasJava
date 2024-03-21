package Java.exercícios.ex24;

public class Professor extends Pessoa {

    // Declarando as variaveis
    String disciplina;

    // Criando o constructor
    Professor(String nome, int idade, String disciplina){

        super(nome, idade);
        this.disciplina = disciplina;

    }

    // Criando o metodo especifico
    @Override
    void apresentacao(){
        System.out.printf("Este é %s! E ele leciona %s! \n", nome, disciplina);
    }
    
}
