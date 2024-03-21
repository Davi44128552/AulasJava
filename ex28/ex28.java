package Java.exercícios.ex28;

public class ex28 {

    public static void main(String[] args){

        // Criando o objeto
        Pessoa pessoa = new Pessoa("Davi Iury Lopes Souza", 18, "622.398.713-77");

        // Testando os getters
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getCpf());

        System.out.println();

        // Mostrando as informações
        pessoa.apresentarPessoa();

        // Alterando informações com setters
        pessoa.setNome("Iasmim");
        pessoa.setIdade(19);
        pessoa.setCpf("630.420.333-09");

        System.out.println();

        // Analisando pelos getters
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getCpf());

        System.out.println();

        // Mostrando as novas informações
        pessoa.apresentarPessoa();

    }
    
}
