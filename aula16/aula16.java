package Java.aula.aula16;

public class aula16 {

    public static void main(String[] args){

        // Objeto = Instancia de classe com atributos e metodos
        // ex = celular, cafe, carro, etc.
        // Pode ser criado no mesmo arquivo ou em arquivos difrentes

        // Chamando o objeto
        aula16o carro = new aula16o();

        // Verificando os atributos do carro
        System.out.println(carro.marca);
        System.out.println(carro.modelo);
        System.out.println(carro.cor);
        System.out.println(carro.ano);
        System.out.println(carro.preco);

        // Chamando os metodos
        carro.dirigir();
        carro.frear();

    }
    
}
