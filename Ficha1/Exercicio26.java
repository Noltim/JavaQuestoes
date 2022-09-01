import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int age, cont=0;
		Double height;
		
		
		while(true) {
			System.out.print("Digite a sua Altura: ");
			try {
				height = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!!");
			}
		}
		
		while(true) {
			System.out.print("Digite a sua Idade: ");
			try {
				age = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!!");
			}
		}
		
		if(height >= 1.5 && age >= 12) {
			cont++;
		}
		
		if(height >= 1.4 && age >= 14) {
			cont++;
		}
		
		if(height >= 1.7 | age >= 16) {
			cont++;
		}
		
		System.out.println("Você pode ir em: " +cont+ " brinquedo(s)");
		
		
		sc.close();
	}
}
