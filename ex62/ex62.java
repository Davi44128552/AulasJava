package Java.exercícios.ex62;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;

public class ex62 {

    public static void main(String[] args){

        // Criando objetos extras
        Color color = new Color(0xDE392A); // Color
        Font fonte = new Font("MV Boli", Font.PLAIN, 24); // Fonte
        Border borda = BorderFactory.createLineBorder(Color.ORANGE, 10);

        // Criando o Painel
        JPanel painel = new JPanel();
        painel.setBackground(color);
        painel.setBounds(0, 0, 250, 250);
        painel.setLayout(null);

        // Criando o Label
        JLabel label = new JLabel();
        label.setText("TESTE");
        label.setFont(fonte);
        label.setBorder(borda);
        painel.add(label);

        // Criando o frame
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setLayout(null);
        frame.add(painel);
    
    }

}