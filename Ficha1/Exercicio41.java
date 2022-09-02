import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio41 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Double weight, height, helper, idealWeight;
		
		
		while(true) {
			System.out.print("Digite sua altura: ");
			try {
				height = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite seu peso atual: ");
			try {
				weight = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!");
			}
		}

		if(height <= 1.50) {

			if(weight == 50) {
				System.out.println("Parabéns você está no peso Ideal!");
			} else if (weight > 50) {
				helper = weight - 50;
				System.out.println("Emagraça: " + helper + "Kg(s)");
			} else if (weight < 50) {
				helper = 50 - weight;
				System.out.println("Engorde: " + helper + "Kg(s)");
			}
			
		}
		
		if(height >= 1.50 && height <= 1.90) {

			if(weight == 70) {
				System.out.println("Parabéns você está no peso Ideal!");
			} else if (weight > 70) {
				helper = weight - 70;
				System.out.println("Emagraça: " + helper + "Kg(s)");
			} else if (weight < 70) {
				helper = 70 - weight;
				System.out.println("Engorde: " + helper + "Kg(s)");
			}
			
		}
		
		if(height >= 1.91) {

			if(weight == 100) {
				System.out.println("Parabéns você está no peso Ideal!");
			} else if (weight > 100) {
				helper = weight - 100;
				System.out.println("Emagraça: " + helper + "Kg(s)");
			} else if (weight < 100) {
				helper = 100 - weight;
				System.out.println("Engorde: " + helper + "Kg(s)");
			}
			
		}
		
		
		
		sc.close();
	}
}
