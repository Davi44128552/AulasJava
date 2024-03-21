package Java.exercícios.ex12;
import javax.swing.JOptionPane;

public class Humano {

    // Declarando as variaveis
    String nome;
    char sexo;
    int idade;
    boolean dormir;

    // Criando o constructor
    Humano(String nome, char sexo, int idade, boolean dormir){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.dormir = dormir;
    }

    // Criando os metodos
    void acordar(){
        if (dormir == false){
            JOptionPane.showMessageDialog(null, this.nome + " ja esta acordado");
        }

        else{
            JOptionPane.showMessageDialog(null, this.nome + " acordou");
            dormir = false;
        }
    }
    
}
