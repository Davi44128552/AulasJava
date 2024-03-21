package Java.aula.aula10;
import java.util.ArrayList;

public class aula10 {

    public static void main(String[] args){

        // Matriz de wrappers
        // Podemos mudar o tamanho
        // ArrayList podem ser printados sem precisar de loop

        // Criando a matriz
        ArrayList<ArrayList<String>> restaurante = new ArrayList<ArrayList<String>>();

        // Lista do bolo

        System.out.println("\tBOLO");
        ArrayList<String> lista_de_bolo = new ArrayList<String>(); 
        lista_de_bolo.add("massa");
        lista_de_bolo.add("pao de alho");
        lista_de_bolo.add("donuts");

        System.out.println(lista_de_bolo);

        // Legumes

        System.out.println("\n\tLEGUMES");
        ArrayList<String> legumes = new ArrayList<String>();
        legumes.add("pimentao");
        legumes.add("abobrinha");
        legumes.add("tomate");

        System.out.println(legumes);

        // Bebidas

        System.out.println("\n\tBEBIDAS");
        ArrayList<String> bebidas = new ArrayList<String>();
        bebidas.add("cerveja");
        bebidas.add("agua");
        bebidas.add("suco");

        System.out.println(bebidas);

        // Adicionando as colunas à matriz
        restaurante.add(lista_de_bolo);
        restaurante.add(legumes);
        restaurante.add(bebidas);

        System.out.println("\n\tMATRIZ");
        System.out.println(restaurante);

        // Obter determinada coluna da matriz
            // Coluna 1
        System.out.println("\n\tCOLUNA 1");
        System.out.println(restaurante.get(0));

        System.out.println("\n\tCOLUNA 2");
        System.out.println(restaurante.get(1));

        System.out.println("\n\tCOLUNA 3");
        System.out.println(restaurante.get(2));

    }
    
}
