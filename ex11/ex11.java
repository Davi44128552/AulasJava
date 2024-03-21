package Java.exercícios.ex11;

public class ex11 {

    public static void main(String[] args){

        // Chamando o objeto
        Cafe cafezin = new Cafe();

        // Analisando seus valores
        System.out.println(cafezin.cor);
        System.out.println(cafezin.temperatura);
        System.out.println(cafezin.cheio);

        // Chamando as funcoes
        cafezin.beber();
        cafezin.por();
        cafezin.por();
    }
    
}
