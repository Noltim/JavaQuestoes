import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0;
		
		for (int j = 0; j < 2; j++) {
			while(true) {
				if(j == 0) {
				System.out.print("Digite o primeiro número: ");
				} else {
					System.out.print("Digite o segundo número: ");
				}
				try {
					if(j == 0) {
						x = sc.nextInt();
						break;
					} else {
						y = sc.nextInt();
						break;
					}						
				} catch (InputMismatchException e) {
					sc.next();
					System.err.println("Digite apenas valores númericos!");
				}
			}
		}
		
		
		checarResultados(x,y);
		
		
		sc.close();
	}
	
	private static void checarResultados(int x, int y) {
		if (x > y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x == y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x < y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x != y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x >= y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (x <= y) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
