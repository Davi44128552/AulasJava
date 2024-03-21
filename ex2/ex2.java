package Java.exercícios.ex2;
import javax.swing.JOptionPane;

public class ex2 {

    public static void main(String[] args){

        // Lendo a informação do usuário
        String dia = JOptionPane.showInputDialog(null, "Digite o dia de hoje(da semana)");

        // Respondendo ao usuário
        switch(dia){
            // Segunda
            case "Segunda-feira":JOptionPane.showMessageDialog(null, "Poxa! Segunda :(");
            break;

            // Terça
            case "Terca-feira": JOptionPane.showMessageDialog(null, "Poxa! Terça :(");
            break;

            // Quarta
            case "Quarta-feira": JOptionPane.showMessageDialog(null, "Bruh! Quarta :|");
            break;

            // Quinta 
            case "Quinta-feira": JOptionPane.showMessageDialog(null, "Bruh! Quinta :|");
            break;

            // Sexta
            case "Sexta-feira": JOptionPane.showMessageDialog(null, "Ufa! Sexta :)");
            break;

            // Sábado
            case "Sabado": JOptionPane.showMessageDialog(null, "Eba! Sábado :D");
            break;

            // Domingo
            case "Domingo": JOptionPane.showMessageDialog(null, "Ah não! Já é Domingo :C");
            break;

            // Default
            default: JOptionPane.showMessageDialog(null, "Desculpa... Não sei que dia é este :/");
            break;
        }

    }
    
}
