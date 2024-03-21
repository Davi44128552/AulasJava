package Java.exercícios.ex16;

public class ex16 {

    public static void main(String[] args){

        // Criando o array
        Comidas[] geladeira = new Comidas[4];

        // Criando os objetos
        Comidas comida1 = new Comidas("Acai");
        Comidas comida2 = new Comidas("Sorvete");
        Comidas comida3 = new Comidas("Carne");
        Comidas comida4 = new Comidas("Feijao");

        // Adicionando os objetos ao array
        geladeira[0] = comida1;
        geladeira[1] = comida2;
        geladeira[2] = comida3;
        geladeira[3] = comida4;

        // Printando os valores do array
        for (int i = 0; i < geladeira.length; i++){
            System.out.println(geladeira[i].nome);
        }

    }
    
}
