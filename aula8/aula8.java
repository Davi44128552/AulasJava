package Java.aula.aula8;

public class aula8 {

    public static void main(String[] args){

        // Wrapper class: Uma forma de representar variáveis e usar determinados métodos, se necessários
        // autoboxing = conversor de tipo primitivo para wrapper (automatico do java)
        // unboxing = conversor de wrapper para primitivo (automatico do java)
        // Tipos primitivos são muito mais rápidos que wrappers

        // primitivos:
        /* int x = 123;
        double y = 3.14;
        boolean z = true;
        char w = 'd'; */

        // wrappers
        Integer a = 123; // Wrappers são definidos pelo nome e inicial maiúscula
        Double b = 3.14;
        Boolean c = true;
        Character d = 'd';

        // Testando
        if (a == 123){
            System.out.println("A, de fato, é 123");
        }

        if (b != 123){
            System.out.println("B, de fato, NÃO é 123");
        }

        if (c == true){
            System.out.println("c, de fato, é verdadeiro");
        }

        if (d == 'd'){
            System.out.println("d tem o mesmo valor de seu nome");
        }

        // Testando alguns métodos
        System.out.println(a.equals(123));
    }
    
}
