package Java.aula.aula21;

public class aula21 {

    public static void main(String[] args){

        // Array de objetos
        // Criando o array
        aula21o[] comidas = new aula21o[4];

        // Criando os objetos das comidas
        aula21o comida1 = new aula21o("Macarrao");
        aula21o comida2 = new aula21o("Arroz");
        aula21o comida3 = new aula21o("Feijao");
        aula21o comida4 = new aula21o("Frango");

        // Adicionando as comidas ao array
        comidas[0] = comida1;
        comidas[1] = comida2;
        comidas[2] = comida3;
        comidas[3] = comida4;

        // Pritando o array
        for (int i = 0; i < comidas.length; i++){
            System.out.println(comidas[i].nome);
        }

        // Forma alterantiva
        aula21o[] comidas2 = {comida1, comida2, comida3, comida4};

        // Printando
        for (int i = 0; i < comidas2.length; i++){
            System.out.println(comidas2[i].nome);
        }


    }
    
}
