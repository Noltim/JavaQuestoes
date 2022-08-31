import java.util.Scanner;

public class Exercicio37Ficha {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Digite seu nome, seguida da sua escolha: PAR ou ÍMPAR: ");
        String nome1 = sc.nextLine();
        String escolha1 = sc.nextLine();
        System.out.print("Digite o número desejado: ");
        int numero1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite seu nome, seguida da sua escolha: PAR ou ÍMPAR: ");
        String nome2 = sc.nextLine();
        String escolha2 = sc.nextLine();
        System.out.print("Digite o número desejado: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;

        if (soma%2 == 0 && escolha1.equals("par")) {
            System.out.println(nome1);
        } else if(!(soma%2 == 0) && escolha1.equals("impar")) {
            System.out.println(nome1);
        }else if((soma%2 == 0) && escolha2.equals("par")) {
            System.out.println(nome2);
        }else if(!(soma%2 == 0) && escolha2.equals("impar")) {
            System.out.println(nome2);
        }

        
        sc.close();
    }
}
