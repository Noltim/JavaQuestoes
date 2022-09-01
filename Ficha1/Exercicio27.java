import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] verifiedMeasurement = new int[4];
		
		Double sum = 0.0, avarage;
		
		
		for (int i = 0; i < verifiedMeasurement.length; i++) {
			
			while(true) {
				System.out.print("Digite a " + (i+1) + "ª aferição do dia: ");
				try {
					verifiedMeasurement[i] = sc.nextInt();
					sum += verifiedMeasurement[i];
					if(verifiedMeasurement[i] <= 110) {
						System.out.println("NORMAL");
					} else if (verifiedMeasurement[i] > 110 & verifiedMeasurement[i] < 125) {
						System.out.println("ALTERADA");
					} else if (verifiedMeasurement[i] > 125) {
						System.out.println("MUITO ALTA");
					}
					break;
				} catch (InputMismatchException e) {
					sc.next();
					System.err.println();
				}
			}
			
		}
		
		avarage = sum / verifiedMeasurement.length;
		
		
		System.out.println("MÉDIA DAS LEITURAS: " + avarage);
		
		sc.close();
		
		
	}
}
