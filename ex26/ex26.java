package Java.exercícios.ex26;

public class ex26 {

    public static void main(String[] args){

        // Criando os objetos e testando os métodos
            // Cilindro
        Cilindro cilindro = new Cilindro(2, 4);
        cilindro.calcularVolume();

            // Cone
        Cone cone = new Cone(2, 4);
        cone.calcularVolume();

            // Esfera
        Esfera esfera = new Esfera(2);
        esfera.calcularVolume();

    }
    
}
