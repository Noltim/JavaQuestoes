import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n1,n2,n3,n4, n;

		
		
		while(true) {
			System.out.print("Digite um número com 4 caracteres: ");
			try {
				n = sc.next();
				if(n.length() < 4 || n.length() > 4) {
					System.err.println("Digite exatamente  4 caracteres!");
					sc.next();
					continue;
				}
				String.valueOf(n);
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valore númericos!");
			}
		}
		
		n1 = n.substring(0,1);
		n2 = n.substring(1,2);
		n3 = n.substring(2,3);
		n4 = n.substring(3);
		
		if(n4 == "0") {
			n4 = "";
		}
		
		
		System.out.println(n4+n3+n2+n1);
		
		
		sc.close();
	}
}
