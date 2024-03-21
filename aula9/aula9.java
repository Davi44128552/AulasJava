package Java.aula.aula9;
import java.util.ArrayList; // Importação necessária para usar 

public class aula9 {

    public static void main(String[] args){

        /* ArrayList: É uma lista que pode mudar de tamanho a qualquer hora
        Elementos podem ser adicionados ou removidos mesmo depois da compilação
        armazena os wrappers */
        // Basicamente vetores com wrappers

        // Criando o ArrayList e adicionando alguns termos
        ArrayList<String> comidas = new ArrayList<String>();
        comidas.add("Pipoca"); // Adiciona termos ao ArrayList
        comidas.add("Pizza");
        comidas.add("Acai");
        comidas.add("Esfirra");

        System.out.println(comidas);

        // Alguns métodos
        comidas.set(3, "sushi"); // Substitui um termo por outro em determinado indice
        comidas.remove(2); // Remove o elemento que está na posição dada
        comidas.clear(); // Remove todos os elementos do ArrayList

        // Printando os termos
        for (int i = 0; i < comidas.size(); i++){ //Nesse caso, usa-se size ao invés de lenght
            System.out.println(comidas.get(i)); // get pra obter o termo na posição dada
        } 

    }
    
}
