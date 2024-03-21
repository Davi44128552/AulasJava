package Java.aula.aula23;

public class aula23 {

    public static void main(String[] args){

        /* Static = modificador. Uma simples cópia de uma variavel ou metodo
         é criada e compartilhada. A classe possui o membro static 
         Funciona de forma "independente"
         Ex.: Math.round() -> classe Math */

         // Analisando a variavel static antes de ter amigos
         System.out.println(aula23c.contador_amigos); // A gente deve procurar usando a classe, e não o objeto

         // Criando o objeto amigo
         aula23c amigo = new aula23c("Marcio");
         System.out.println(amigo.nome);
         System.out.println(aula23c.contador_amigos); // A gente deve procurar usando a classe, e não o objeto

         // Adicionando mais um amigo
         aula23c amigo2 = new aula23c("Felype");
         System.out.println(amigo2.nome);
         System.out.println(aula23c.contador_amigos); // A gente deve procurar usando a classe, e não o objeto

         // Aplicando o metodo static
         aula23c.cont_amigos();



    }
    
}
