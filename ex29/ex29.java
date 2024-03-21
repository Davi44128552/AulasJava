package Java.exercícios.ex29;

public class ex29 {

    public static void main(String[] args){

        // Criando objetos dos livros
        Livro livro1 = new Livro("1984", "George Orwell", 1948);
        Livro livro2 = new Livro("A revolução dos bichos", "George Orwell", 1945);
        Livro livro3 = new Livro("O apanhador no campo de centeio", "J.D. Salinger", 1958);

        // Criando a biblioteca
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Copiando um livro
        Livro livro4 = new Livro();
        livro4 = biblioteca.copiarLivro("O apanhador no campo de centeio");
        System.out.println(livro4.getTitulo());
        System.out.println(livro4.getAutor());
        System.out.println(livro4.getAno());


    }
    
}
