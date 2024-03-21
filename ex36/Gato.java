package Java.exercícios.ex36;
import javax.swing.JOptionPane;

public class Gato extends Animal{

    // Sobrescrevendo o método
    @Override
    void falar(){
        JOptionPane.showMessageDialog(null, "O gato fala: *miau*");
    }
    
}
