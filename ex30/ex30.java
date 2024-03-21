package Java.exercícios.ex30;
import java.util.Scanner;

public class ex30 {

    public static void main(String[] args){

        // Criando o scanner
        Scanner scanner = new Scanner(System.in);

        // Criando as formas
            // Retângulo
        System.out.println("\t\tRETÂNGULO");
        
        System.out.print("Digite um valor para a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite um valor para a altura do retângulo: ");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println();

            // Círculo
        System.out.println("\t\tCÍRCULO");

        System.out.print("Digite um valor para o raio do círculo: ");
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println();

        // Aplicando os métodos pedidos
            // Retangulo
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        System.out.println();

            // Circulo
        circulo.calcularArea();
        circulo.calcularPerimetro();

        // Fechando o scanner
        scanner.close();

    }
    
}
