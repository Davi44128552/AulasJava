package Java.aula.aula26;

public class aula26_o2 extends aula26_o1{

    // Declarando suas variaveis
    String poder;

    // Criando o constructor
    aula26_o2(String nome, int idade, String poder){
        super(nome, idade); // Atribui os valores dados pela classe principal(aula26_o1)
        this.poder = poder;
    }

    // Criando o metodo toString() para esta subclasse
    public String toString(){
        return super.toString() + this.poder + "\n";
    }

}