package academy.devdojo.maratonajava.introducao;

public class Class07_Arrays_02 {
    public static void main(String[] args) {
        // Valores padrões de inicialização
        // byte, short, int, long, float e double e 0
        // char e '\u0000' = ' '
        // boolean e false
        // String e null

        String[] nomes = new String[3];
        nomes[0] = "Hiago";
        nomes[1] = "Rute";
        nomes[2] = "Roberto";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
