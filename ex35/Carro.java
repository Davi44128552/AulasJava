package Java.exercícios.ex35;

public class Carro extends Veiculo{

    // Criando o construtor
    Carro(String marca, double velocidade){
        super(marca, velocidade);
    }

    // Sobrescrevendo os métodos
    @Override
    public void acelerar(){
        System.out.println("O carro acelerou!");
    }

    @Override
    public void desacelerar(){
        System.out.println("O carro desacelerou!");
    }
    
}
