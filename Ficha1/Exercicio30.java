import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um valor: ");
        int n2 = sc.nextInt();

        int soma = 0;

        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.print((i) + " ");
                soma += i;
            }
        } else if (n1 > n2) {
            for (int i = n2; i <= n1; i++) {
                System.out.print((i) + " ");
                soma += i;
            }
        }
        System.out.println("Soma = " + soma);

        sc.close();
    }
}
