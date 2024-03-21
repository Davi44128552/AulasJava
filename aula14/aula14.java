package Java.aula.aula14;

public class aula14 {

    public static void main(String[] args){

        // printf = basicamente o printf do C
        // Podem ser dados tamanhos, posicoes e precisoes

        int a = 1;
        double b = 3.14;
        char c = 'c';
        boolean e = true;
        String d = "Davi";

        System.out.printf("%d", a); // %d = int
        System.out.println("\n");
        
        System.out.printf("%.2f", b); // %f = double / .2 = precisao
        System.out.println("\n");

        System.out.printf("%c", c); // %c = char
        System.out.println("\n");

        System.out.printf("%b", e); // %b = boolean
        System.out.println("\n");
        
        System.out.printf("%-10s", d); // %s = string / 10 = tamanho / - = posicao

    }
    
}
