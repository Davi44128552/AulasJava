package Java.exercícios.ex8;
import java.util.Scanner;


public class ex8 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Apresentação do jogo
        System.out.println("\tTRIVIA GAME!");

        // Nome do jogador

        String player = "";

        while(player.length()< 5){
            System.out.print("Digite o nome do jogador: ");
            player = scanner.nextLine();

            if (player.length() < 5){
                System.out.println("Digite um nome maior, por favor");
            }

        }

        // Perguntas e Respostas
        String[] perguntas = new String[5];
        perguntas[0] = "\nO que e Java? \na) Uma ilha \nb) Uma linguagem da programacao \nc) Um cafe";
        perguntas[1] = "\nQual a funcao de variaveis? \na) Armazenar dados \nb) Fazer café \nc) Criar graficos";
        perguntas[2] = "\nComo solicita entrada em Java? \na) console.log() \nb) Scanner.nextLine() \nc) userInput()";
        perguntas[3] = "\nQual é a diferenca entre == e .equals()? \na) Referencias e conteudos \nb) tipos \nc) Nada";
        perguntas[4] = "\nComo declarar matriz em Java? \na) int[] numbers = {1, 2, 3} \nb) numbers = [1, 2, 3] \nc) Nao existe";

        String[] respostas = {"b", "a", "b", "a", "a"};

        int contador = 0;

        // Criando campo das respostas
        String[] respostas_player = new String[5]; 

        // Apresentando as perguntas
        for (int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);
            respostas_player[i] = scanner.nextLine();

            // Analisando a resposta
            if (respostas_player[i].equalsIgnoreCase(respostas[i])){
                contador++;
            }

        }

        // Resultado
        if (contador >= 3){
            System.out.println("Parabens!!! Voce e muito inteligente");
        }

        else{
            System.out.println("Que pena!!! Estude mais");
        }

        scanner.close();

    }
    
}
