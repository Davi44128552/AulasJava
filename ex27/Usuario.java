package Java.exercícios.ex27;

public class Usuario {

    // Declarando as variáveis
    private String nome;
    private int usuarioId;

    // Criando o constructor
    public Usuario(String nome, int usuarioId){

        this.nome = nome;
        this.usuarioId = usuarioId;

    }

    // Criando os métodos
    
    // Métodos de acesso
        // Acessar o nome
    public String acessarNome(){

        return nome;

    }

        // Acessar o id
    public int acessarUsuarioId(){

        return usuarioId;

    }

    // Métodos de modificação
        // Modificar nome
    public void modificarNome(String nome){

        this.nome = nome;
        System.out.println("O nome foi modificado com sucesso!");

    }

        // Modificar o id
    public void modificarUsuarioId(int usuarioId){

        this.usuarioId = usuarioId;
        System.out.println("O id do usuário foi modificado com sucesso!");

    }

    
}
