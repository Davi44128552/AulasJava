package Java.aula.aula36;
import java.io.FileWriter; // Importando pacote escritor
import java.io.IOException; // Importando o pacote para tratamento de erro

public class aula36{

    public static void main(String[] args){

        /* FileWriter = Aprendendo a editar textos */

        // É necessário usar um try
        try{

            // Abrindo e escrevendo no arquivo
            FileWriter writer = new FileWriter("C:/Users/Davi/Documents/programas/Java/aula/aula36/poema.txt");
            writer.write("Como eu gosto de pipoca \n"); // Escrevendo
            writer.append("Por neném"); // Adiciona mais texto
            writer.close(); // É necessário fechar

        }

        catch(IOException e){ // Tratando erro da escrita
            e.printStackTrace();
        }

        finally{
            System.out.println("Programa encerrado");
        }

    }

}