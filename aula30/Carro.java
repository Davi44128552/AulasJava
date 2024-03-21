package Java.aula.aula30;

public class Carro {

    // Declarando as variáveis
    private String marca;
    private String modelo;
    private int ano;

    // Criando o constructor
    Carro(String marca, String modelo, int ano){

        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);

    }

        // Criando o constructor de copiar
    Carro(Carro carro){
        this.copiar(carro);
    }


    // Criando os getters e setters
        // Getters
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

        // Setters
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    // Criando o método de copiar
    public void copiar(Carro carro){
        
        this.marca = carro.marca;
        this.modelo = carro.modelo;
        this.ano = carro.ano;

    }

}
