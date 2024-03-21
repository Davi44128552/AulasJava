package Java.exercícios.ex7;
import java.util.Scanner;

public class ex7 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome completo: ");
        String nome = scanner.nextLine();

        // Nome maiúsculo
        String maiusculo = nome.toUpperCase();
        System.out.println("\tNome maiusculo");
        System.out.println(maiusculo +  "\n\n");

        // Nome minúsculo
        String minusculo = nome.toLowerCase();
        System.out.println("\tNome minúsculo");
        System.out.println(minusculo + "\n\n");

        // Numero de letras
        int letras = nome.length();
        System.out.println("\tQuantidade de letras");
        System.out.println(letras);

        scanner.close();

        }

    }
    

