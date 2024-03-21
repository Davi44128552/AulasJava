package Java.exercícios.ex21;

public class Retangulo2 extends FiguraGeometrica {

    // Declarando as variaveis
    double largura;
    double altura;

    // Criando o constructor
    Retangulo2(double largura, double altura){

        this.largura = largura;
        this.altura = altura;

    }

    // Criando o proprio metodo
    void calcularArea(){

        double area = (largura) * (altura);
        System.out.println("A area do retangulo e " + area);

    }
    
}
