package Java.exercícios.ex25;

public class Carro extends Veiculo {

    // Declarando as variáveis
    String modelo;
    int ano;
    boolean parado = true;

    // Criando o constructor
    Carro(String modelo, int ano){

        this.modelo = modelo;
        this.ano = ano;

    }

    // Criando o método (Previsto no veículo)
    void acelerar(){

        if (parado){
            System.out.println("O carro está acelerando");
            parado = false;
        }

        else{
            System.out.println("O carro já está andando");
        }

    }

    void frear(){

        if (parado){
            System.out.println("O carro já está parado");
        }

        else{
            System.out.println("O carro parou");
            parado = true;
        }

    }
    
}
