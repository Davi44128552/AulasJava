package Java.aula.aula50;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MeuFrame extends JFrame implements ActionListener {

    // Criando objetos como globais
    JButton botao;
    JCheckBox checkbox;

    // Criando o construtor
    MeuFrame(){

        // Adicionando as fotos
        ImageIcon cross = new ImageIcon("C://Users/Davi/Documents/programas/Java/aula/aula50/cross.png");
        ImageIcon check = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula50/check.png");

        // Criando um botão
        botao = new JButton();
        botao.setText("Submit");
        botao.setFocusable(false);
        botao.addActionListener(this);

        // Criando a checkbox
        checkbox = new JCheckBox();

            // Personalizando
        checkbox.setText("Você é legal?"); // Adicionando um texto à checkbox
        checkbox.setFont(new Font("Times New Roman", Font.BOLD, 24)); // Adicionando fonte ao texto
        checkbox.setFocusable(false); // Removendo as bordinhas pontilhadas
        checkbox.setIcon(cross); // Personalizando o checkbox
        checkbox.setSelectedIcon(check); // Personalizando o checkbox quando marcado

        // Setando o frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(botao); // Adicionando o botão
        this.add(checkbox); // Adicionando o checkbox
        this.pack();
        this.setVisible(true);

    }

    // Adicionando funcionalidade ao botão
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            // Lendo a informação
            boolean resultado = checkbox.isSelected();

            // Resultado
            if (resultado){
                System.out.println("Que bom! É um prazer te conhecer :)");
            }

            else {
                System.out.println("*Surpreso* Meu deus! Não acredito :O");
            }

            // Desabilitando ambos
            checkbox.setEnabled(false);
            botao.setEnabled(false);

        }

    }

}