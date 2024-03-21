package Java.exercícios.ex18;
import java.util.ArrayList;

public class ex18 {

    public static void main(String[] args){

        // Criando um ArrayList de nomes
        ArrayList<String> nomes = new ArrayList<String>();

        // Adicionando alguns nomes
        nomes.add("Davi");
        nomes.add("Iasmim");
        nomes.add("Jose Vinicius");
        System.out.println(nomes);

        // Removendo um nome
        nomes.remove("Jose Vinicius");
        System.out.println(nomes);

        // Tamanho
        System.out.println(nomes.size());


    }
    
}
