package Java.aula.aula39;
import java.awt.Cursor;
import javax.swing.JFrame; // Importando o JFrame
import javax.swing.ImageIcon; // Importando o ImageIcon
import java.awt.Color; // Importando o Color

public class aula39 {

    public static void main(String[] args){

        /* GUI = Parte visual do programa
           JFrame = Uma janela GUI para adicionar novos componentes */

        // Criando um novo JFrame
        JFrame frame = new JFrame();

        // Setando o tamanho da tela
        frame.setSize(420, 420);

        // Setando o título da tela
        frame.setTitle("Programa legal!");

        // Permitindo ou não redimensionar
        frame.setResizable(true); // True = redimensiona / False = não redimensiona

        // Criando um ícone para o programa
        ImageIcon imagem = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula39/logo.png");
        frame.setIconImage(imagem.getImage()); // Mudando o ícone

        // Definindo uma cor de fundo para o programa
        Color cor = new Color(0xffda9e); // Criando uma nova cor (Pode ser usado rgb ou hexadecimal)
        frame.getContentPane().setBackground(cor); // Pode escolher uma cor da própria biblioteca ou criar uma

        // Fechando o programa e encerrando
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Deixando o JFrame visível
        frame.setVisible(true);

        // Criando um cursor
        Cursor cursor = new Cursor(1); // Criando o objeto do cursor
        frame.setCursor(cursor); // Adicionando o cursor à tela

        /* ! -> É possível criar uma nova classe que armazenará tais informações (Pode ser recomendável) 
                Caso seja criada a classe, apenas use this. */

    }
    
}
