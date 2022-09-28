package questao35;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		
//		35. Escreva um programa para calcular e escrever o valor de S, 
//		sendo S dado pela
//		fórmula: S = 1 + 3/2 + 5/4 + 7/8 +... + 39/?
//		Entrada
//		Não há nenhuma entrada neste problema.

		double formula=0;		
		double dobro = 1;
		
		for (int i = 1; i <= 39; i+=2) {			
			formula +=i/dobro;			
			dobro *= 2;
		}
			
		System.out.println(formula);
	}

}
