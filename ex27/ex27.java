package Java.exercícios.ex27;

public class ex27 {

    public static void main(String[] args){

        // Criando os objetos
            // Criando os livros
        Livro livro1 = new Livro("O Apanhador No Campo De Centeio", "J. D. Salinger", 233);
        Livro livro2 = new Livro("1984", "George Orwell", 416);
        Livro livro3 = new Livro("A Revolução Dos Bichos", "George Orwell", 137);
        Livro livro4 = new Livro("Fahrenheit 451", "Ray Bradbury", 244);
        Livro livro5 = new Livro("Laranja Mecânica", "Anthony Burgess", 228);

            // Verificando os dados

            // Livro 1
        System.out.println("\tLIVRO 1");
        System.out.println("O nome do livro é: " + livro1.acessarTitulo());
        System.out.println("O nome do autor é: " + livro1.acessarAutor());
        System.out.println("O número de páginas é: " + livro1.acessarNum_paginas() + "\n");

            // Livro 2
        System.out.println("\tLIVRO 2");
        System.out.println("O nome do livro é: " + livro2.acessarTitulo());
        System.out.println("O nome do autor é: " + livro2.acessarAutor());
        System.out.println("O número de páginas é: " + livro2.acessarNum_paginas() + "\n");

            // Livro 3
        System.out.println("\tLIVRO 3");
        System.out.println("O nome do livro é: " + livro3.acessarTitulo());
        System.out.println("O nome do autor é: " + livro3.acessarAutor());
        System.out.println("O número de páginas é: " + livro3.acessarNum_paginas() + "\n");

            // Livro 4
        System.out.println("\tLIVRO 4");
        System.out.println("O nome do livro é: " + livro4.acessarTitulo());
        System.out.println("O nome do autor é: " + livro4.acessarAutor());
        System.out.println("O número de páginas é: " + livro4.acessarNum_paginas() + "\n");

            // Livro 5
        System.out.println("\tLIVRO 5");
        System.out.println("O nome do livro é: " + livro5.acessarTitulo());
        System.out.println("O nome do autor é: " + livro5.acessarAutor());
        System.out.println("O número de páginas é: " + livro5.acessarNum_paginas() + "\n");

        // Criando a biblioteca e adicionando os livros
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

    }
    
}
