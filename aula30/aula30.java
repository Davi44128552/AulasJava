package Java.aula.aula30;

public class aula30 {

    public static void main(String[] args){

        /* Copiando objetos = Precisamos criar métodos ou constructors na classe */

        // Criando um objeto qualquer
        Carro carro1 = new Carro("Volksvagen", "Gol", 2010);

            // Pritando os valores desse carro
        System.out.println(carro1); // Endereço
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAno());

        System.out.println();

        // Criando outro objeto que copia pelo constructor
        Carro carro2 = new Carro(carro1);

            // Printando os valores desse carro
        System.out.println(carro2); // Endereço
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAno());

        System.out.println();

        // Criando outra cópia pelos métodos
        Carro carro3 = new Carro("Chevrolet", "Camaro", 2014);

            // Printando os valores iniciais
        System.out.println(carro3); // Endereço
        System.out.println(carro3.getMarca());
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getAno());

        System.out.println();

            // Atribuindo os valores de 1 como cópia
        carro3.copiar(carro1);

            // Printando os novos valores
        System.out.println(carro3); // Endereço
        System.out.println(carro3.getMarca());
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getAno());

    }
    
}
