package Java.aula.aula25;

public class aula25 {

    public static void main(String[] args){

        /*  Method overriding = Declarar um metodo em uma subclasse,
        a qual ja esta presente na classe principal,
        para que a subclasse tenha sua propria implementacao */

        // Criando o objeto
        aula25_o2 teste = new aula25_o2();

        // Testando o metodo principal
        teste.falar();
            // ! -> Ao criar o metodo especifico para a subclasse, sera aplicado o seu metodo

        // Agora criando um objeto com a classe principal e testando o metodo
        aula25_o1 teste2 = new aula25_o1();
        teste2.falar();

    }
    
}
