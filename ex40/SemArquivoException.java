package Java.exercícios.ex40;

class SemArquivoException extends RuntimeException{

    SemArquivoException(){
        super("Erro! Arquivo não encontrado");
    }
    
}
