import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int req1 = 0, req2 = 0, req3 = 0, req4 = 0, req5 = 0;
		
		for (int i = 0; i < 5; i++) {
			while(true) {
				if(i == 0) {
					System.out.print("Possui interface Gráfica?: ");
				} else if(i == 1) {
					System.out.print("Possui Inteligencia Artificial?: ");
				} else if (i == 2) {
					System.out.print("Possui Encapsulamento ?: ");
				} else if(i == 3) {
					System.out.print("Possui Identação?: ");
				} else {
					System.out.print("Possui Structs?: ");
				}

				try {
					if(i == 0) {
						req1 = sc.nextInt();
						
						if(req1 != 0 && req1 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO NÃO ATENDIDO");
							continue;
						}
					} else if(i == 1) {
						req2 = sc.nextInt();
						
						if(req2 != 0 && req2 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO NÃO ATENDIDO");
							continue;
						}
					} else if (i == 2) {
						req3 = sc.nextInt();
						
						if(req3 != 0 && req3 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO NÃO ATENDIDO");
							continue;
						}
					} else if(i == 3) {
						req4 = sc.nextInt();
						
						if(req4 != 0 && req4 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO NÃO ATENDIDO");
							continue;
						}
					} else {
						req5 = sc.nextInt();
						
						if(req5 != 0 && req5 != 1) {
							System.err.println("Digite apenas 0 ou 1, sendo:\n1 para REQUISITO ATENDIDO\n0 para REQUISITO NÃO ATENDIDO");
							continue;
						}
					}
					break;
				} catch (InputMismatchException e) {
					System.err.println("Digite apenas valores númericos!");
					sc.next();
				}
			}
		}
		
		if(req1 == 1 | req2 == 1 && req3 == 1 && req4 == 1 && req5 == 1) {
			System.out.println("AVALIADO");
		} else {
			System.out.println("0 (ZERO)");
		}
		
		
		sc.close();
	}
}
