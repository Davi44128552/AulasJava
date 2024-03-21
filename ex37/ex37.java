package Java.exercícios.ex37;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class ex37 {

    public static void main(String[] args){

        // Criando o scanner
        Scanner scanner = new Scanner(System.in);

        // INTRO
        System.out.println("\tCALCULADORA DE NOTAS");

        try{

            // Solicitando o número de alunoas
            System.out.print("Digite o número de alunos: ");
            int n_alunos = scanner.nextInt();
            System.out.println();

            // Criando listas de aluno
            ArrayList<String> alunos = new ArrayList<>();

            // Criação das variáveis que serão iteradas
            String aluno;
            double nota = 0;

            // Adição de nomes e de notas
            for (int i = 0; i < n_alunos; i++){

                // Adicionando os nomes 
                System.out.print("Digite o nome do aluno: ");
                aluno = scanner.next();
                alunos.add(aluno);

                // Somando as notas
                System.out.printf("Digite a nota de %s: ", aluno);
                nota += scanner.nextDouble();

                System.out.println();

            }

            // Cálculo final da nota
            double media = nota / n_alunos;

            // Saída
            System.out.println("Turma: " + alunos);
            System.out.println("Média da turma: " + media);

        }

        // Tratando erros
        catch(InputMismatchException e){ // Tratando erro de tipo errado
            System.out.println("O termo escrito não é um número!");
        }

        // Fim
        finally{
            System.out.println("\nObrigado pela preferência =) ");
        }

        scanner.close();

    }
    
}
