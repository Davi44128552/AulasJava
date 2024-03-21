package Java.exercícios.ex17;

public class Calculadora {

    // Criando o metodo da calculadora de area de retangulos
    void calc_ret(Retangulo retangulo){

        double area = retangulo.altura * retangulo.largura;
        System.out.printf("A area do retangulo vale %.2f \n", area);

    }

    // Criando o metodo da calculadora de area por circulo
    void calc_circ(Circulo circulo){

        double area = ((circulo.raio)*(circulo.raio))* Math.PI;
        System.out.printf("A area do circulo vale %.2f \n", area);

    }
    
}
