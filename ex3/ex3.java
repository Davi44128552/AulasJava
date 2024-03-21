package Java.exercícios.ex3;
import javax.swing.JOptionPane;
import java.util.Random;

public class ex3 {

    public static void main(String[] args){

        Random random = new Random();

        JOptionPane.showMessageDialog(null, "Jogo da adivinhação!");
        JOptionPane.showMessageDialog(null, "Pensarei em um número, adivinhe! (Dica: 0 <= n <= 5)");

        int num_aleatorio = random.nextInt(5);

        int num_jogador = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número"));

        if (num_aleatorio == num_jogador){
            JOptionPane.showMessageDialog(null, "Parabéns! Você acertou!");
        }

        else{
            JOptionPane.showMessageDialog(null, "Sinto muito... Você errou!");
        }

        JOptionPane.showMessageDialog(null, "Seu número: " + num_jogador + "\nMeu número: " + num_aleatorio);
    }
    
}
