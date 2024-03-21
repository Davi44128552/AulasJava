package Java.exercícios.ex26;

public class Cilindro extends FormaGeometrica {

    // Criando o constructor
    Cilindro(double raio, double altura){
        super(raio, altura);
    }

    // Criando o método anteriormente criado no abstract
    void calcularVolume(){

        double volume = (Math.PI) * (Math.pow(raio, 2)) * (altura);
        System.out.printf("O volume do cilindro vale %.2f \n", volume);

    }
    
}
