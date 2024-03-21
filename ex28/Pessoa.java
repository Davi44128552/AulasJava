package Java.exercícios.ex28;

public class Pessoa {

    // Declarando variáveis
    private String nome;
    private int idade;
    private String cpf;

    // Criando o constructor
    public Pessoa(String nome, int idade, String cpf){

        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

    }

    // Criando os métodos
        // Getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCpf(){
        return cpf;
    }

        // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

        // Apresentar pessoa
    public void apresentarPessoa(){

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);

    }

}
