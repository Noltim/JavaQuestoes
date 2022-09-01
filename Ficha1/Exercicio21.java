import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] yearsModels = new int[3];
		Double[] speeds = new Double[3];
		
		
		for (int i = 0; i < yearsModels.length; i++) {
			while(true) {
				System.out.print("Digite o ano do " + (i+1) + "ª carro: ");
				try {
					yearsModels[i] = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					sc.next();
					System.err.println("Digite apenas valores númericos!");
				}
			}
			
			while(true) {
				System.out.print("Digite a velocidade do " + (i+1) + "ª carro: ");
				try {
					speeds[i] = sc.nextDouble();
					break;
				} catch (InputMismatchException e) {
					sc.next();
					System.err.println("Digite apenas valores númericos!");
				}
			}
		}
		
		Arrays.sort(yearsModels);
		Arrays.sort(speeds);
		
		
		System.out.println("Ano do carro mais novo: " + yearsModels[speeds.length-1]);
		System.out.println("Velocidade do carro mais rápido: " + speeds[speeds.length-1]);
		
		
		sc.close();
	}
}
