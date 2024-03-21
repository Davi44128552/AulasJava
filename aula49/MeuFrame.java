package Java.aula.aula49;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MeuFrame extends JFrame implements ActionListener {


    // Declarando alguns objetos
    JButton botao;
    JTextField texto;

    MeuFrame() {

        /* Um componente GUI de caixa de texto que pode ser usada para adicionar, setar ou obter texto */
        
        // Criando um textfield
        texto = new JTextField();
        texto.setPreferredSize(new Dimension(250, 50)); // Definindo as dimensões

            // Personalizando o textfield
        texto.setFont(new Font("Arial", Font.ITALIC, 18)); // Colocando uma fonte
        texto.setText("nickname"); // Adicionando um texto
        texto.setForeground(Color.GREEN); // Pintando as cores
        texto.setBackground(Color.BLACK); // Pintando o fundo
        texto.setCaretColor(Color.GREEN); // Pintando o cursor de texto
        texto.setEditable(true); // Permite que o usuário digite

        // Criando o botão
        botao = new JButton();
        botao.setText("submit");
        botao.setFocusable(false);
        botao.addActionListener(this);

        // Setando o frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Textfield");
        this.setLayout(new FlowLayout(1, 5, 5));
        this.add(botao);
        this.add(texto);
        this.pack();
        this.setVisible(true);

    }

    // Dando funcionalidade ao botão
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            JOptionPane.showMessageDialog(null, "Seja bem-vindo "+ texto.getText(), 
            "boas-vindas", JOptionPane.PLAIN_MESSAGE);
            botao.setEnabled(false);
            texto.setEditable(false);

        }

    }
    
}
