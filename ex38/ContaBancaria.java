package Java.exercícios.ex38;
import java.util.Scanner;

public class ContaBancaria {

    // Declarando as variáveis
    private int conta;
    private double saldo;

    // Criando o construtor
    public ContaBancaria(int conta, double salario){

        this.setConta(conta);
        this.setSaldo(salario);

    }

    // Criando os getters
    public int getConta(){
        return conta;
    }

    public double getSaldo(){
        return saldo;
    }

    // Criando os setters
    public void setConta(int conta){
        this.conta = conta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    // Criando métodos específicos
        // Método de consultar o saldo
    public void consultarSaldo(){
        System.out.printf("O saldo da conta de número %d é de R$ %.2f \n", conta, saldo);
    }

        // Método de depositar
    public void depositar(Scanner scanner){


        System.out.print("Quanto você deseja depositar? ");
        saldo += scanner.nextDouble();
        System.out.println("Quantidade depositada!");

        // Fechando o scanner

    }

        // Método de sacar
    public void sacar(Scanner scanner){

        try{

            // Abrindo o scanner

            System.out.print("Quanto você deseja sacar? ");
            saldo -= scanner.nextDouble();
            System.out.println("Quantidade sacada!");

            // Fechando o scanner

            // Criando a condição de o valor desejado para saque ser maior do que possui na conta
            if (saldo < 0){
                throw new SaldoInsuficienteException(); // throw new = Lança o erro
            } 

        }

        catch(SaldoInsuficienteException e){
            System.out.println("Desculpa, mas você não possui saldo suficiente");
        }
        

    }

}
