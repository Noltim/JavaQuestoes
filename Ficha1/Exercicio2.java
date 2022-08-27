import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu ID: ");
        int id = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas pelo funcionário: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor que você recebe por horas trabalhadas: ");
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("Id do funcionári: " + id);
        System.out.printf("Salário: R$ %.2f%n", salario);


        sc.close();
    }
}
