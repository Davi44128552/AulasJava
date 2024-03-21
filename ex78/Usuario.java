package Java.exercícios.ex78;

public class Usuario {

    // Criando os atributos
    private String nome;
    private int id;
    private String telefone;

    // Construtores
    Usuario(){

    }

    Usuario(String nome, int id, String telefone){

        this.setNome(nome);
        this.setId(id);
        this.setTelefone(telefone);

    }

    // Getters
    public String getNome(){
        return nome;
    }

    public int getId(){
        return id;
    }

    public String getTelefone(){
        return telefone;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
}
