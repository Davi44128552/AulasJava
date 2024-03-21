package Java.exercícios.ex69;

import java.io.FileReader;
import java.io.IOException;

public class ex69r {

    public static void main(String[] args){

        try {

            // Criando o leitor
            FileReader reader = new FileReader("C:/Users/Davi/Documents/programas/Java/aula/aula37/arq.txt");
            int x = reader.read();

            // Printando a sentença
            while (x != -1){

                System.out.print((char)x);
                x = reader.read();

            }

            reader.close();

        }

        catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
