package Java.exercícios.ex67;

public class ex67 {

    public static void main(String[] args){

        // Adicionando alguns cursos
        Curso curso1 = new Curso("Ciência da Computação", "Estudo em computação");
        Curso curso2 = new Curso("Estatística", "Estudo de dados e números");
        Curso curso3 = new Curso("Inglês", "Estudo de uma nova língua");

        // Criando o estudante
        Aluno aluno1 = new Aluno("Davi", 18);
        Aluno aluno2 = new Aluno("Yasmin", 19);

        // Adicionando cursos para o estudante
            // aluno1
        aluno1.addCurso(curso1);
        aluno1.addCurso(curso3);

            // aluno2
        aluno2.addCurso(curso2);

        // Testando alguns métodos
        System.out.println("========== ALUNO Nº1 ==========");
        aluno1.verCursos();

        System.out.println("========== ALUNO Nº2 ==========");
        aluno2.verCursos();

    }
    
}
