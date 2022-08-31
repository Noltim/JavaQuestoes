import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Double countryA, countryB;
		int yearsToCome = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("Digite a população do Pais A: ");
			try {
				countryA = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valore númericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite a população do Pais B: ");
			try {
				countryB = sc.nextDouble();
				if(!(countryA <= countryB)) {
					System.err.println("A população do pais B deve ser maior ou igual a população do pais A!");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valore númericos!");
			}
		}
		
		while(countryA < countryB) {
			
			countryA = (countryA * 0.03) + countryA;
			countryB = (countryB * 0.015) + countryB;
			
			yearsToCome++;
			
		
		}
		
		System.out.println("A quantidade necessária de anos é: " + yearsToCome + " ano(s)");
		
		sc.close();
		
	}
}
