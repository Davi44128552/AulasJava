package Java.exercícios.ex19;

public class Animal {


    // Criando os metodos
        // exibirInfo
    void exibirInfo(Cachorro cao){

        System.out.printf("Nome do animal: %s \n", cao.nome);
        System.out.printf("Idade do animal: %d anos \n", cao.idade);

    }

    void exibirInfo(Gato cat){

        System.out.printf("Nome do animal: %s \n", cat.nome);
        System.out.printf("Idade do animal: %d anos \n", cat.idade);

    }

        // emitirSom
    void emitirSom(Cachorro cao){

        System.out.println(cao.nome + " proferiu: Au Au!");

    }

    void emitirSom(Gato cat){

        System.out.println(cat.nome + " proferiu: Miau!");

    }


    
}
