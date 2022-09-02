import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio42 {
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("##,##00.00");
		
		Scanner sc = new Scanner(System.in);
		
		Double laggedPrice, actualPrice, priceOscilation, percentage;
		
		
		while(true) {
			System.out.print("Digite o preço antigo: ");
			try {
				laggedPrice = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite o preço atual: ");
			try {
				actualPrice = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!");
			}
		}
		
		
		
		
		priceOscilation = actualPrice - laggedPrice;
		
		percentage = (priceOscilation / laggedPrice) * 100;

		System.out.println(decimalFormat.format(percentage) + "%");
		
		
		sc.close();
		
		
		
		
	}
}
