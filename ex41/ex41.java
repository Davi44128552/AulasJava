package Java.exercícios.ex41;
import java.io.File;

public class ex41 {

    public static void main(String[] args){

        // Abrindo determiando arquivo
        try{

            // Abrindo determinado arquivo
            File file = new File("C:/Users/Davi/Documents/programas/Java/exercícios/ex41/arq.txt");

            // Verificando a existência do arquivo
            if (!file.exists()){
                throw new ArqInexistente();
            }

            // Aplicando os métodos
            System.out.println(file.getPath()); // Obtém o nome do arquivo dito
            System.out.println(file.getAbsolutePath()); // Obtém o diretório
            System.out.println(file.isFile()); // Diz se o arquivo é arquivo ou não
            file.delete(); // Apaga o arquivo lido

        }

        // Tratando erro do arquivo não existir
        catch(ArqInexistente e){
            System.out.println("Desculpe. Houve um erro");
        }

        finally{ // Encerrando
            System.out.println("Programa encerrado");
        }
        

    }
    
}
