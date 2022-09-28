import java.util.Locale;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        double IMC = peso / Math.pow(altura, 2);

        if (IMC < 20) {
            System.out.println("IMC = " + IMC + " - " + "Abaixo do peso");
        }else if (IMC < 25){
            System.out.println("IMC = " + IMC + " - " + "Peso normal");
        }else if (IMC < 30) {
            System.out.println("IMC = " + IMC + " - " + "Sobre peso");
        }else if (IMC < 40) {
            System.out.println("IMC = " + IMC + " - " + "Obeso");
        }else{
            System.out.println("IMC = " + IMC + " - " + "Obeso Mórbido");
        }



        sc.close();
    }
}
