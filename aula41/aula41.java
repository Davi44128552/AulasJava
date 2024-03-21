package Java.aula.aula41;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class aula41 {

     public static void main(String[] args){
            
            /* JPanel = Um componente GUI que funciona como um contâiner para segurar outros componentes */ 

            // Adicionando uma nova fonte
            Font fonte = new Font("MV Boli", Font.PLAIN, 18);
            
            // Criando novos painéis
                // Painel vermelho
            JPanel painelVermelho = new JPanel();
            painelVermelho.setBackground(Color.RED); // Definindo a cor
            painelVermelho.setBounds(0, 0, 250, 250); // Definindo as posições e o tamanho (x, y, width, height)
            JLabel label = new JLabel(); // Adicionando label ao painel
            label.setText("Olá, mundo");
            label.setFont(fonte);
            painelVermelho.add(label); // Add da label
            painelVermelho.setLayout(null); // Delimita o painel
            // Null -> Temos que especificar as dimensões
            label.setBounds(0, 0, 100, 100); // Vai se posicionar dentro do painel
            
            
                // Painel azul
            JPanel painelAzul = new JPanel();
            painelAzul.setBackground(Color.BLUE);
            painelAzul.setBounds(250, 0, 250, 250);
            painelAzul.setLayout(new BorderLayout());
            // BorderLayout -> Se resume a algumas dimensões
            // Usar JLabel.setVertical/HorizontalAlignment(arg)
            
                // Painel verde
            JPanel painelVerde = new JPanel();
            painelVerde.setBackground(Color.GREEN);
            painelVerde.setBounds(0, 250, 500, 300);
            painelVerde.setLayout(null);
            
            // Setando o frame
            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 500);
            frame.setLayout(null);
            
            // Adicionando os painéis
            frame.add(painelVermelho);
            frame.add(painelAzul);
            frame.add(painelVerde);
            
        }

}