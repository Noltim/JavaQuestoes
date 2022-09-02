import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 ArrayList<Integer> pares = new ArrayList<Integer>();
		 ArrayList<Integer> impares = new ArrayList<Integer>();
		 ArrayList<Integer> todos = new ArrayList<Integer>();
		 
		 
		 int numero, mediaImpar, soma = 0, diferenca;
		 
		 for (int i = 0; i < 5; i++) {
			 while(true) {
					System.out.print("Digite o : " + (i+1) + "ª número: ");
					try {
						numero = sc.nextInt();
						if(numero % 2 == 0) {
							todos.add(numero);
							pares.add(numero);
						} else {
							todos.add(numero);
							impares.add(numero);
						}
						break;
					} catch (InputMismatchException e) {
						sc.next();
						System.err.println("Digite apenas valores númericos!");
					}
				}
		}
		
		for (int i = 0; i < impares.size(); i++) {
			soma += impares.get(i);
		}
		
		mediaImpar = soma / impares.size();
		todos.sort(null);
		diferenca = todos.get(todos.size()-1) - todos.get(0);
		pares.sort(null);
		
		
		
		
		System.out.println("Média dos Impares: " + mediaImpar);
		System.out.println("Maior número PAR: " + pares.get(pares.size()-1));
		System.out.println("Diferença: " + diferenca);
		
		sc.close();
	}
}
