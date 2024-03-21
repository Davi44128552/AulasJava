package Java.exercícios.ex69;

import java.io.FileWriter;
import java.io.IOException;

public class ex69w {

    public static void main(String[] args){

        try {

            // Criando o escritor
            FileWriter writer = new FileWriter("documentinho.txt");
            writer.write("como eu gosto de pipoca! \n");
            writer.append("gosto muito :)");
            writer.close();

        }

        catch(IOException e){
            e.printStackTrace();
        }

        finally {
            System.out.println("finalizado!");
        }

    }
    
}
