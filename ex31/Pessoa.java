package Java.exercícios.ex31;

public class Pessoa implements Humano {

    // Declarando a variável
    private String nome;
    private int idade;
    boolean parado = true;

    // Criando o constructor
    Pessoa(String nome, int idade){

        this.setNome(nome);
        this.setIdade(idade);

    }

    // Constructor de copiar
    Pessoa(Pessoa pessoa){
        this.copiar(pessoa);
    }

    // Get
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    // Set
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    // Copiar
    public void copiar(Pessoa pessoa){

        this.nome = pessoa.nome;
        this.idade = pessoa.idade;

    }

    // Criando os métodos do interface
    @Override
    public void andar(){
        if (parado){
            System.out.printf("%s está andando \n", nome);
            parado = false;
        }

        else{
            System.out.printf("%s já está andando \n", nome);
        }
    }

    @Override
    public void parar(){
        if (parado){
            System.out.printf("%s já está parado \n", nome);
        }

        else{
            System.out.printf("%s parou \n", nome);
            parado = true;
        }
    }

    
}
