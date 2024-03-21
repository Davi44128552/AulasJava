package Java.aula.aula47;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MeuFrameInicial extends JFrame implements ActionListener {

    // Declarando variáveis gerais
    JButton botao;

    // Criando o construtor
    MeuFrameInicial(){

        // Configurando o botão
        botao = new JButton("Clique-me");
        botao.setBounds(200, 225, 100, 50);
        botao.addActionListener(this);

        // Setando o frame
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);

        // Adicionando o botão
        this.add(botao);

    }

    // Sobreescrevendo o método
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            this.dispose();
            new NovoFrame();
            
        }

    }
    
}
