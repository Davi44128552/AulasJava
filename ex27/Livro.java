package Java.exercícios.ex27;

public class Livro {

    // Declarando as variáveis (private)
        // ! -> Comum de usar, para encapsulamento, por exemplo
    private String titulo;
    private String autor;
    private int num_paginas;
    
    // Criando o constructor (public)
    public Livro(String titulo, String autor, int num_paginas){

        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;

    }

    // Criando os métodos (public)

    // Métodos de acesso
        // Acessar o título
    public String acessarTitulo(){

        return titulo;

    }

        // Acessar o autor
    public String acessarAutor(){

        return autor;

    }

        // Acessar o número de páginas
    public int acessarNum_paginas(){

        return num_paginas;

    }

    // Métodos de modificação
        // Modificar o título
    public void modificarTitulo(String titulo){

        this.titulo = titulo;
    
    }

        // Modificar o autor
    public void modificarAutor(String autor){

        this.autor = autor;

    }

        // Modificar o número de páginas
    public void modificarNum_paginas(int num_paginas){

        this.num_paginas = num_paginas;

    }
    
}