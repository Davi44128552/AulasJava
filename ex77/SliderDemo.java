package Java.exercícios.ex77;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

class SliderDemo extends JFrame implements ChangeListener, ActionListener {

    // Criando os objetos como globais
        // Sliders
    JSlider sliderCelsius;
    JSlider sliderFahrenheint;
    JSlider sliderKelvin;

        // Painel
    JPanel painelCelsius;
    JPanel painelFahrenheint;
    JPanel painelKelvin;
    JPanel painelComboBox;
    JPanel painelGeral;

        // Label
    JLabel labelCelsius;
    JLabel labelFahrenheint;
    JLabel labelKelvin;

        // Ícone
    ImageIcon icone = new ImageIcon("C:/Users/Davi/Documents/programas/Java/exercícios/ex77/term.png");

        // Botão e suas Strings
    JComboBox<String> comboBox;
    String[] temperaturas = {"Default", "Celsius", "Fahrenheint", "Kelvin"};

    // Construtor
    SliderDemo(){

        // Configurando o comboBox
        comboBox = new JComboBox<String>(temperaturas);
        comboBox.setFocusable(false);
        comboBox.setPreferredSize(new Dimension(150, 50));
        comboBox.addActionListener(this);

        // Configurando os sliders
            // Slider Celsius
        sliderCelsius = new JSlider(0, 100, 50);
        sliderCelsius.setPreferredSize(new Dimension(400, 200));
        sliderCelsius.setOrientation(SwingConstants.VERTICAL);

        sliderCelsius.setPaintTicks(true);
        sliderCelsius.setMinorTickSpacing(10);
        sliderCelsius.setPaintTrack(true);
        sliderCelsius.setMajorTickSpacing(20);
        sliderCelsius.setPaintLabels(true);

        sliderCelsius.addChangeListener(e -> labelCelsius.setText("ºC = " + sliderCelsius.getValue()));
        sliderCelsius.addChangeListener(e -> sliderFahrenheint.setValue(Formulas.celsiusFahrenheint(sliderCelsius.getValue())));
        sliderCelsius.addChangeListener(e -> sliderKelvin.setValue(Formulas.celsiusKelvin(sliderCelsius.getValue())));

        sliderCelsius.setFont(new Font("Calibri", Font.BOLD, 12));

            // Slider Fahrenheint
        sliderFahrenheint = new JSlider(32, 212, 122);
        sliderFahrenheint.setPreferredSize(new Dimension(400, 200));
        sliderFahrenheint.setOrientation(SwingConstants.VERTICAL);

        sliderFahrenheint.setPaintTicks(true);
        sliderFahrenheint.setMinorTickSpacing(18);
        sliderFahrenheint.setPaintTrack(true);
        sliderFahrenheint.setMajorTickSpacing(36);
        sliderFahrenheint.setPaintLabels(true);

        sliderFahrenheint.addChangeListener(e -> labelFahrenheint.setText("ºF = " + sliderFahrenheint.getValue()));
        sliderFahrenheint.addChangeListener(e -> sliderCelsius.setValue(Formulas.fahrenheintCelsius(sliderFahrenheint.getValue())));
        sliderFahrenheint.addChangeListener(e -> sliderKelvin.setValue(Formulas.fahrenheintKelvin(sliderFahrenheint.getValue())));

        sliderFahrenheint.setFont(new Font("Calibri", Font.BOLD, 12));

            // Slider Kelvin
        sliderKelvin = new JSlider(273, 373, 323);
        sliderKelvin.setPreferredSize(new Dimension(400, 200));
        sliderKelvin.setOrientation(SwingConstants.VERTICAL);

        sliderKelvin.setPaintTicks(true);
        sliderKelvin.setMinorTickSpacing(10);
        sliderKelvin.setPaintTrack(true);
        sliderKelvin.setMajorTickSpacing(20);
        sliderKelvin.setPaintLabels(true);

        sliderKelvin.addChangeListener(e -> labelKelvin.setText("K = " + sliderKelvin.getValue()));
        sliderKelvin.addChangeListener(e -> sliderCelsius.setValue(Formulas.kelvinCelsius(sliderKelvin.getValue())));
        sliderKelvin.addChangeListener(e -> sliderFahrenheint.setValue(Formulas.kelvinFahrenheint(sliderKelvin.getValue())));

        sliderKelvin.setFont(new Font("Calibri", Font.BOLD, 12));

        // Configurando os labels
            // Label Celsius
        labelCelsius = new JLabel();
        labelCelsius.setText("ºC = " + sliderCelsius.getValue());

            // Label Fahrenheint
        labelFahrenheint = new JLabel();
        labelFahrenheint.setText("ºF = " + sliderFahrenheint.getValue());

            // Label Kelvin
        labelKelvin = new JLabel();
        labelKelvin.setText("K = " + sliderKelvin.getValue());

        // Configurando os painéis
            // Painel celsius
        painelCelsius = new JPanel();
        painelCelsius.setBounds(0, 25, 200, 250);
        painelCelsius.add(sliderCelsius);     
        painelCelsius.add(labelCelsius);


            // Painel fahrenheint
        painelFahrenheint = new JPanel();
        painelFahrenheint.setBounds(200, 25, 200, 250);
        painelFahrenheint.add(sliderFahrenheint);
        painelFahrenheint.add(labelFahrenheint);

            // Painel Kelvin
        painelKelvin = new JPanel();
        painelKelvin.setBounds(400, 25, 200, 250);
        painelKelvin.add(sliderKelvin);
        painelKelvin.add(labelKelvin);

            // Painel do checkbox
        painelComboBox = new JPanel();
        painelComboBox.setBounds(200, 300, 200, 200);
        painelComboBox.add(comboBox);

            // Painel Geral
        painelGeral = new JPanel();
        painelGeral.setBounds(600, 600, 10, 20);

        // Configurando o frame
        this.setTitle("Temperaturas");
        this.setIconImage(icone.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650, 450);
        this.setResizable(false);
        this.add(painelCelsius);
        this.add(painelFahrenheint);
        this.add(painelKelvin);
        this.add(painelComboBox);
        this.add(painelGeral);
        
        this.setVisible(true);

    }

// Dando funcionalidade aos sliders
    @Override
    public void stateChanged(ChangeEvent e){

    }

// Dando funcionalidade ao combobox
    @Override
    public void actionPerformed(ActionEvent e){

        if (comboBox.getSelectedItem() == "Default"){

            painelCelsius.setVisible(true);
            painelFahrenheint.setVisible(true);
            painelKelvin.setVisible(true);
            
        }

        else if (comboBox.getSelectedItem() == "Celsius"){

            painelCelsius.setVisible(true);
            painelFahrenheint.setVisible(false);
            painelKelvin.setVisible(false);

        }

        else if (comboBox.getSelectedItem() == "Fahrenheint"){

            painelFahrenheint.setVisible(true);
            painelCelsius.setVisible(false);
            painelKelvin.setVisible(false);

        }

        else if (comboBox.getSelectedItem() == "Kelvin"){

            painelKelvin.setVisible(true);
            painelCelsius.setVisible(false);
            painelFahrenheint.setVisible(false);

        }

    }

}