package Java.exercícios.ex33;

public class Bicicleta extends Veiculo{

    // Criando o constructor
    Bicicleta(double velocidade){

        super(velocidade);

    }

    // Criando o método
    @Override
    public void acelerar(){
        System.out.println("A bicicleta está acelerando!");
    }
    
}
