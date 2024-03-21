package Java.exercícios.ex74;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;

class MeuFrame extends JFrame implements ActionListener {

    // Criando os objetos globais
    JButton botao;
    JTextField texto;

    // Criando o construtor
    MeuFrame(){

        // Criando uma label
        JLabel label = new JLabel();
        label.setText("Qual é o seu nome?");
        label.setPreferredSize(new Dimension(350, 50));
        label.setFont(new Font("Comic Sans", Font.PLAIN, 22));
        label.setForeground(Color.BLACK);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        // Criando um painel
        JPanel painel = new JPanel();
        painel.setPreferredSize(new Dimension(475, 50));
        painel.add(label);

        // Criando o texto para escrever
        texto = new JTextField();
        texto.setPreferredSize(new Dimension(350, 50));
        texto.setBackground(Color.BLACK);
        texto.setFont(new Font("Comic Sans", Font.ITALIC, 22));
        texto.setForeground(Color.GREEN);
        texto.setCaretColor(Color.GREEN);

        // Criando o botão
        botao = new JButton();
        botao.setFocusable(false);
        botao.setText("Submit");
        botao.setFont(new Font("Comic Sans", Font.BOLD, 16));
        botao.setPreferredSize(new Dimension(125, 50));
        botao.addActionListener(this);

        // Setando o frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(525, 200);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setTitle("programinha");
        this.add(painel);
        this.add(botao);
        this.add(texto);

    }

    // Adicionando funcionalidade ao botão
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            String nome = texto.getText();
            this.setEnabled(false);
            JOptionPane.showMessageDialog(null, "Seja bem-vindo, " + nome, 
            "Boas-vindas", JOptionPane.DEFAULT_OPTION);
            new MeuFrame2(nome);

        }

    }

}