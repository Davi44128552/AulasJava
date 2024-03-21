package Java.exercícios.ex40;
import java.io.File;

public class ex40 {

    public static void main(String[] args){

        // Tentando abrir o arquivo e tratando erros
        try{

            File file = new File("C:/Users/Davi/Documents/programas/Java/exercícios/ex40/arq.txt");

            // Analisando a existência do arquivo
            if (!file.exists()){
                throw new SemArquivoException();
            }

            // Testando os métodos
            System.out.println(file.isFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.delete());

        }

        catch(SemArquivoException e){
            System.out.println("ERRO! Tente novamente!");
        }

        finally{
            System.out.println("\tPROGRAMA ENCERRADO");
        }

    }
    
}
