package Java.exercícios.ex78;

public class Livro {

    // Criando os atributos
    private String titulo;
    private String autor;
    private int id;
    private int ano_publicacao;

    // Construtores
    Livro(){

    }

    Livro(String titulo, String autor, int id, int ano_publicacao){

        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setId(id);
        this.setAno(ano_publicacao);

    }

    // Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getId(){
        return id;
    }

    public int getAno(){
        return ano_publicacao;
    }

    // Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setAno(int ano_publicacao){
        this.ano_publicacao = ano_publicacao;
    }
    
}
