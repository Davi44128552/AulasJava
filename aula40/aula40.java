package Java.aula.aula40;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class aula40 {

    public static void main(String[] args){

        /* JLabel = Um display por uma string de texto, imagem ou ambos */

        // Criando uma cor
        Color cor = new Color(0x120a8f);
        Color cor2 = new Color(0x98ff98);

        // Criando uma fonte
        Font fonte = new Font("MV Boli", Font.PLAIN, 24);

        // Adicionando uma imagem
        ImageIcon imagem = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula40/ned.jpg");

        // Criando uma borda
        Border borda = BorderFactory.createLineBorder(Color.orange, 5);


        // Criando o label
        JLabel label = new JLabel();
        label.setText("Bro, você já programou?"); // Adicionando um texto
        label.setIcon(imagem); // Adicionando uma imagem

        // Ajustando a posição do texto
        label.setHorizontalTextPosition(JLabel.CENTER); // Horizontal
        label.setVerticalTextPosition(JLabel.TOP);

        // Ajustando a posição da label
        label.setVerticalAlignment(JLabel.CENTER); // Vertical
        label.setHorizontalAlignment(JLabel.CENTER); // Horizontal
        
        // Criando o frame
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configurando a fonte
        label.setForeground(cor);
        label.setFont(fonte);

        // Distância do texto e da imagem
        label.setIconTextGap(-5);

        // Adicionando uma cor para o fundo
        label.setBackground(cor2);
        label.setOpaque(true); // Deixar o fundo visível

        // Setando uma borda
        label.setBorder(borda);

        // Adicionando a label ao frame
        frame.add(label);
        frame.pack(); // Redimensiona a tela para o label (USADO APENAS DEPOIS DE CONFIGURAR TUDO)



    }
    
}
