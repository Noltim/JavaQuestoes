
public class Exercicio29 {
	public static void main(String[] args) {
		
		int i = 1,j = 7, cont = 1;
		
		System.out.println("i: " + i + " j: " + j);
		
		while(true) {
			
			if(j == 5 && i == 9) {
				break;
			}
			
			cont++;
			
			j--;

			if(j == 4) {
				j = 7;
			}
			
			if(cont == 4) {
				i = 3;
			}
			
			if (cont == 7) {
				i = 9;
			}
			
			
			System.out.println("i: " + i + " j: " + j);
	
		}
		
		System.out.println("-------------------------------------");
		System.out.println("   \\/        Metodo Fácil        \\/");
		System.out.println("-------------------------------------");
		
		
		System.out.println("i: 1 j: 7\r\n"
		+ "i: 1 j: 6\r\n"
		+ "i: 1 j: 5\r\n"
		+ "i: 3 j: 7\r\n"
		+ "i: 3 j: 6\r\n"
		+ "i: 3 j: 5\r\n"
		+ "i: 9 j: 7\r\n"
		+ "i: 9 j: 6\r\n"
		+ "i: 9 j: 5");
	}
}
