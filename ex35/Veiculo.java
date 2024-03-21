package Java.exercícios.ex35;

public class Veiculo{

    // Definindo os atributos
    private String veiculo;
    private String marca;
    private double velocidade;

    // Criando o constructor
    public Veiculo(String marca, double velocidade){

        this.marca = marca;
        this.velocidade = velocidade;

    }

    public Veiculo(String veiculo, String marca, double velocidade){

        this.veiculo = veiculo;
        this.marca = marca;
        this.velocidade = velocidade;

    }

    // Getters
    public String getVeiculo(){
        return veiculo;
    }

    public String getMarca(){
        return marca;
    }

    public double getVel(){
        return velocidade;
    }

    // Método genérico
    public void acelerar(){
        System.out.println("O veículo acelerou!");
    }

    public void desacelerar(){
        System.out.println("O veículo desacelerou!");
    }

}