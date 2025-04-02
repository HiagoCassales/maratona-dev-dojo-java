package academy.devdojo.maratonajava.introducao;
/**
 * Arithmetic Operators: +, -, *, /, %, ++, --, ==, !=, >, <, >=, <=, =, +=, -=, *=,/=, %=
 * Logic: && (AND), || (or)
 * @see <a href="https://www.w3schools.com/java/java_operators.asp">Font</a>
 * */
public class Class04_Operators {
    public static void main(String[] args) {
        int numX = 15;
        int numY = 10;

        // +, -, *, /
        System.out.println("Number one: "+(numX)+" Number two: "+(numY));

        int addition = numX + numY;
        System.out.println("Addition: "+addition);

        int subtraction = numX - numY;
        System.out.println("Subtraction: "+subtraction);

        int multiplication = numX * numY;
        System.out.println("Multiplication: "+multiplication);

        int division = numX / numY;
        System.out.println("Division: "+division);

        // % = Resto da divisão
        int modulus = numX % numY;
        System.out.println("Modulus: "+modulus);

        // ==, !=, >, <, >= or <= is basically the same as >, <, but in this situation equal numbers are true
        boolean equal = numX == numY;
        boolean equal15 = numX == 15;
        System.out.println("Equal to: "+equal);
        System.out.println("Equal to: "+equal15);

        boolean notEqual = numX != numY;
        boolean notEqual15 = numX != 15;
        System.out.println("Not equal: "+notEqual);
        System.out.println("Not equal: "+notEqual15);

        boolean greaterThan = numX > numY;
        boolean greater20 = numX > 20;
        System.out.println("Greater than: "+greaterThan);
        System.out.println("Greater than: "+greater20);

        boolean lessThan = numX < numY;
        boolean less20 = numX < 20;
        System.out.println("Less than: "+lessThan);
        System.out.println("Less than: "+less20);

        //=, +=, -=, *=,/=, %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        // ++, --
        int count = 0;
        count++;
        System.out.println(count);
        count--;
        System.out.println(count);
    }
}
