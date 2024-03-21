package Java.exercícios.ex67;

public class Curso {

    // Declarando as variáveis
    private String nome;
    private String descricao;

    // Criando o construtor
    Curso(String nome, String descricao){

        this.setNome(nome);
        this.setDescricao(descricao);

    }

    // Getters
    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
}
