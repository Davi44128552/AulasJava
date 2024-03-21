package Java.exercícios.ex35;

public class Bicicleta extends Veiculo{

    // Criando o constutor
    Bicicleta(String marca, double velocidade){
        super(marca, velocidade);
    }

    // Sobrescrevendo os métodos
    @Override 
    public void acelerar(){
        System.out.println("A bicicleta acelerou!");
    }

    @Override
    public void desacelerar(){
        System.out.println("A bicicleta desacelerou!");
    }
    
}
