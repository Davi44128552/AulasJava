package Java.exercícios.ex30;

public class Circulo implements FormaGeometrica {

    // Declarando as variáveis
    private double raio;

    // Criando o constructor
    Circulo(double raio){

        this.setRaio(raio);

    }

    // Criando o constructor de cópia
    Circulo(Circulo circulo){

        this.copiar(circulo);

    }

    // Criando os getters e setters
        // Getters
    public double getRaio(){
        return raio;
    }

        // Setters
    public void setRaio(double raio){
        this.raio = raio;
    }

    // Criando os métodos definidos no interface
        // Calcular Área
    @Override
    public void calcularArea(){

        double area = Math.PI * (raio * raio);
        System.out.printf("A área do círculo vale: %.2f u.a. \n", area);

    }

        // Calcular Perímetro
    @Override
    public void calcularPerimetro(){

        double perimetro = 2 * Math.PI * raio;
        System.out.printf("O perímetro do círculo vale: %.2f \n", perimetro);

    }

    // Criando método para copiar
    public void copiar(Circulo circulo){
        this.raio = circulo.raio;
    }
    
}
