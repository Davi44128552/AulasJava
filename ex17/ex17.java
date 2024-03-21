package Java.exercícios.ex17;

public class ex17 {

    public static void main(String[] args){

        // Criando a calculadora
        Calculadora calculadora = new Calculadora();

        // Criando os objetos do retangulo e do circulo
        Retangulo retangulo = new Retangulo(5, 10);
        Circulo circulo = new Circulo(7);

        // Chamando os metodos
            // Area_retangulo
        calculadora.calc_ret(retangulo);

            // Area_Circulo
        calculadora.calc_circ(circulo);

    }
    
}
