package Java.exercícios.ex38;
import java.util.Scanner;

public class ex38 {

    public static void main(String[] args){

        /* ! OBS.: Por usar scanner em diferentes métodos, é recomendável que o scanner seja usado no main
                   E os métodos que precisem dele tenham ele como argumento */

        Scanner scanner = new Scanner(System.in);

        // Criando um objeto teste
        ContaBancaria conta = new ContaBancaria(123456, 35000);

        // Testando os getters
        System.out.println(conta.getConta());
        System.out.println(conta.getSaldo()); 

        // Consultando saldo inicial
        conta.consultarSaldo();
        
        // Depositando uma quantia
        conta.depositar(scanner);
        conta.consultarSaldo();

        // Sacando uma quantia
        conta.sacar(scanner);
        conta.consultarSaldo();

        scanner.close();

    }
    
}
