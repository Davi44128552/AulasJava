package Java.exercícios.ex33;

public class ex33 {

    public static void main(String[] args){

        Carro carro = new Carro(64);
        Bicicleta bike = new Bicicleta(10);

        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = carro;
        veiculos[1] = bike;

        for (Veiculo i : veiculos){
            i.acelerar();
        }

    }
    
}
