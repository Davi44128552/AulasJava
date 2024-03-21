package Java.exercícios.ex75;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MeuFrame extends JFrame implements ActionListener {

    // Declarando objetos globais
    JButton botao;
    JRadioButton botaoPizza;
    JRadioButton botaoHotDog;
    JRadioButton botaoAcai;

    MeuFrame(){

        // Criando o botão de submit
        botao = new JButton("Submit");
        botao.setPreferredSize(new Dimension(100, 35));
        botao.setFocusable(false);
        botao.addActionListener(this);

        // Adicionando os radiobuttons
            // Botão 1
        botaoPizza = new JRadioButton("Pizza");
        botaoPizza.setFocusable(false);

            // Botão 2
        botaoHotDog = new JRadioButton("Hot Dog");
        botaoHotDog.setFocusable(false);

            // Botão 3
        botaoAcai = new JRadioButton("Açaí");
        botaoAcai.setFocusable(false);

        // Adicionando os botões a um grupo
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(botaoPizza);
        grupo.add(botaoHotDog);
        grupo.add(botaoAcai);

        // Setando o frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

        // Adicionando os componentes ao frame
        this.add(botao);
        this.add(botaoPizza);
        this.add(botaoHotDog);
        this.add(botaoAcai);
        this.pack();

    }

    // Adicionando função para o botão
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            if (botaoPizza.isSelected()){
                System.out.println("Você pediu uma pizza!");
                botao.setEnabled(false);
            }

            else if (botaoHotDog.isSelected()){
                System.out.println("Você pediu um hot dog!");
                botao.setEnabled(false);
            }

            else if (botaoAcai.isSelected()){
                System.out.println("Você pediu um açaí!");
                botao.setEnabled(false);
            }

            else {
                System.out.println("Você não escolheu nenhuma das opções!");
            }

        }

    }
    
}
