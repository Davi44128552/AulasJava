package Java.exercícios.ex72;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class ex72 {

    public static void main(String[] args){

        // Criando e configurando o frame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3, 10, 10));
        frame.getContentPane().setBackground(new Color(175, 100, 203));
        frame.setVisible(true);

        // Adicionando botões
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

    }
    
}
