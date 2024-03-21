package Java.exercícios.ex21;

public class ex21 {

    public static void main(String[] args){

        // Criando os objetos
        FiguraGeometrica calculadora = new FiguraGeometrica();
        Retangulo2 retangulo = new Retangulo2(10, 15);
        Circulo2 circulo = new Circulo2(5);

        // Testando os metodos
            // O principal
        calculadora.calcularArea();

            // O retangulo
        retangulo.calcularArea();

            // O circulo
        circulo.calcularArea();

    
    }

}