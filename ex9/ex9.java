package Java.exercícios.ex9;
import java.util.Scanner;

public class ex9 {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\tVOCE PODE VOTAR?");

        System.out.print("Digite o ano em que voce nasceu: ");
        int nascimento = scanner.nextInt();
        voto(nascimento);

        scanner.close();

    }

    static void voto(int ano){

        int idade = 2023 - ano;

        if (idade < 16){
            System.out.println("Voce nao tem idade para votar");
        }

        else if (idade >= 16 && idade < 18){
            System.out.println("Voce pode votar, mas so se voce quiser");
        }

        else{
            System.out.println("Voce tem que votar, nao tem opcao");
        }
    }
    
}
