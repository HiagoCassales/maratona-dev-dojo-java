package academy.devdojo.maratonajava.introducao;

public class Class07_Arrays_01 {
    public static void main(String[] args) {
        // variaveis de arrays são do tipo reference no caso (int[] idades)
        // a variavel idades faz referencia a um objeto no array no caso (new int[3])
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[2]);
    }
}
