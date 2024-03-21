package Java.aula.aula12;

public class aula12 {

    public static void main(String[] args){ // Isso aqui é um método (int main do C)

        // Método: Um bloco de código que é executado quando chamado (def do python)

        // Chmamando o método
        String nome = "Davi";
        int idade = 18;

        hello(nome, idade);


    }

    // Criando o método
    static void hello(String palavra, int numero /*argumento*/){ // Static não é necessário em todos os casos. 
        System.out.println("Hello! " + palavra + " de " + numero + " anos");
    }
    
}
