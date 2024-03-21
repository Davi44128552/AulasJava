package Java.exercícios.ex23;

public class Livro {

    // Criando as variaveis do objeto
    String titulo;
    String autor;
    int ano;

    // Criando o construtor
    Livro(String titulo, String autor, int ano){

        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;

    }

    // Criando os metodos
    String rev_titulo(){
        return titulo;
    }

    String rev_autor(){
        return autor;
    }

    int rev_ano(){
        return ano;
    }

    void revela(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
    }
    
}
