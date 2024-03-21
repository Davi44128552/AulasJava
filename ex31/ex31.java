package Java.exercícios.ex31;

public class ex31 {

    public static void main(String[] args){

        // Criando o objeto
        Pessoa pessoa = new Pessoa("Davi", 18);

        // Analisando seus dados
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Parado? " + pessoa.parado);

        System.out.println();

        // Testando os métodos
        pessoa.parar();
        pessoa.andar();
        pessoa.andar();
        pessoa.parar();

    }
    
}
