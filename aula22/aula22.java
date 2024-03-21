package Java.aula.aula22;

public class aula22 {

    public static void main(String[] args){

        // Alguns objetos podem ter metodos que usam outras classes

        // Chamando o objeto com metodo
        aula22o2 garagem = new aula22o2();

        // Criando objetos de carros
        aula22o1 carro1 = new aula22o1("BMW");
        aula22o1 carro2 = new aula22o1("Onix");
        aula22o1 carro3 = new aula22o1("Gol");

        // Aplicando os metodos de uma classe a outra
        garagem.estacionar(carro1);
        garagem.estacionar(carro2);
        garagem.estacionar(carro3);

    }
    
}
