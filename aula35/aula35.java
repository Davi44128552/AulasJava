package Java.aula.aula35;
import java.io.File; // Importando o seguinte item para tentar acessar o arquivo

public class aula35 {

    public static void main(String[] args){

        /* File class = Uma representação abstrata de um arquivo 
                        Detectar se determinado arquivo existe */

        // ! -> Neste caso, o arquivo apenas pelo nome seria se ele estivesse na pasta geral programas

        // Analisando determinado arquivo
        File file = new File("teste.txt"); // na pasta programas
        // Usando o construtor e o nome serve de atributo
        // Dar o diretório do arquivo

        System.out.println(file.exists()); // Valor booleano que diz se o arquivo existe ou não
        System.out.println(file.getPath()); // Consegue o arquivo escrito
        System.out.println(file.getAbsolutePath()); // COnsegue o diretório
        System.out.println(file.isFile()); // Diz se é ou não um arquivo
        file.delete(); // Apaga o arquivo acessado
        

    }
    
}
