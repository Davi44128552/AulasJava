package Java.exercícios.ex30;

public class Retangulo implements FormaGeometrica{

    // Declarando suas variáveis
    private double largura;
    private double altura;

    // Criando o constructor
    Retangulo(double largura, double altura){

        this.setLargura(largura);
        this.setAltura(altura);

    }

    // Criando o constructor de copiar
    Retangulo(Retangulo retangulo){

        this.copiar(retangulo);

    }

    // Criando getters e setters
        // Getters
    public double getLargura(){
        return largura;
    }

    public double getAltura(){
        return altura;
    }

        // Setters
    public void setLargura(double largura){
        this.largura = largura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    // Adicionando os métodos do interface
        // Calcular Área
    @Override
    public void calcularArea(){

        double area = this.altura * this.largura;
        System.out.printf("A área do retângulo vale: %.2f u.a. \n", area);

    }

        // Calcular Perímetro
    @Override
    public void calcularPerimetro(){

        double perimetro = (2 * this.altura) + (2 * this.largura);
        System.out.printf("O perímetro do retângulo vale: %.2f \n", perimetro);

    }

    // Criando o método de copiar
    public void copiar(Retangulo retangulo){

        this.altura = retangulo.altura;
        this.largura = retangulo.altura;

    }
}
