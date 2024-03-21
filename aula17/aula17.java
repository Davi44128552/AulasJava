package Java.aula.aula17;

public class aula17 {

    public static void main(String[] args){

        /* Constructor = Funciona como um struct
        Poder receber parametros no main e criar objetos a partir daí */

        // Criando um objeto a partir do constructor
        aula17c humano = new aula17c("Davi", 18, 1.60);

            // Analisando seus dados(informados no main)
        System.out.println(humano.nome);
        System.out.println(humano.idade);
        System.out.println(humano.altura);

            // Testando os metodos
        humano.comer();
        humano.beber();

        System.out.println();

        // Criando outro objeto com outros parametros
        aula17c humano2 = new aula17c("Iasmim", 19, 1.68);

            // Analisando os dados do segundo objetoi
        System.out.println(humano2.nome);
        System.out.println(humano2.idade);
        System.out.println(humano2.altura);

            // Testando os metodos
        humano2.comer();
        humano2.beber();


    }
    
}
