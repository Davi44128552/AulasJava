package Java.exercícios.ex61;

public class ex61 {

    public static void main(String[] args){

        // Criando um cliente
        Cliente cliente1 = new Cliente("Davi Iury Lopes Souza", "622.398.713-77");

        // Criando a conta bancaria
        ContaBancaria conta1 = new ContaBancaria(cliente1, 124526, 256.0);

        // Testando os métodos
        conta1.consultarSaldo();
        conta1.depositar(250);
        conta1.sacar(150);

        System.out.println(conta1.toString());

    }
    
}
