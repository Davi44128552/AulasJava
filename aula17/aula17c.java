package Java.aula.aula17;

public class aula17c {

    // Criando as variaveis do objeto
    String nome;
    int idade;
    double altura;

    // Criando o constructor
    // Agora pode atribuir varios valores para a criacao de objetos
    aula17c(String nome, int idade, double altura){
        // Definindo os valores do objeto
        this.nome = nome; // this. identifica a variavel do objeto (usado caso variaveis tenham mesmo nome)
        this.idade = idade;
        this.altura = altura;
    }

    // Criando metodos
    void comer(){
        System.out.printf("%s esta comendo \n", this.nome);
    }

    void beber(){
        System.out.printf("%s esta bebendo \n", this.nome);
    }
    
}
