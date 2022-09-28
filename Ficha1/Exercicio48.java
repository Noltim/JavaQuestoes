import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        if (idade >= 12 && peso >= 60) {
            //int gotas = 1000 / 2;
            System.out.println("Você deve tomar 40 gotas!");
        } else if (idade < 12 && peso < 60) {
            System.out.println("Você deve tomar 35 gotas!");
        } else if (peso >= 5 && peso <= 9) {
            System.out.println("Você deve tomar 5 gotas!");
        } else if (peso > 9 && peso <= 16) {
            System.out.println("Você deve tomar 10 gotas!");
        } else if (peso > 16 && peso <= 24) {
            System.out.println("Você deve tomar 15 gotas!");
        } else if (peso > 24 && peso <= 30) {
            System.out.println("Você deve tomar 20 gotas!");
        }else if (peso > 30) {
            System.out.println("Você deve tomar 30 gotas!");
        }

            sc.close();
    }
}
