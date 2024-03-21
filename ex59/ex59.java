package Java.exercícios.ex59;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class ex59 {

    public static void main(String[] args) throws IOException, LineUnavailableException, UnsupportedAudioFileException{

        // Adicionando o áudio
        File file = new File("C:/Users/Davi/Documents/programas/Java/aula/aula38/audio.wav");
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clipe = AudioSystem.getClip();
        clipe.open(audio);
        clipe.start();

        // Criando um cursor
        Cursor cursor = new Cursor(1);

        // Criando uma borda
        Border borda = BorderFactory.createLineBorder(Color.CYAN, 20, false);

        // Criando imagem
        ImageIcon imagem = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula40/ned.jpg");

        // Criando fonte
        Font fonte = new Font("MV Boli", Font.PLAIN, 24);

        // Criando a label
        JLabel label = new JLabel();
        label.setIcon(imagem);
        label.setText("Nerd fudido :B");
        label.setFont(fonte);

        // Posicionando o texto
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIconTextGap(10);

        // Posicionando o label
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        // Adicionando uma borda
        label.setBorder(borda);

        // Criando o frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(imagem.getImage());
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setCursor(cursor);
        frame.add(label);

    }
    
}
