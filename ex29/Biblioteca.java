package Java.exercícios.ex29;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {

    // Declarando a lista de livros
    private List<Livro> livrosPresentes;

    // Criando o constructor
    public Biblioteca(){

        this.livrosPresentes = new ArrayList<>();

    }

    // Adicionando livro
    public void adicionarLivro(Livro livro){
        this.livrosPresentes.add(livro);
    }

    // Copiando livro
    public Livro copiarLivro(String titulo){

        Livro livrocopia = new Livro();

        // Criando o loop para procurar o livro desejado
        int i = 0;
        while (i < this.livrosPresentes.size() && !(this.livrosPresentes.get(i).getTitulo().equalsIgnoreCase(titulo))){
            i++;
        }

        if (i == this.livrosPresentes.size()){
            System.out.println("ERRO! Livro não encontrado!");
        }

        else{
            // Copiando os dados do livro
            livrocopia.setTitulo(this.livrosPresentes.get(i).getTitulo());
            livrocopia.setAutor(this.livrosPresentes.get(i).getAutor());
            livrocopia.setAno(this.livrosPresentes.get(i).getAno());

        }

        // Retornando o livro
            return livrocopia;
    }
    
}
