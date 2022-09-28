

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
//		Gilberto é um famoso vendedor de esfirras na região. 
//		Porém, apesar de todos
//		gostarem de suas esfihas, ele só sabe dar o troco com duas notas, 
//		ou seja, nem
//		sempre é possível receber o troco certo. Para facilitar a vida 
//		de Gil, escreva um
//		programa para ele que determine se é possível ou não devolver 
//		o troco exato
//		utilizando duas notas.
//		As notas disponíveis são: 2, 5, 10, 20, 50 e 100.

		Scanner sc = new Scanner(System.in);
	
		double notas[] = {2,5,10,20,50,100};
		System.out.println("Digite o preço: ");
		double N =sc.nextInt();
		System.out.println("Digite o valor pago: ");
		double M =sc.nextInt();
		double result = M-N;			
		boolean possivel = false;
		
		for (int i = 0; i < 6; i++) {				
			for (int j = 0; j < 6; j++) {
				if (result - notas[j] == notas[i]) 
					possivel = true;
			}
		}
    		
		if (possivel)
			System.out.println("Possível");
		else 
			System.out.println("Impossível");


	}

}
