package Java.aula.aula52;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

class MeuFrame extends JFrame implements ActionListener {

    // Criando objetos globais
    JComboBox<String> comboBox;
    JButton botao;

    // Strings
    String pizza;
    String acai;
    String sushi;
    String pastel;
    String burger;

    // Criando o construtor
    MeuFrame() {

        // Configurando o botão
        botao = new JButton();

            // Configurano o botão
        botao.setText("Submit");
        botao.setFocusable(false);
        botao.addActionListener(this);

        // Criando Strings para adicionar à combobox
        pizza = "Pizza";
        acai = "Açaí";
        sushi = "Sushi";
        pastel = "Pastel";
        burger = "Hambúrguer";

        // Configurando o botão combobox
        comboBox = new JComboBox<String>();

            // Adicionando strings à combobox
            comboBox.addItem(pizza);
            comboBox.addItem(acai);
            comboBox.addItem(sushi);
            comboBox.addItem(pastel);

            // Adicionando um item em uma posição específica
            comboBox.insertItemAt(burger, 1);

            // Printando o número de itens no combobox
            System.out.println(comboBox.getItemCount());
        
        // Setando as configurações iniciais do frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(botao);
        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    // Adicionando funcionalidade
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            // Mostrando a opção que o usuário selecionou

            if (comboBox.getSelectedItem() == pizza){
                JOptionPane.showMessageDialog(null, "Você pediu uma pizza!");
            }

            else if (comboBox.getSelectedItem() == burger){
                JOptionPane.showMessageDialog(null, "Voce pediu um hambúrguer!");
            }

            else if (comboBox.getSelectedItem() == acai){
                JOptionPane.showMessageDialog(null, "Você pediu um açaí!");
            }

            else if (comboBox.getSelectedItem() == sushi){
                JOptionPane.showMessageDialog(null, "Você pediu um sushi!");
            }


            else if (comboBox.getSelectedItem() == pastel){
                JOptionPane.showMessageDialog(null, "Você pediu um pastel!");
            }

            // Mostrando o índice do item que o usuário selecionou
            System.out.println(comboBox.getSelectedIndex());

        }

    }
    
}
