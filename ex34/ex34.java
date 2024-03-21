package Java.exercícios.ex34;
import java.util.Scanner;

public class ex34 {

    public static void main(String[] args){

        // Criando o scanner
        Scanner scanner = new Scanner(System.in);

        // Criando o objeto (Por enquanto indefinido)
        Humano pessoa; // Indefinido

        // Deixando o usuário decidir
        System.out.println("Você é: ");
        System.out.println(" [ 1 ] Menino \n [ 2 ] Menina \n [ 3 ] Outro");

        int escolha = scanner.nextInt();

        // Resultado
        if (escolha == 1){

            // Especificando agora a classe
            pessoa = new Menino(); // Especificação da subclasse
            pessoa.genero();

        }

        else if (escolha == 2){

            // Especificando agora a classe
            pessoa = new Menina(); // Especificação da subclasse
            pessoa.genero();

        }

        else if (escolha == 3){

            // Especificando agora a classe
            pessoa = new Humano(); // Escolhendo a classe pai
            pessoa.genero();

        }

        else{
            System.out.println("COMANDO INVÁLIDO!!!");
        }

        // Fechando o scanner
        scanner.close();

    }
    
}
