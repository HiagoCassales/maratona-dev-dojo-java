package academy.devdojo.maratonajava.introducao;

public class Class05_ConditionsStructure_05 {
    public static void main(String[] args) {
        byte day = 6;
        switch (day) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        char sexo = 'M';
        switch (sexo){
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo inválido");
                break;
        }
    }
}
