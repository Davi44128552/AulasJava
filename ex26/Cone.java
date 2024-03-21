package Java.exercícios.ex26;

public class Cone extends FormaGeometrica{

    // Criando o constructor
    Cone(double raio, double altura){
        super(raio, altura);
    }

    // Criando o método anteriormente criado no abstract
    void calcularVolume(){

        double volume = ((Math.PI) * (Math.pow(raio, 2)) * (altura)) / 3;
        System.out.printf("O volume do cone vale %.2f \n", volume);

    }
    
}
