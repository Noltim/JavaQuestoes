import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        String name;
        double fixedWage,finalWage, sales;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("fixedWage: ");
        fixedWage = sc.nextDouble();
        System.out.println("Sales: ");
        sales = sc.nextDouble();

        finalWage = fixedWage + (sales*0.15);

        System.out.printf("Total: %.2f%n", finalWage);


    }
}
