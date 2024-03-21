package Java.aula.aula28.pacote2;
import Java.aula.aula28.pacote1.*; // Neste caso, é necessário importar as classes de outro pacote (* = impota tudo)

public class Asub extends A{ // Criando subclasse

    public static void main(String[] args){

        Asub a =  new Asub(); // A gente chama a subclasse
        System.out.println(a.protectedMessage);

    }

    
}
