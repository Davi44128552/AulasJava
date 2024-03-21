package Java.exercícios.ex67;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    // Declarando as variáveis
    private String nome;
    private int idade;
    private List<Curso> cursosInscritos;

    // Criando o construtor
    Aluno(String nome, int idade){

        this.setNome(nome);
        this.setIdade(idade);
        this.cursosInscritos = new ArrayList<Curso>();

    }

    Aluno(){

    }

    // Getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    // Criando métodos extras
        // Adicionar um curso
    public void addCurso(Curso curso){
        cursosInscritos.add(curso);
    }

        // Imprimindo os cursos em que o aluno está inscrito
    public void verCursos(){

        System.out.printf("Cursos de %s: \n", nome);

        for (Curso i : cursosInscritos){

            System.out.println("Nome do curso: " + i.getNome());
            System.out.println("Descrição do curso: " + i.getDescricao());
            System.out.println();

        }

        System.out.println();

    }
    
}
