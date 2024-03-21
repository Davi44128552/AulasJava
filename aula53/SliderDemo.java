package Java.aula.aula53;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class SliderDemo implements ChangeListener {

    // Declarando os objetos globais
    JFrame frame;
    JPanel painel;
    JLabel label;
    JSlider slider;

    // Construtor
    SliderDemo(){

        // Criando os objetos
        frame = new JFrame("SliderDemo");
        painel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50); // min/max/inicio

        // Configurando o slider
        slider.setPreferredSize(new Dimension(400, 200)); // Definindo as dimensões

        slider.setPaintTicks(true); // Adicionando bordas (visibilidade das divisões)
        slider.setMinorTickSpacing(5); // Setando as divisões do slider entre intervalos (pequenos)

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(10); // Setando as divisões do slider entre os intervalos (grandes)

        slider.setPaintLabels(true); // Setando os números presentes nos intervalos (grandes)

        slider.setFont(new Font("Calibri", Font.BOLD, 12)); // Colocando uma fonte nos nº

        slider.setOrientation(SwingConstants.VERTICAL); // Colocando o slider na vertical

        slider.addChangeListener(this); // Adicionando a funcionalidade no slider

        // Configurando a label
        label.setFont(new Font("Calibri", Font.BOLD, 15));
        label.setText("ºC = " + slider.getValue());

        // Configurando o painel
        painel.add(slider);
        painel.add(label);

        // Configurando o frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(painel);
        frame.setSize(420, 420);
        frame.setVisible(true);

    }

    // Adicionando funcionalidade ao slide
    @Override
    public void stateChanged(ChangeEvent e){

        label.setText("ºC = " + slider.getValue());

    }
    
}
