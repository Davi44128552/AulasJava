package Java.aula.aula26;

public class aula26 {

    public static void main(String[] args){

        /* Super = keyword que se refere ao "pai" de um objeto
                   Semelhante ao "this" */

        /*Super(argumentos)
          Super.Metodo() */
         

        // Criando o objeto
        aula26_o2 heroi = new aula26_o2("Batman", 42, "$$$");
            // ! -> O atributo "poder" so podera ser chamado pela subclasse

        // Printando seus valores
        System.out.println(heroi.nome);
        System.out.println(heroi.idade);
        System.out.println(heroi.poder);

        System.out.println();

        // Criando outro objetos
        aula26_o2 heroi2 = new aula26_o2("Superman", 126, "todos");

        // Printando seus valores
        System.out.println(heroi2.nome);
        System.out.println(heroi2.idade);
        System.out.println(heroi2.poder);

    }
    
}
