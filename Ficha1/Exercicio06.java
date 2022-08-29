import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida em KM: ");
        int distanciaPercorrida = sc.nextInt();
        System.out.println("Digite a quantidade de combustível gasto em litros: ");
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = distanciaPercorrida/combustivelGasto;

        System.out.printf("Consumo médio: %.3f%n", consumoMedio);
        
        sc.close();
    }
}
