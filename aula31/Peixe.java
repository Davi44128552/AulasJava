package Java.aula.aula31;

public class Peixe implements Predador, Presa{

    // Método do predador
    @Override
    public void cacar(){
        System.out.println("*O peixe está caçando*");
    }

    // Método da presa
    @Override
    public void fugir(){
        System.out.println("*O peixe está fugindo*");
    }
    
}
