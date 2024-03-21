package Java.aula.aula29;

public class ex29 {

    public static void main(String[] args){

        /* Encapsulamento = Atributos de uma classe que serão escondidas ou privadas
           Podem ser acessados apenas por métodos (getters e setters)
           Recomendado criar os atributos como privado, caso não seja necessário acessá-los em outra classe */

        // Criando o objeto
        Carro carro = new Carro("Volkswagen", "Gol", 2010);

        // Acessando os dados (pelos getters)
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());

            // ! -> Se o constructor for público, não é necessário criar o méttodo getter

        System.out.println();

        // Modificando os dados (pelos setters)
        carro.setMarca("Chevrolet");
        carro.setModelo("Camaro");
        carro.setAno(2016);

        // Acessando os dados (pelos getters)
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());


    }
    
}
