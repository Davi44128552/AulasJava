package Java.exercícios.ex68;

// Importando alguns módulos
import javax.swing.JOptionPane;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import javax.sound.sampled.*;

public class MeuFrame extends JFrame implements ActionListener{

    // Declarando alguns objetos que serão globais
    JButton botao;
    Clip clipe;
    AudioInputStream audio;

    // Abrindo o construtor
    MeuFrame() throws IOException, UnsupportedAudioFileException, LineUnavailableException{

        // Criando o ícone
        ImageIcon icone = new ImageIcon("C:/Users/Davi/Documents/programas/Java/exercícios/ex68/volume.png");
        ImageIcon iconeBotao = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula42/icone.png");

        // Lendo o áudio
        File file = new File("C:/Users/Davi/Documents/programas/Java/aula/aula38/audio.wav");
        audio = AudioSystem.getAudioInputStream(file);
        clipe = AudioSystem.getClip();
        clipe.open(audio);

        // Criando o botão
        botao = new JButton();
        botao.setBounds(370, 200, 200, 100);
        botao.setVisible(true);
        botao.addActionListener(this); // Adicionando a funcionalidade ao botão

            // Personalizando o botão
        botao.setText("Música");
        botao.setFocusable(false);
        botao.setBackground(new Color(0xffddd9));
        botao.setFont(new Font("comic sans", Font.BOLD, 18));
        botao.setIcon(iconeBotao);
        botao.setVerticalTextPosition(JButton.TOP);
        botao.setHorizontalTextPosition(JButton.CENTER);

        // Setando as configurações iniciais do frame
        this.setVisible(true);
        this.setSize(960, 540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

            // Personalizando o frame
        this.getContentPane().setBackground(new Color(0xffbcb3));
        this.setTitle("MAV Player");
        this.setIconImage(icone.getImage());
        this.setCursor(new Cursor(1));


            // Adicionando itens ao frame
        this.add(botao);

    }

    // Configurando a função do botão
    @Override 
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == botao){

            clipe.start();
            botao.setBackground(Color.white);
            JOptionPane.showMessageDialog(null, "Só na musiquinha...");

        }

    }
    
}
