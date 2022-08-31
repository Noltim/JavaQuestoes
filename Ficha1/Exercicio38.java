import java.util.Scanner;

public class Exercicio38Ficha {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber se é primo ou não: ");
        int numero = sc.nextInt();

            if (ehPrimo(numero)) {
                System.out.println("É primo");
            } else {
                System.out.println("Não é primo");
            }


        sc.close();
    }

    static boolean ehPrimo(int n)
    {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
}
