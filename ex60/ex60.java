package Java.exercícios.ex60;
import java.io.FileReader;
import java.io.IOException;

public class ex60 {

    public static void main(String[] args){
        try {

            // Lendo o arquivo
            FileReader reader = new FileReader("C:/Users/Davi/Documents/programas/Java/aula/aula37/arq.txt");

            // Pritando a leitura do arquivo
            int x = reader.read();
            while(x != -1){

                System.out.print((char)x);
                x = reader.read();

            }

            reader.close();

        }
    
        catch (IOException e){
            e.printStackTrace();
        }

        finally {
            System.out.println("\nFIM =)");
        }

    }
    
}
