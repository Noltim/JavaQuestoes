import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º lado do triângulo: ");
        int l1 = sc.nextInt();
        System.out.println("Digite o 2º lado do triângulo: ");
        int l2 = sc.nextInt();
        System.out.println("Digite o 3º lado do triângulo: ");
        int l3 = sc.nextInt();

        if ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l2 + l1)) {
            if ((l1 == l2) && (l1 == l3)) {
                System.out.println("Triângulo Equilátero");
            }
            if (((l1 == l2) && (l1 != l3)) || ((l1 == l3) && (l1 != l2)) || ((l2 == l3) && (l2 != l1))) {
                System.out.println("Triângulo Isósceles");
            }
            if ((l1 != l2) && (l1 != l3) && (l2 != l3)) {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo");
        }

        sc.close();
    }
}