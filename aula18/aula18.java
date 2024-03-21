package Java.aula.aula18;

public class aula18 {

    public static void main(String[] args){

        /*Variaveis locais = Declaradas em metodos
          Visiveis apenas nos metodos 
          
          Variaveis globais = Declaradas fora de metodos, mas nas classes
          Visiveis por todas as partes de uma classe
         */ 

         int var_global = 0; // Essa variavel e aceita em toda a class
         System.out.println(var_global);

         local();

    }

    static void local(){
        int var_local = 0; // Essa variavel e aceita apenas no metodo
        System.out.println(var_local);
    }

    // As Variaveis globais nao sao detectadas pelos metodos, so se forem usadas como parametros
    
}
