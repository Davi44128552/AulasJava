package Java.exercícios.ex36;
import javax.swing.JOptionPane;

public class ex36 {

    public static void main(String[] args){

        // Criando o objeto (primeiramente indefinido)
        Animal animal;

        // Deixando a decisão para o usuário
        String escolha = JOptionPane.showInputDialog(null, "Escolha:\n[ 1 ] Cachorro\n[ 2 ] Gato");

        // Resultado
        if (escolha.equals("1")){

            animal = new Cachorro();
            animal.falar();

        }

        else if (escolha.equals("2")){

            animal = new Gato();
            animal.falar();

        }

        else{

            animal = new Animal();
            animal.falar();

        }

    }
    
}
