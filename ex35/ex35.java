package Java.exercícios.ex35;
import java.util.Scanner;

public class ex35 {

    public static void main(String[] args){

        // Criando o scanner
        Scanner scanner = new Scanner(System.in);

        // Criando objeto
        Veiculo veiculo1; // Scanner

        // Declarando as variáveis gerais
        String veiculo;
        String marca;
        double velocidade;

        // Testando
            // Scanner
        System.out.println("Qual dessas opções você gostaria?");
        System.out.println(" [ 1 ] Carro \n [ 2 ] Bicicleta \n [ 3 ] Outro");
        int escolha = scanner.nextInt();

        if (escolha == 1){

            System.out.print("Digite a marca do carro: ");
            marca = scanner.next();

            System.out.print("Digite a velocidade do carro: ");
            velocidade = scanner.nextDouble();

            veiculo1 = new Carro(marca, velocidade);
            veiculo1.acelerar();
            veiculo1.desacelerar();

        }

        else if (escolha == 2){

            System.out.print("Digite a marca da bicicleta: ");
            marca = scanner.next();

            System.out.print("Digite a velocidade do carro: ");
            velocidade = scanner.nextDouble();

            veiculo1 = new Bicicleta(marca, velocidade);
            veiculo1.acelerar();
            veiculo1.desacelerar();

        }

        else if (escolha == 3){

            System.out.print("Digite o nome do veículo: ");
            veiculo = scanner.next();

            System.out.print("Digite a marca deste veículo: ");
            marca = scanner.next();

            System.out.print("Digite a velocidade deste veículo: ");
            velocidade = scanner.nextDouble();

            veiculo1 = new Veiculo(veiculo, marca, velocidade);
            veiculo1.acelerar();
            veiculo1.desacelerar();


        }

        scanner.close();


    }
    
}
