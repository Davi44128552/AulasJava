package Java.exercícios.ex73;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class ex73 {

    public static void main(String[] args){

        // Criando os labels
        JLabel label1 = new JLabel();
        label1.setBackground(Color.RED);
        label1.setOpaque(true);
        label1.setBounds(50, 50, 250, 250);

        JLabel label2 = new JLabel();
        label2.setBackground(Color.BLUE);
        label2.setOpaque(true);
        label2.setBounds(100, 100, 250, 250);

        JLabel label3 = new JLabel();
        label3.setBackground(Color.GREEN);
        label3.setOpaque(true);
        label3.setBounds(150, 150, 250, 250);

        // Criando o LayeredPane
        JLayeredPane layer = new JLayeredPane();
        layer.setBounds(0, 0, 500, 500);
        
        // Adicionando os labels
        layer.add(label1, Integer.valueOf(0));
        layer.add(label2, Integer.valueOf(1));
        layer.add(label3, Integer.valueOf(2));

        // Criando o frame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(layer);

    }
    
}
