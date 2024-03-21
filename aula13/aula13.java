package Java.aula.aula13;

public class aula13 {

    public static void main(String[] args){

        // Metodos multiplos: Metodos com o mesmo nome, mas com diferentes parametros
        int x = soma(1, 2);
        int y = soma(1, 2, 3);
        int z = soma(1, 2, 3, 4);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

    // Funcao soma #1
    static int soma(int a, int b){
        return a + b;
    }

    // Funcao soma #2
    static int soma(int a, int b, int c){
        return a + b + c;
    }

    // Funcao soma #3
    static int soma(int a, int b, int c, int d){
        return a + b + c + d;
    }
    
}
