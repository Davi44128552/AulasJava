package Java.exercícios.ex76;

public class ex76 {

    public static void main(String[] args){

        // Criando dois objetos 
            // Veiculo 1
        Veiculo veiculo1 = new Veiculo("Gol", "Azul", 2010);

                // Testando os getters
        System.out.println("========== GETTERS ==========");
        System.out.println(veiculo1.getModelo());
        System.out.println(veiculo1.getCor());
        System.out.println(veiculo1.getAno());

                // Testando os métodos criados
        System.out.println("========== MÉTODOS ==========");
        veiculo1.ligarVeiculo();
        veiculo1.ligarVeiculo();
        veiculo1.desligarVeiculo();
        veiculo1.desligarVeiculo();

        System.out.println();

            // Veículo 2
        Veiculo veiculo2 = new Veiculo("Corolla", "Cinza", 2014);

                // Testando os getters
        System.out.println("========== GETTERS ==========");
        System.out.println(veiculo2.getModelo());
        System.out.println(veiculo2.getCor());
        System.out.println(veiculo2.getAno());

                // Testando os métodos criados
        System.out.println("========== MÉTODOS ==========");
        veiculo2.ligarVeiculo();
        veiculo2.ligarVeiculo();
        veiculo2.desligarVeiculo();
        veiculo2.desligarVeiculo();

    }
    
}
