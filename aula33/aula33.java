package Java.aula.aula33;
import java.util.Scanner;

public class aula33{

    public static void main(String[] args){

        /* Polimorfismo dinâmico = Polimorfismo funcionando após a compilação */

        // Chamando o scanner
        Scanner scanner = new Scanner(System.in);

        // Criando o objeto (primeiramente indefinido)
        Animal animal; // Chamo como o geral

        // Deixando o usuário escolher
        System.out.println("Qual animal você escolheria?");
        System.out.println(" [ 1 ] Cachorro \n [ 2 ] Gato");

        int escolha = scanner.nextInt();

        // Resultado
        if (escolha == 1){

            animal = new Cachorro(); // Definido especificamente qual é a classe
            animal.falar();

        }

        else if (escolha == 2){

            animal = new Gato(); // Definido especificamente qual é a classe
            animal.falar();

        }

        else{

            animal = new Animal(); // Definido especificamente qual é a classe
            animal.falar();

        }

        // Fechando o scanner
        scanner.close();

    }

}