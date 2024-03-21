package Java.exercícios.ex61;

public class Cliente {

    // Declarando as variáveis
    private String nome;
    private String cpf;

    // Criando o construtor
    Cliente(String nome, String cpf){

        setNome(nome);
        setCpf(cpf);

    }

    // Getters
    public String getNome(){ // Nome
        return nome;
    }

    public String getCpf(){ // CPF
        return cpf;
    }

    // Setters
    public void setNome(String nome){ // Nome
        this.nome = nome;
    }

    public void setCpf(String cpf){ // CPF 
        this.cpf = cpf;
    }
    
}
