package Java.aula.aula11;
import java.util.ArrayList;

public class aula11 {

    public static void main(String[] args){

        /* for-each loops: Loop que percorre os elementos de um array ou coleção
        prós: Menos passos e mais legível
        contras: Menos flexível*/

        // Começando por array
        System.out.println("\tANIMAIS");
        String[] animais = {"Peixes", "Anfibios", "Repteis", "Aves", "Mamiferos"};

            // for-each loop
        for(String i : animais){ // Cada item (i) do tipo(String) em (:) Array(animais)
            System.out.println(i); 
        }

        // Agora com coleção (ArrayList, por exemplo)
        System.out.println("\n\tPLANTAS");
        ArrayList<String> plantas = new ArrayList<String>();
        plantas.add("Briofitas");
        plantas.add("Pteridofitas");
        plantas.add("Gimnospermas");
        plantas.add("Angiospermas");

            // for-each loop
        for(String i: plantas){
            System.out.println(i);
        }

    }
    
}
