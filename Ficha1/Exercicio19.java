import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double salary;
		
		while(true) {
			System.out.print("Digite o valor do salário: R$ ");
			try {
				salary = sc.nextDouble();
				break;
			} catch (InputMismatchException e) {
				sc.next();
				System.err.println("Digite apenas valores númericos!");
			}
		}
		
		if(salary > 500) {
			salary = (salary * 0.10) + salary;
		} else if (salary > 300 && salary < 500) {
			salary = (salary * 0.07) + salary;
		} else {
			salary = (salary * 0.05) + salary;
		}
		
		System.out.println("Salário após aumento: R$ " + salary);
		
		sc.close();
	}
}
