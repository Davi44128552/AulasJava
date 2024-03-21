package Java.aula.aula38;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class aula38 {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        /* Aprendendo a dar play em áudios */

        // Criando o scanner
        Scanner scanner = new Scanner(System.in);

        // Lendo o arquivo
        File file = new File("C:/Users/Davi/Documents/programas/Java/aula/aula38/audio.wav");

        // Abrindo o áudio
        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
        Clip clipe = AudioSystem.getClip();
        clipe.open(audio);

        // Começando o áudio
        clipe.start();
        String x = scanner.next();
        System.out.println(x);
        scanner.close();

    }
    
}
