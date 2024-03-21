package Java.aula.aula28.pacote2;

public class C { // Se removermos o "Public", o objeto só poderá ser criado neste pacote

    /* Default = sem modificador
                  é visto apenas naquele pacote */

    // Criando um default
    String defaultMessage = "This is default";

    /* Public = Pode ser acessado em qualquer lugar */

    // Criando um public
    public String publicMessage = "This is public";

    /* Protected = Pode ser acessada em diferentes pacotes,
                   Contanto que seja acessado por uma subclasse */
     
    
}
