package Java.exercícios.ex70;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class ex70 {

    public static void main(String[] args){

        // Criando um frame inicial
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Adicionando alguns botões
        frame.add(new JButton("Botão 1"));
        frame.add(new JButton("Botão 2"));
        frame.add(new JButton("Botão 3"));
        frame.add(new JButton("Botão 4"));

        // Atualizando o frame
        frame.setVisible(true);

    }
    
}
