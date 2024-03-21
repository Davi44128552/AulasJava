package Java.exercícios.ex10;
import java.util.Scanner;

public class ex10 {

     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inicio: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Fim: ");
        int fim = scanner.nextInt();
        
        System.out.print("Passo: ");
        int passo = scanner.nextInt();
        
        contador(inicio, fim, passo);
        
        scanner.close();
        
    }
    
    static void contador(int a, int b, int c){
        
        int i = a;
        
        if (a > b){
            while (i > b){
                System.out.println(i);
                i = i - c;
            }
            
            System.out.println("FIM");
        }
        
        else{
            while (i < b){
                System.out.println(i);
                i = i + c;
            }
            
            System.out.println("FIM");
        }
        
    }
    
    
}
