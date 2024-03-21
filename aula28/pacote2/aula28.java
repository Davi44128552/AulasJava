package Java.aula.aula28.pacote2;

public class aula28 {

    public static void main(String[] args){

        /*  Default = sem modificador
                      é visto apenas naquele pacote */
    
            // Aqui funcionará por estar no mesmo pacote
            C c = new C();
            System.out.println(c.defaultMessage);

        /* Public = Pode ser acessado em qualquer lugar */

        /* Protected = Pode ser acessada em diferentes pacotes,
                   Contanto que seja acessado por uma subclasse */

        /* Private = Só pode ser acessada pela classe em que foi criada */

    
        }
    
}
