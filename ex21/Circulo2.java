package Java.exercícios.ex21;

public class Circulo2 extends FiguraGeometrica {

    // Declarando as variaveis
    double raio;

    // Criando o constructor
    Circulo2(double raio){

        this.raio = raio;

    }

    // Criando o proprio metodo
    void calcularArea(){

        double area = (Math.PI) * ((raio) * (raio));
        System.out.println("A area do circulo e " + area);

    }
}
