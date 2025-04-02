package academy.devdojo.maratonajava.introducao;

public class Class06_RepetitionStructure_04_Exercise {
    public static void main(String[] args) {
        double valorCarro = 40000;
        for (int i = 1; i <= valorCarro ; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcelas: "+i+ "R$: "+valorParcela);
        }
    }
}
