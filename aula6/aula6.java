// Aula 6: matrizes
package Java.aula.aula6;
import java.util.Scanner;

public class aula6 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // FORMA 1
        // Declarando a matriz
        int[][] numeros = new int[3][3];

        // Adicionando valores(adicionados pelo usuário)
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.println("Digite o termo da linha " + (i + 1) + " e da coluna " + (j + 1));
                numeros[i][j] = scanner.nextInt();
            }
        }

        // Printando
        System.out.println("\tNUMEROS");

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }

            System.out.println("\n");
        }

        // FORMA 2
        String[][] carros = {
            {"Gol", "Corolla"}, 
            {"Corsa", "Camaro"}, 
            {"Palio", "Uno"}
        };

        for (int i = 0; i < carros.length; i++){
            for (int j = 0; j < carros[i].length; j++){
                System.out.print(carros[i][j] + " ");
            }

            System.out.println("\n");
        }

        scanner.close();

    }

    
}
