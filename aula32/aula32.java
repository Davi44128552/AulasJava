package Java.aula.aula32;

public class aula32{

    public static void main(String[] args){

        /* Polimorfismo = Habilidade de um objeto de identificar mais de uma classe */

        // Criando os objetos 
        Carro carro = new Carro();
        Bicicleta bike = new Bicicleta();
        Barco barco = new Barco();

        // Criando uma lista com os três objetos (Sendo de classes diferentes)
            // ! -> Devemos usar o que eles têm em comum: A classe pai
        Veiculo[] veiculos = {carro, bike, barco};

        // Aplicando os métodos dos objetos
            // Forma 1: 
        for (Veiculo i : veiculos){
            i.ir();
        }

    }

}