package Java.exercícios.ex78;

import java.time.LocalDate;

public class Transacao {

    // Criando os atributos
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private int idLivro;
    private int idUsuario;
    
    // Construtores
    Transacao(){

    }

    Transacao(LocalDate dataEmprestimo, LocalDate dataDevolucao, int idLivro, int idUsuario){

        this.setDataEmprestimo(dataEmprestimo);
        this.setDataDevolucao(dataDevolucao);
        this.setIdLivro(idLivro);
        this.setIdUsuario(idUsuario);

    }
    
    // Getters
    public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao(){
        return dataDevolucao;
    }

    public int getIdLivro(){
        return idLivro;
    }

    public int getIdUsuario(){
        return idUsuario;
    }

    // Setters
    public void setDataEmprestimo(LocalDate dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }

    public void setIdLivro(int idLivro){
        this.idLivro = idLivro;
    }

    public void setIdUsuario(int idUsuario){
        this.idUsuario = idUsuario;
    }
    
}
