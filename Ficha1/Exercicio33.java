

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		33. Escreva um programa que leia um valor inteiro N. 
//		Este N � a quantidade de
//		linhas de sa�da que ser�o apresentadas na execu��o do programa.
//		Entrada
//		O arquivo de entrada cont�m um n�mero inteiro positivo N.
//		Sa�da
//		Imprima a sa�da conforme o exemplo fornecido abaixo.

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n+1; i++) {
			if(i % 4 == 0)
				System.out.println("PUM");
			else
				System.out.print(i+" ");
		}
		
	}

}
