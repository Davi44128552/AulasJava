package Java.exercícios.ex29;

public class Livro {

    // Declaração de variáveis
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Criando o constructor
    Livro(String titulo, String autor, int anoPublicacao){

        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAno(anoPublicacao);

    }

    Livro(){
        
    }

    // Criando os getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAno(){
        return anoPublicacao;
    }

    // Criando os setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAno(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    
}
