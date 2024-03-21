package Java.exercícios.ex42;
import java.io.FileWriter;
import java.io.IOException; 

public class ex42 {

    public static void main(String[] args){

        try{

            // Criando um arquivo e escrevendo nele
            FileWriter writer = new FileWriter("C:/Users/Davi/Documents/programas/Java/exercícios/ex42/poema.pdf");
            writer.write("\tRosas são vermelhas \n"); // Método que escreve
            writer.write("\tVioletas são azuis \n"); // Método que escreve
            writer.write("\tNão sei fazer uma boa rima \n"); // Método que escreve
            writer.write("\tMas sei que I love you \n"); // Método que escreve

            writer.append("\nBy Davi Iury \n"); // Adiciona algo ao texto
            writer.append("Made in Java");

            writer.close(); // Necessário fechar

        }

        catch(IOException e){ // Exceção do FileWriter
            e.printStackTrace();
        }

        finally{
            System.out.println("\tPROGRAMA ENCERRADO");
        }

    }
    
}
