package academy.devdojo.maratonajava.introducao;
/**
 * Primitive data types - includes byte, short, int, long, float, double, boolean and char
 * @see  <a href="https://www.w3schools.com/java/java_data_types.asp">Font</a>
 *
 */
public class Class02_PrimitiveTypes {
    public static void main(String[] args){
        byte myByteNum = 10;
        short myShortNum = 10;
        int myIntNum = 10;
        long myLongNum = 1000L;
        float myFloatNum = 2500.0F;
        double myDoubleNum = 2000.0D;
        boolean myBooleanTrue = true;
        boolean myBooleanFalse = false;
        char myChar = 'A';
        // String is a class not a primitive type, String is a special type of class
        String name = "Goku";

        System.out.println(((Object) myByteNum).getClass().getSimpleName() + ": " +myByteNum);
        System.out.println(((Object) myShortNum).getClass().getSimpleName() + ": " +myShortNum);
        System.out.println(((Object) myIntNum).getClass().getSimpleName()+ ": " +myIntNum);
        System.out.println(((Object) myLongNum).getClass().getSimpleName()+ ": " +myLongNum);
        System.out.println(((Object) myFloatNum).getClass().getSimpleName()+ ": " +myFloatNum);
        System.out.println(((Object) myDoubleNum).getClass().getSimpleName()+ ": " +myDoubleNum);
        System.out.println(((Object) myBooleanTrue).getClass().getSimpleName()+ ": " +myBooleanTrue);
        System.out.println(((Object) myBooleanFalse).getClass().getSimpleName()+ ": " +myBooleanFalse);
        System.out.println(((Object) myChar).getClass().getSimpleName()+ ": " +myChar);
        System.out.println(((Object) name).getClass().getSimpleName()+ ": My Name is "+name);
    }
}
