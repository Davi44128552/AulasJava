package Java.aula.aula4;
import javax.swing.JOptionPane; // Modulo que vai permitir GUI

public class aula4 {

    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Coloque aqui o seu nome"); // Msg para adicionar algo
        JOptionPane.showMessageDialog(null, "Prazer em te conhecer, " + name); // Msg

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos anos você tem?")); // Conversão
        JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos de idade");

        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "E qual é a sua altura?"));
        JOptionPane.showMessageDialog(null, "Você tem " + altura + "m de altura");

    }
    
}
