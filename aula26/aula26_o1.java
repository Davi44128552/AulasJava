package Java.aula.aula26;

public class aula26_o1 {

    // Declarando suas variaveis
    String nome;
    int idade;

    // Criando o constructor
    aula26_o1(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Criando o metodo toString() na classe superior
    public String toString(){ // public sera necessario neste caso
        return this.nome + "\n" + this.idade  + "\n";
    }
    
}
