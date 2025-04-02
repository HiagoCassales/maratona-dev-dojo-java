package academy.devdojo.maratonajava.introducao;

public class Class05_ConditionsStructure_02_Exercise {
    public static void main(String[] args) {
        int idade = 22;
        String categoria;
        if (idade < 15){
            categoria = "Categoria Infatil";
        }else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        }else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
