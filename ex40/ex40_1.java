package Java.exercícios.ex40;
import java.io.File;

public class ex40_1 {

    public static void main(String[] args){

        // Arquivo teste
        File file = new File("C:/Users/Davi/Documents/programas/Java/exercícios/ex40/arq.txt");

        // Testando a existência do arquivo
        if (!file.exists()){
            throw new SemArquivoException();
        }
    }
    
}
