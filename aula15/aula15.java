package Java.aula.aula15;

public class aula15 {

    public static void main(String[] args){

        // final = Declarando uma variavel fixa, a qual nao pode ser mudada ou atualizada
        // pratica de programacao comum e declarar essas variaveis com maiusculas

        // SEM final
        double pi = 3.14159;
        System.out.println(pi);

        pi = 3.14;
        System.out.println(pi);

        // COM final
        final double pi2 = 3.1;
        System.out.println(pi2);

        // pi2 nao podera sofrer alteracoes, por causa do final

    }
    
}
