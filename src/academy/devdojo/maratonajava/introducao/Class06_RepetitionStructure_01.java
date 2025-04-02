package academy.devdojo.maratonajava.introducao;

public class Class06_RepetitionStructure_01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println("while " + ++count);
        }
        // do-while, pelo menos o primeiro loop tera a condição como true mesmo que não seja
        int count2 = 0;
        do {
            System.out.println("do-while " + ++count2);
        } while (count2 < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("for "+i);
        }
    }
}
