package Java.aula.aula28.pacote1;

public class A {
 
 /* 
    public static void main(String[] args){

       /*  C c = new C();
        System.out.println(c.defaultMessage); 
            // ! -> Não vai ser visto porque não está no mesmo pacote

        C c = new C();
        System.out.println(c.publicMessage);

            // ! -> Neste caso funcionará, pelo atributo ser público


        // D d = new D();
            // ! -> Não será visível, pois a classe D não é pública

    } */

    protected String protectedMessage = "This is protected message";
    
}
