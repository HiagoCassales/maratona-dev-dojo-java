package academy.devdojo.maratonajava.introducao;

public class Class05_ConditionsStructure_03 {
    public static void main(String[] args){
        // operador ternario
        double salario = 7000;
        String msgDoar = "Eu vou doar 500 para o DevDojo";
        String msgNaoDoar = "ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? msgDoar : msgNaoDoar;

        System.out.println(resultado);
    }
}