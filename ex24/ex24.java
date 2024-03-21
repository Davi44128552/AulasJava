package Java.exercícios.ex24;

public class ex24 {

    public static void main(String[] args){

        // Criando os objetos
        Professor prof = new Professor("Ricardo", 32, "Geografia");
        Estudante aluno = new Estudante("Davi", 18, "Ciência da Computação");

        // Exibindo as informações e metodos
            // Professor
        System.out.println("\tPROFESSOR");
        System.out.println("Nome do professor: " + prof.nome);
        System.out.println("Idade do professor: " + prof.idade);
        System.out.println("Disciplina do professor: " + prof.disciplina);
        prof.apresentacao();

        System.out.println();

            // Estudante
        System.out.println("\tALUNO");
        System.out.println("Nome do aluno: " + aluno.nome);
        System.out.println("Idade do aluno: " + aluno.idade);
        System.out.println("Curso do aluno: " + aluno.curso);
        aluno.apresentacao();

    }
    
}
