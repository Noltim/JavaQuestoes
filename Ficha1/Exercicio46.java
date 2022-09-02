import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio46 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N, M, soma;
		
		while(true) {
			System.out.print("Digite o primeiro valor: ");
			try {
				M = sc.nextInt();
				if(M >= 0 & M <= 20) {
					break;
				} else {
					System.err.println("Utilize valores maiores que 0 e menores que 20 apenas!");
				}
				
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!");
			}
		}
		
		while(true) {
			System.out.print("Digite o primeiro valor: ");
			try {
				N = sc.nextInt();
				if(N >= 0 & N <= 20) {
					break;
				} else {
					System.err.println("Utilize valores maiores que 0 e menores que 20 apenas!");
				}
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!");
			}
		}
		
		soma = fatorial(M) + fatorial(N);
		
		
		System.out.println("A soma é: " + soma);
		
		sc.close();
		
		
	}
	
	public static int fatorial(int numero){		  
		  int fatorial = 1;
		  for (int i = 1; i <= numero; i++) {
		    fatorial = fatorial * i;
		  }
		  return fatorial;
		}
}
