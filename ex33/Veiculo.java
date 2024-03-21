package Java.exercícios.ex33;

public abstract class Veiculo {

    // Definindo os atributos
    private double velocidade;

    // Criando o constructor
    Veiculo(double velocidade){

        this.setVel(velocidade);

    }

    // Getter
    public double getVel(){
        return velocidade;
    }

    // Setter
    public void setVel(double velocidade){
        this.velocidade = velocidade;
    }

    // Criando o copy
    public void copiar(Veiculo veiculo){
        this.velocidade = veiculo.velocidade;
    }

    // Declarando o método de acelerar
    public abstract void acelerar();
    
}
