package Java.exercícios.ex19;

public class ex19 {

    public static void main(String[] args){

        // Criando os objetos
        Cachorro dog = new Cachorro("Horus", 2);
        Gato cat = new Gato("Mini", 2);

        // Testando os metodos
        dog.exibirInfo(dog);
        cat.exibirInfo(cat);

        System.out.println();

        dog.emitirSom(dog);
        cat.emitirSom(cat);

    }
    
}
