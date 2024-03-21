package Java.exercícios.ex36;
import javax.swing.JOptionPane;

public class Cachorro extends Animal {

    // Sobrescrevendo o método principal
    @Override
    void falar(){
        JOptionPane.showMessageDialog(null, "O cachorro fala: *au au*");
    }

    
}
