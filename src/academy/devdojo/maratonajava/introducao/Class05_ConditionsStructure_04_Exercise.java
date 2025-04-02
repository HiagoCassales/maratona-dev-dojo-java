package academy.devdojo.maratonajava.introducao;

public class Class05_ConditionsStructure_04_Exercise {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.50 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorimposto;

        if (salarioAnual <= 34712){
            valorimposto = salarioAnual * primeiraFaixa;
        }else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            valorimposto = salarioAnual * segundaFaixa;
        }else {
            valorimposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorimposto);
    }
}
