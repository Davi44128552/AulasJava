package Java.exercícios.ex14;
import java.util.Scanner;

public class ex14 {

    public static void main(String[] args){

        // Trazendo o scanner
        Scanner scanner = new Scanner(System.in);

        // Menu do jogo
        System.out.println("\tJOGO");

        // Criação do personagem
            // Nome
        System.out.println("Qual o nome do seu personagem? ");
        String nome = scanner.nextLine();

            // Idade
        System.out.println("Qual a idade do seu personagem? ");
        int idade = scanner.nextInt();

            // Altura
        System.out.println("Qual a altura do seu personagem? ");
        double altura = scanner.nextDouble();

            // Criando o player
        Jogador jogador = new Jogador(nome, idade, altura);

        // Teste
        System.out.println("\nOh nao! Um inimigo apareceu. Vamos lutar!");
        jogador.atacar(50);

        // Fechando o scanner
        scanner.close();

    }
    
}
