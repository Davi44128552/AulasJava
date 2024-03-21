package Java.exercícios.ex11;

public class Cafe {

    // Adicionando atributos
    String cor = "Preto";
    double temperatura = 35.0;
    boolean cheio = true;

    // Adicionando metodos
    void beber(){
        System.out.println("Voce bebeu um pouco do cafe!");
        cheio = false;
    }

    void por(){  
        if (cheio){
            System.out.println("Oh nao! A xicara esta vazando!");
        }

        else{
            System.out.println("Voce pos um pouco de cafe na xicara");
            cheio = true;
        }
    }
    
}
