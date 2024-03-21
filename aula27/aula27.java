package Java.aula.aula27;

public class aula27 {

    public static void main(String[] args){

        /* abstract = Classes que não podem ser criadas como objetos isolados
                    , mas podem ter uma subclasses (É algo muito "genérico" para ser criado)
                      métodos abstratos são declarados sem uma implementação */

        // aula27_o1 objeto = new aula27_o1();
            // ! -> Ao tentar criar o objeto acima, o programa dará erro, visto que é um abstract

        // Criando o objeto válido (Da subclasse)
        aula27_o2 carro = new aula27_o2();
        carro.ir();

    }
    
}
