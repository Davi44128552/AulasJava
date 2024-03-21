package Java.exercícios.ex64;

import java.awt.Color;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.Font;

class MeuFrame extends JFrame implements ActionListener {

    JButton botao;
    File file;
    AudioInputStream audio;
    Clip clipe;

    MeuFrame() throws IOException, LineUnavailableException, UnsupportedAudioFileException{

        // Lendo o arquivo
        file = new File("C:/Users/Davi/Documents/programas/Java/aula/aula38/audio.wav");
        audio = AudioSystem.getAudioInputStream(file);
        clipe = AudioSystem.getClip();
        clipe.open(audio);

        // Criando o botão
        botao = new JButton();
        botao.setBounds(175, 200, 150, 50);
        botao.addActionListener(this);
        botao.setText("Clique aqui");
        botao.setFont(new Font("Comic Sans", Font.BOLD, 18));
        botao.setFocusable(false);
        botao.setBackground(new Color(0xffddd9));
        botao.setBorder(BorderFactory.createEtchedBorder());
        
        // Criando o frame
            // Setando configurações básicas
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0xffbcb3));

            // Adicionando o botão
        this.add(botao);

    }

    // Reescrevendo o método
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){
            clipe.start();
        }

    }
    
}
