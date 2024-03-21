package Java.exercícios.ex32;

public class ex32 {

    public static void main(String[] args){

        // Criando os objetos
        Cachorro cao = new Cachorro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        // Criando a lista
        Animal[] fazenda = {cao, gato, vaca};

        // Printando a lista
        for (Animal i : fazenda){

            i.emitirSom();

        }

    }
    
}
