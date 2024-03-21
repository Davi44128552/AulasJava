package Java.exercícios.ex61;

public class ContaBancaria {

    // Declarando as variáveis
    private Cliente cliente;
    private int conta;
    private double saldo;
    
    // Criando o construtor
    ContaBancaria(Cliente cliente, int conta, double saldo){

        setCliente(cliente);
        setConta(conta);
        setSaldo(saldo);

    }

    // Getters
    public Cliente getCliente(){ // Cliente
        return cliente;
    }
    
    public int getConta(){ // Conta
        return conta;
    }

    public double getSaldo(){ // Saldo
        return saldo;
    }

    // Setters
    public void setCliente(Cliente cliente){ // Cliente
        this.cliente = cliente;
    }

    public void setConta(int conta){ // Conta
        this.conta = conta;
    }

    public void setSaldo(double saldo){ // Saldo
        this.saldo = saldo;
    }

    // toString
    @Override
    public String toString(){
        return "Nome: " + cliente.getNome() + "\nCPF: " + cliente.getCpf() + "\nConta: " + conta + "\nSaldo: " + saldo;
    }

    // Métodos extras
        // Depositar
    public void depositar(double quantia){

        saldo += quantia;
        System.out.println("Quantia adicionada!");

    }

        // Sacar
    public void sacar(double quantia){

        try {

            if (quantia > saldo){
                throw new MathError();
            }

            else{
                saldo -= quantia;
                System.out.println("Quantia removida!");
            }
            
        }

        catch (MathError e){
            e.printStackTrace();
        }

    }

        // Consultar saldo
    public void consultarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

}
