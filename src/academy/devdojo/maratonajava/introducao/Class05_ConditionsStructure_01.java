package academy.devdojo.maratonajava.introducao;

public class Class05_ConditionsStructure_01 {
    public static void main(String[] args) {
        int idade = 22;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println(("Você pode comprar bebidas"));
        }
        if (!isAutorizadoComprarBebida){
            System.out.println("Você não pode comprar bebidas");
        }
        // oq esta entre () será executado primeiro, então nesse caso transformando c false em c true
        boolean c = false;
        if (c = true) {
            System.out.println("Entrou no if");
        }

    }
}
