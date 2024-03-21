package Java.exercícios.ex63;

import javax.swing.*;
import java.awt.event.*;

class MeuFrame extends JFrame implements ActionListener{

    // Criando objetos que serão globais
    JButton botao;
    JLabel label;

    // Criando o construtor
    MeuFrame(){

        // Criando ícones
        ImageIcon icone = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula40/ned.jpg");
        ImageIcon icone2 = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula42/icone.png");

        // Criando a label
        label = new JLabel();
        label.setBounds(0, 0, 350, 350);
        label.setText("OLÁ!!!");
        label.setIcon(icone);
        label.setVisible(false);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(10);

        // Criando o botão
        botao = new JButton();
        botao.setBounds(175, 200, 150, 65);
        botao.addActionListener(this);
        botao.setText("Aperte aqui!");
        botao.setIcon(icone2);
        botao.setVerticalTextPosition(JButton.TOP);
        botao.setHorizontalTextPosition(JButton.CENTER);
        botao.setIconTextGap(5);
        botao.setFocusable(false);

        // Adicionando características gerais do frame
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(botao); // Adicionando o botão
        this.add(label);

    }

    // Reescrevendo o método
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            System.out.println("teste");
            label.setVisible(true);
            JOptionPane.showMessageDialog(null, "Botão pressionado!");

        }

    }
    
}
