

import java.util.Scanner;

public class Exercicio50 {

	public static void main(String[] args) {
		
//		50. A China está construindo um elevador espacial, que permitirá o lançamento de
//		sondas e satélites a um custo muito mais baixo, viabilizando não só projetos de
//		pesquisa científica como o turismo espacial. No entanto, os chineses são muito
//		supersticiosos, e por isso têm um cuidado muito especial com a numeração dos
//		andares do elevador: eles não usam nenhum número que contenha o dígito “4” ou a
//		sequência de dígitos "13". Assim, eles não usam o andar 4, nem o andar 13, nem o
//		andar 134, nem o andar 113, mas usam o andar 103. Assim, os primeiros andares
//		são numerados 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, ... Como o elevador espacial
//		tem muitos andares, e eles precisam enumerar todos os andares do elevador, os
//		chineses pediram que você escrevesse um programa que, dado o andar, indica o
//		número que deve ser atribuído a ele.
//		Entrada
//		Cada caso de teste consiste de uma única linha, contendo um inteiro N (1 <= N <=
//		1018) que indica o andar cujo número deve ser determinado.
//		Saída
//		Para cada caso de teste, imprima uma linha contendo um único número inteiro
//		indicando o número atribuído ao N-ésimo andar.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de andar: ");
		int qtd = sc.nextInt();
		
		int qtd2 = qtd;
	     
		
		for(int i = 0; i <= qtd; i++) {
			String n = Integer.toString(i);
			if(n.contains("13") || n.contains("4")) {				
					qtd2++;				
			}
//			if(n.contains("4")) {				
//					qtd2++;
//				
//			}
			
			
		System.out.println(qtd2+" - "+i);
		}
		if(Integer.toString(qtd2).contains("13")) {
			qtd2++;
		}
		if(Integer.toString(qtd2).contains("4")) {
			qtd2++;
		}

//        for(int i = 1; i <= qtd; i++) {
//        	aux='0';
//        	String numero = String.valueOf(i);
//        	char[] split = numero.toCharArray();
//        	for (char c : split) {
//        		if(c == '3') {
//        			if(aux == '1') {
//        				qtd2++;
//	    				aux='2';
//	    				break;
//	    			}
//        		}
//        		if(c == '1') {
//    				aux='1';
//    			}	       		
//        		if(c == '4') {
//	    			if(aux!='2') {
//	    				qtd2++;
//	    				break;
//	    			}
//        		}
//        		if(aux == '1') {
//        			if(c == '3') {
//        				qtd2++;
//	    				aux='2';
//	    				break;
//	    			}else {
//	    				aux='0';
//	    			}
//        		}
//        		if(c == '1') {
//    				aux='1';
//    			}	       		
//        		if(c == '4') {
//	    			if(aux!='2') {
//	    				qtd2++;
//	    				break;
//	    			}
//        		}
//        	}
//        	System.out.println(qtd+ " - "+i + " - "+qtd2);
//        }
        System.out.println(qtd2);
//        String numero2 = String.valueOf(qtd);
//    	char[] split2 = numero2.toCharArray();
//    	for (char c : split2) {   	
//			if(c == '1' || aux=='1') {
//				if(aux=='1') {
//	    			if(c == '3') {
//	    				qtd++;
//	    			}else {
//	    				aux='0';
//	    			}
//				}
//				aux='1';
//			}	
//    		if(c == '4') {
//    			qtd++;
//    		}
//    	}
//        System.out.println(qtd);

	}

}
