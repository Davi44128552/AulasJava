package Java.exercícios.ex39;
import java.io.File;

public class ex39 {

    public static void main(String[] args){

        // Abrindo o documento
        File file = new File("C:/Users/Davi/Documents/programas/Java/exercícios/ex39/texto.txt");
        System.out.println(file.exists()); // Verificando se o arquivo existe
        System.out.println(file.getPath()); // Obter arquivo
        System.out.println(file.getAbsolutePath()); // Obtendo o diretório
        System.out.println(file.isFile()); // Verificando se é arquivo
        file.delete(); // Deletando o arquivo

    }
    
}
