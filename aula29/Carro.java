package Java.aula.aula29;

public class Carro {

    // Declarando as variáveis
    private String marca;
    private String modelo;
    private int ano;

    // Criando o constructor
    Carro(String marca, String modelo, int ano){ // Pode deixar o constructor como public

        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);

    }

    // Criando os getters (Apenas para acessar)
    public String getMarca(){ // Devem ser públicos
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    // Criando os setters (Para modificar)
    public void setMarca(String marca){ // Devem ser públicos
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    // ! -> No casso dos setters, é necessário colocá-los no constructor
    
}
