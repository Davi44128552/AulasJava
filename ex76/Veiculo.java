package Java.exercícios.ex76;

class Veiculo {

    // Declarando as variáveis do objeto
    private String modelo;
    private String cor;
    private int ano;
    private boolean isLigado = false; 

    // Criando o construtor
    Veiculo(String modelo, String cor, int ano){

        this.setModelo(modelo);
        this.setCor(cor);
        this.setAno(ano);

    }

    // Getters
    public String getModelo(){
        return modelo;
    }

    public String getCor(){
        return cor;
    }

    public int getAno(){
        return ano;
    }

    // Setters
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    // Criando métodos extras
        // Ligando o veículo
    public void ligarVeiculo(){

        if (isLigado){
            System.out.println("O veículo já está ligado!");
        }

        else {

            System.out.println("O veículo acabou de ligar!");
            isLigado = true;

        }

    }

        // Desligando o veículo
    public void desligarVeiculo(){

        if (isLigado){

            System.out.println("O veículo acabou de desligar!");
            isLigado = false;

        }

        else {
            System.out.println("O veículo já está desligado!");
        }

    }
    
}
