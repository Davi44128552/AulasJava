package Java.exercícios.ex26;

public abstract class FormaGeometrica {

    // Declarando as variáveis
    double raio;
    double altura;

    // Criando os constructors
        // Constructor do cone e do cilindro
    FormaGeometrica(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

        // Constructor da esfera
    FormaGeometrica(double raio){
        this.raio = raio;
    }


    // Criando o método abstrato
    abstract void calcularVolume();
    
}
