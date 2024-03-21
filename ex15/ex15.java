package Java.exercícios.ex15;
import java.util.ArrayList;

public class ex15 {

    public static void main(String[] args){

        // Simples ArrayList
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Matriz ArrayList
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<ArrayList<Integer>>();
        matriz.add(numeros);

        // Testando
        System.out.println(numeros);
        System.out.println(matriz);

        // Vetor comum
        int[] numeros2 = new int[3];
        numeros2[0] = 1;
        numeros2[1] = 2;
        numeros2[2] = 3;

        // matriz comum
        int[][] matriz2 = new int[1][1];
        matriz2[0] = numeros2;

        // Testando
        for (int i : numeros2){
            System.out.println(i);
        }

        for (int i[] : matriz2){
            for (int j : i){
                System.out.println(j);
            }
        }



    }
    
}
