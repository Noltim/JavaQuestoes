import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter first grade: ");
        double grade1 = sc.nextDouble();
        System.out.println("Enter second grade: ");
        double grade2 = sc.nextDouble();

        double media = ((grade1 * 3.5) + (grade2 * 7.5)) / 11;

        System.out.printf("Média do aluno: %.5f%n", media);

        sc.close();
    }
}
