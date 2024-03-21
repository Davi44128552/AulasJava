package Java.aula.aula48;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class aula48 {

    public static void main(String[] args){

        /* JOptionPane = Mostra uma caixa de diálogo que pede um valor ao usuário ou infomam algo */

        // Mostrando algumas mensagens 
            // ! -> ParentComponent, mensagem, título e imagem de aviso
        JOptionPane.showMessageDialog(null, "Aqui está uma mensagem default", "default", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Aqui está uma mensagem informativa", "info", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Aqui está uma mensagem de pergunta", "pergunta", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Aqui está uma mensagem de aviso", "aviso", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Aqui está uma mensagem de erro", "erro", JOptionPane.ERROR_MESSAGE);

        // Mostrando um pedido de confirmação  
            // ! -> ParentComponent, mensagem, título e opções ao usuário  
            // ! -> "sim": 0; "não": 1; "cancel": 2; "fechar(X): -1"
        JOptionPane.showConfirmDialog(null, "Aqui é um pedido de confirmação", "confirma", JOptionPane.YES_NO_CANCEL_OPTION);

        // Mostrando uma pergunta qualquer
        JOptionPane.showInputDialog(null, "Aqui está um pedido de dado", "dado", JOptionPane.QUESTION_MESSAGE);

        // Mensagem geral
            // Setando algumas configs antes
        ImageIcon icone = new ImageIcon("C:/Users/Davi/Documents/programas/Java/aula/aula42/icone.png");
        String[] argumentos = {"Ok", "Belê", "Bruh"};

            // Setando o JOptionPane
        JOptionPane.showOptionDialog(null, "Este é geral", 
        "geral", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, 
        icone, argumentos, 0);

    }
    
}
