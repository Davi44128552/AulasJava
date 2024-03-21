package Java.exercícios.ex65;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Dimension;

public class MeuFrame extends JFrame implements ActionListener {

    // Criando os objetos globais
        // Botão
    JButton botao;

        // Painéis
    JPanel painel1;
    JPanel painel2;
    JPanel painel3;
    JPanel painel4;

    // Criando o construtor
    MeuFrame(){

        // Configurando os painéis
        painel1 = new JPanel();
        painel2 = new JPanel();
        painel3 = new JPanel();
        painel4 = new JPanel();

            // Dimensões
        painel1.setPreferredSize(new Dimension(100, 50));
        painel2.setPreferredSize(new Dimension(100, 50));
        painel3.setPreferredSize(new Dimension(100, 50));
        painel4.setPreferredSize(new Dimension(100, 50));

            // Cores
        painel1.setBackground(Color.RED);
        painel2.setBackground(Color.BLUE);
        painel3.setBackground(Color.GREEN);
        painel4.setBackground(Color.YELLOW);

            // Visibilidade
        painel1.setVisible(false);
        painel2.setVisible(false);
        painel3.setVisible(false);
        painel4.setVisible(false);


        // Criando o botão
        botao = new JButton();
        botao.setBounds(172, 200, 150, 50);
        botao.addActionListener(this);

        // Criando o frame
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adicionando os itens ao frame
            // Botão
        this.add(botao);

            // Painéis
        this.add(painel1, BorderLayout.NORTH);
        this.add(painel2, BorderLayout.EAST);
        this.add(painel3, BorderLayout.SOUTH);
        this.add(painel4, BorderLayout.WEST);

    }

    // Adicionando a função do botão
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            System.out.println("teste");
            painel1.setVisible(true);
            painel2.setVisible(true);
            painel3.setVisible(true);
            painel4.setVisible(true);
            botao.setEnabled(false);

        }

    }
    
}
