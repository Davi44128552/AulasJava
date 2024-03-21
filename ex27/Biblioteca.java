package Java.exercícios.ex27;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

    // Criando os atributos
    private List<Livro> livrosDisponiveis;
    private List<Livro> livrosEmprestados;

    // Criando o constructor -> Iniciando vazia
    public Biblioteca(){

        this.livrosDisponiveis = new ArrayList<Livro>();
        this.livrosEmprestados = new ArrayList<Livro>();

    }

    // Criando os métodos
    public void adicionarLivro(Livro livro){

        livrosDisponiveis.add(livro);
        System.out.println("O livro foi adicionado à biblioteca!");

    }

    public void emprestarLivro(Livro livro){

        livrosEmprestados.add(livro); 
        livrosDisponiveis.remove(livro);
        System.out.println("O livro foi emprestado!");

    }

    public void retornarLivro(Livro livro){

        livrosDisponiveis.add(livro);
        livrosEmprestados.remove(livro);
        System.out.println("O livro foi devolvido!");

    }
    
}