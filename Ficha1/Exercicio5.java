import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        
        int [] numbers = new int[3];

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<numbers.length; i++){
            System.out.println((i+1)+"º Number: ");
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
            }
            sc.close();
    }
       
}
