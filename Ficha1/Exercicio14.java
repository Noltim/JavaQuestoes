import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        System.out.println("Digite a quantidade de interações: ");
        int interacao = leia.nextInt();

        int contador = 0;

        for (int i = numero; i < 9999; i++) {
            if (i % 2 == 1 && contador < interacao) {
                System.out.println(i);
                contador++;
            }
        }

        leia.close();
    }
}
