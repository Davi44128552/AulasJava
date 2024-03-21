// VETORES
package Java.aula.aula5;

public class aula5 {

    public static void main(String[] args){

        // Forma 1
        System.out.println("\tFORMA 1:");

        String[] cars = {"Camaro", "Corolla", "Corsa"};
        System.out.println(cars[0]);

        cars[0] = "Gol";
        System.out.println(cars[0]);

        // Forma 2
        System.out.println("\tFORMA 2:");

        String[] cars2 = new String[3];

        cars2[0] = "Camaro";
        cars2[1] = "Corolla";
        cars2[2] = "Corsa";
        
        System.out.println(cars2[0]);

        cars2[0] = "Gol";
        System.out.println(cars2[0]);

        // Printando todos os elementos da lista
        System.out.println("\n\tPrintando todos os elementos da lista: ");

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

    }
    
}
