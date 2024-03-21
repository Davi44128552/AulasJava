package Java.aula.aula47;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NovoFrame{

    // Declarando o label
    JFrame frame;
    JLabel label;

    // Construtor
    NovoFrame(){

        // Configurando o label
        label = new JLabel();
        label.setOpaque(true);

            // Personalizando
        label.setText("Você clicou em mim :O");

            // Posicionando o label
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);


        // Configurando o novo frame
        frame = new JFrame();
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);



    }

}
