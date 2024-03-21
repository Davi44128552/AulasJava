package Java.aula.aula19;

public class aula19 {

    public static void main(String[] args){

        // Overloaded constructors = Constructors com mesmo nome, mas diferentes parametros
        aula19c pizza = new aula19c("pao");
        aula19c pizza2 = new aula19c("pao", "mussarela");
        aula19c pizza3 = new aula19c("pao", "mussarela", "bacon");

        // Pizza 1
        System.out.println(pizza.massa);

        // Pizza 2
        System.out.println(pizza2.massa);
        System.out.println(pizza2.queijo);

        // Pizza 3
        System.out.println(pizza3.massa);
        System.out.println(pizza3.queijo);
        System.out.println(pizza3.recheio);

    }
    
}
