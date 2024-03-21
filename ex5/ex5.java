package Java.exercícios.ex5;
import java.util.Random;

public class ex5 {

    public static void main(String[] args){

        Random random = new Random();

        int[] lista = new int[5];
        for (int i = 0; i < lista.length; i++){
            lista[i] = random.nextInt(500);
        }

        // Imprimindo lista inicial
        System.out.println("\tLISTA INICIAL");

        for (int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }

        // Insertion sort
        for (int j = 1; j < lista.length; j++){
            int termo = lista[j];
            int i = j - 1;

            while (i >= 0 && lista[i] > termo){
                lista[i + 1] = lista[i];
                i--;
            }

            lista[i + 1] = termo;
        }

        // Imprimindo a lista ordenada
        System.out.println("\tLISTA ORDENADA");

        for (int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }

    }
    
}
