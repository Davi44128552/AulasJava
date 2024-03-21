package Java.aula.aula51;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class MeuFrame extends JFrame implements ActionListener {

    // Declarando objetos globais
    JRadioButton botaoPizza;
    JRadioButton botaoHamburguer;
    JRadioButton botaoHotdog;

    // Construtor
    MeuFrame(){

        // Adicionando os botões
            // Botão 1
        botaoPizza = new JRadioButton("Pizza");
        botaoPizza.setFocusable(false);
        botaoPizza.addActionListener(this);

            // Botão 2
        botaoHamburguer = new JRadioButton("Hambúrguer");
        botaoHamburguer.setFocusable(false);
        botaoHamburguer.addActionListener(this);

            // Botão 3
        botaoHotdog = new JRadioButton("Hot Dog");
        botaoHotdog.setFocusable(false);
        botaoHotdog.addActionListener(this);

        // Adicionando os botões a um grupo
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(botaoPizza);
        grupo.add(botaoHamburguer);
        grupo.add(botaoHotdog);

        // Setando o frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        // Adicionando os botões ao frame
        this.add(botaoPizza);
        this.add(botaoHamburguer);
        this.add(botaoHotdog);
        this.pack();

    }

    // Adicionando funcionalidade aos botões
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botaoPizza){
            System.out.println("Você pediu uma pizza!");
        }

        else if (e.getSource() == botaoHamburguer){
            System.out.println("Você pediu um hambúrguer!");
        }

        else if (e.getSource() == botaoHotdog){
            System.out.println("Você pediu um Hot Dog!");
        }

    }

}