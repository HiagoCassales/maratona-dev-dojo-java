package academy.devdojo.maratonajava.introducao;

public class Class06_RepetitionStructure_05 {
    public static void main(String[] args) {
        double valorCarro = 40000;
        for (int i = (int) valorCarro; i >= 1 ; i--) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcelas: "+i+ "R$: "+valorParcela);
        }
    }
}
