package Java.aula.aula31;

public class aula31 {

    public static void main(String[] args){

        /* Interface = Uma template que pode ser aplicada em uma classe
                    Similar a subclasses, mas especifica o que a classe tem que fazer
                    Classes podem ser aplicadas mais que uma interface, inheritance é limitada a um super
                    Podemos adicionar mais de um interface nas clases */

        // Testando o primeiro objeto -> Coelho
        Coelho coelho = new Coelho();
        coelho.fugir(); // Não pode aplicar cacar

        System.out.println();

        // Testando o segundo objeto -> Águia
        Aguia aguia = new Aguia();
        aguia.cacar(); // Não pode aplicar fugir

        System.out.println();

        // Testando o terceiro objeto -> Peixe
        Peixe peixe = new Peixe();
        peixe.cacar(); // Pode ser usado os dois métodos
        peixe.fugir(); // Pode ser usado os dois métodos
         

    }
    
}
