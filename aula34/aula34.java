package Java.aula.aula34;
import java.util.Scanner;
import java.util.InputMismatchException;

public class aula34 {

    public static void main(String[] args){

        /* Exceção = Um evento que ocorre durante a execução de um programa que,
                     rompe com o funcionamento normal das instruções */

        // Criando o scanner
        Scanner scanner = new Scanner(System.in);

        // Criando um algoritmo com uma possível falha
        try { // Tentar executar o programa corretamente

            System.out.print("Digite um número qualquer como dividendo: ");
            int x = scanner.nextInt();

            System.out.print("Digite outro número para ser o divisor: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.printf("A divisão de %d por %d resultou em %d \n \n", x, y, z);

            /* ! -> Caso y seja 0, o algoritmo dará erro. Trataremos disso
             ! -> Tipo de erro: ArithmeticException */

            /* ! -> Caso seja dado algum valor diferente de numeral 
             ! -> Tipo de erro: InputMismatchException 
             ! -> Neste caso, será necessária importação */

        }

        // Consertando o erro ArithmeticException
        catch(ArithmeticException e){ // Pegando o tipo de erro (como se fosse um "if" para erros)
            System.out.println("Você não pode dividir um número por 0, seu bocó \n"); // Tratando o erro
        }

        // Consertando o erro InputMismatchException
        catch(InputMismatchException e){
            System.out.println("Eu pedi um número, oh Animal \n"); // Tratando o erro
        }

        // Catch geral (Trata todos os erros)
        // ! -> É recomendado tratar cada erro, como uma boa prática de programação
        catch(Exception e){
            System.out.println("Algo deu errado :( \n");
        }

        finally{ // Comando final, independente de ter ocorrido um erro ou não
            // Recomendado abrir ou fechar documentos/objetos
            System.out.println("Muito obrigado pela sua atenção :) \n");
            scanner.close();
        }

    }
    
}
