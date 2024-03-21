package Java.exercícios.ex14;
import java.util.Random;
import java.util.Scanner;

public class Jogador {

    // Chamando random e scanner
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    // Criando as características so player
    String nome;
    int idade;
    double altura;
    int vida = 100;

    // Criando o construtor
    Jogador(String nome, int idade, double altura){

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }

    // Criando os metodos
    void atacar(int vida_inimigo){
        while (vida_inimigo > 0 && vida > 0){
            // Variaveis da batalha
            String escolha;
            int dano;

            // Status
            System.out.println("Sua vida: " + vida);
            System.out.println("Vida do inimigo: " + vida_inimigo);

            // Acao
            System.out.println("Qual ataque voce deseja realizar?");
            System.out.println(" a) Soco \n b) Chute");
            escolha = scanner.nextLine();

            // Soco
            if (escolha.equalsIgnoreCase("a")){

                dano = random.nextInt(0, 15);
                System.out.printf("Voce deu %d de dano \n", dano);
                vida_inimigo = vida_inimigo - dano;

            }

            // Chute
            else if (escolha.equalsIgnoreCase("b")){

                dano = random.nextInt(15, 25);
                System.out.printf("Voce deu %d de dano \n", dano);
                vida_inimigo = vida_inimigo - dano;

            }

            
            
        }

        if (vida_inimigo <= 0){

            System.out.println("Parabens! Voce matou o monstro!");

        }

    }

}
