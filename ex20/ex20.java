package Java.exercícios.ex20;
import java.util.Stack;

public class ex20 {

    public static void main(String[] args){

        // Criando a pilha
        Stack<Integer> pilha = new Stack<Integer>();

        // Empilhando alguns valores
        pilha.push(5);
        pilha.push(10);
        pilha.push(15);

        // Imprimindo a pilha
        System.out.println(pilha);

        // Removendo um item da pilha
        pilha.pop();

        // Imprimindo a pilha
        System.out.println(pilha);

        // Verificando se a pilha esta vazia
        System.out.println(pilha.empty());

        // Empilhando mais valores
        pilha.push(20);
        pilha.push(25);

        // Imprimindo o resultado final
        System.out.println(pilha);
    
    }
}