// ! -> EXTRA = APRENDENDO A CRIAR EXCEÇÕES
package Java.exercícios.ex38;

class SaldoInsuficienteException extends RuntimeException{ // Transforma em subclasse de RuntimeException

    SaldoInsuficienteException(){
        super("SALDO INSUFICIENTE PARA REALIZAR A OPERAÇÃO"); // Retorna a mensagem mensagem
    }
    
}
