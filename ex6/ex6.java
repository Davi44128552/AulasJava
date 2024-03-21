package Java.exercícios.ex6;
import java.util.Random;
import javax.swing.JOptionPane;

public class ex6 {

    public static void main(String[] args){

        Random random = new Random();

        JOptionPane.showMessageDialog(null, "SORTEIO MEGA-SENA");
        int jogos = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione quantos jogos você quer que sorteie?"));

        int[] numeros = new int[jogos];
        for (int i = 0; i < jogos; i++){
            for (int j = 0; j < jogos; j++){
                numeros[j] = random.nextInt(60);
            }

            JOptionPane.showMessageDialog(null, "Números sorteados");

            for (int j = 0; j < jogos; j++){
                JOptionPane.showMessageDialog(null, numeros[j]);
            }
        }
        
    }
    
}
