package Java.aula.aula24;


public class aula24 {

    public static void main(String[] args){

        /*  inheritance = Uma classe recebe os atributos e metodos de outra classe
              Vantagem = Nao precisa aplicar o mesmo metodo e atributo para varios objetos repetidamente */

        // Criando o primeiro objeto
        aula24_o1 carro = new aula24_o1();
        carro.ir(); // Aplicando os metodos de outra classe
        carro.parar();

        // Criando o segundo objeto
        aula24_o2 bicicleta = new aula24_o2();
        bicicleta.ir();
        bicicleta.parar();

    }
    
}
