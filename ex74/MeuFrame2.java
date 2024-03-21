package Java.exercícios.ex74;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

class MeuFrame2 extends JFrame implements ActionListener {

    // Criando objetos gerais
    String nome;
    JButton botao;
    JCheckBox checkbox;

    // Construtor
    MeuFrame2(String nome){

        this.nome = nome;

        // Adicionando ícones para a checkbox
        ImageIcon check = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula50/check.png");
        ImageIcon cross = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula50/cross.png");

        // Criando a checkbox
        checkbox = new JCheckBox();
        checkbox.setText("Você é um ser humano, " + nome + "?");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Comic Sans", Font.BOLD, 22));
        checkbox.setIcon(cross);
        checkbox.setSelectedIcon(check);

        // Criando um botão
        botao = new JButton();
        botao.setFocusable(false);
        botao.setPreferredSize(new Dimension(125, 50));
        botao.setText("Submit");
        botao.setFont(new Font("Comic Sans", Font.BOLD, 18));
        botao.addActionListener(this);

        // Setando o frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setTitle("Checkbox");
        this.add(botao);
        this.add(checkbox);
        this.pack();


    }

    // Adicionando funcionalidade ao botão
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            boolean resultado = checkbox.isSelected();
            this.setEnabled(false);

            if (resultado){

                JOptionPane.showMessageDialog(null, "Olá, humano " + nome, 
                "final", JOptionPane.INFORMATION_MESSAGE);

            }

            else {

                JOptionPane.showMessageDialog(null, "Olá, robô " + nome, 
                "final", JOptionPane.WARNING_MESSAGE);

            }

        }

    }
    
}
