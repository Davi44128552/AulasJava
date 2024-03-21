package Java.aula.aula37;
import java.io.FileNotFoundException;
import java.io.FileReader; // Importando pacotes
import java.io.IOException;

public class aula37 {

    public static void main(String[] args){

        /* FileReader = Ler o conteúdo de um arquivo como uma sequência de caracteres, um por um
                        read() retorna um valor inteiro que contém o byte 
                        Quando read() retorna -1, não há mais informação a ser retornada */
         
        
        try{

            // Acessando o arquivo
            FileReader reader = new FileReader("C:/Users/Davi/Documents/programas/Java/aula/aula37/arq.txt");
            int data = reader.read(); // Acessando o byte

            // Imprimindo as informações
            while (data != -1){ // Acessando até que não haja mais informação

                // Convertendo os valores para char para ser printado o determinado byte
                System.out.print((char)data); // Print para não pular nada

                // Lendo a próxima linha
                data = reader.read();

            }

            // Fechando o reader
            reader.close();

        }

        catch (FileNotFoundException e){ // Tratando da inexistência do arquivo
            e.printStackTrace();
        }

        catch (IOException e){ // Tratando erros
            e.printStackTrace();
        }

    }
    
}
