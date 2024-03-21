package Java.exercícios.ex4;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Declarando a lista
        int[] lista = new int[5];

        // Atribuindo os valores à lista
        for (int i = 0; i < lista.length; i++){
            System.out.print("Digite o " + (i + 1) + "º termo da lista: ");
            lista[i] = scanner.nextInt();
        }

        // Lista
        System.out.println("\tLISTA");
        
        for (int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }

        // Análise
        int maior = lista[0];
        int menor = lista[0];

        for (int i = 1; i < lista.length; i++){
            if (lista[i] > maior){
                maior = lista[i];
            }

            else if (lista[i] < menor){
                menor = lista[i];
            }
        }

        // Saída
        System.out.println("\tRESULTADO");

        System.out.println("Maior: " + maior); 
        System.out.println("Menor: " + menor); 

        scanner.close();

    }
    
}
