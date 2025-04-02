package academy.devdojo.maratonajava.introducao;

public class Class06_RepetitionStructure_02_Exercise {
    public static void main(String[] args) {
        // for
        for (int i = 0; i < 1000; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // while
        int count = 0;
        while (count <= 1000) {
            if (count % 2 == 0) {
                System.out.println(count);
            }
            count++;
        }
        // do-while
        int num = 0;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }while (num <= 1000);
    }
}
