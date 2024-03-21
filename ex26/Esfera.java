package Java.exercícios.ex26;

public class Esfera extends FormaGeometrica {

    // Criando o constructor
    Esfera(double raio){
        super(raio);
    }

    // Criando o método anteriormente criado no abstract
    void calcularVolume(){

        double volume = (4/3) * (Math.PI) * (Math.pow(raio, 3));
        System.out.printf("O volume da esfera vale %.2f \n", volume);

    }
    
}
