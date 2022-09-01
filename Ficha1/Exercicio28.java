
public class Exercicio28 {
	public static void main(String[] args) {
		
		
		int j = 60, i = 1;
		
		System.out.println("i: " + i + " j: " + j);
		
		while(true) {
			i += 3;
			j -= 5;
			
			System.out.println("i: " + i + " j: " + j);
			
			if(j == 0) {
				break;
			}
		}
	}
}
