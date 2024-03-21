package Java.exercícios.ex33;

public class Carro extends Veiculo{

    // Constructor
    Carro(double velocidade){

        super(velocidade);
        
    }

    // Declarando o método
    @Override
    public void acelerar(){
        System.out.println("O carro está acelerando!");
    }
    
}
