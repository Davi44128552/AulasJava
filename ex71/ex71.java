package Java.exercícios.ex71;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class ex71 {

    public static void main(String[] args){

        // Setando configurações iniciais do frame
        JFrame frame = new JFrame();
        frame.setSize(595, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        frame.setTitle("Programinha dos botões");

        // Adicionando alguns botões
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("0"));

        // Setando a visibilidade do frame
        frame.setVisible(true);

    }

}