package academy.devdojo.maratonajava.introducao;

public class Class07_Arrays_03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3};

        for (int num : numeros3) {
            System.out.println(num);
        }
    }
}
