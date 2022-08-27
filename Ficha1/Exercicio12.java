import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        int escolha=0;
        do{
        System.out.println("Digite a opção escolhida: ");
        System.out.println("1- Vertebrado");
        System.out.println("2- Invertebrado");
        System.out.println("3- Sair");
        escolha = leia.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a opção escolhida: ");
            System.out.println("1- ave");
            System.out.println("2- mamifero");
            escolha = leia.nextInt();
            if (escolha == 1) {
                System.out.println("Digite a opção escolhida: ");
                System.out.println("1- carnívoro");
                System.out.println("2- onívoro");
                escolha = leia.nextInt();
                if (escolha == 1) {
                    System.out.println("águia");
                } else if(escolha==2)
                    System.out.println("pomba");
            } else if(escolha==2) {
                System.out.println("Digite a opção escolhida: ");
                System.out.println("1- onívoro");
                System.out.println("2- herbívoro");
                escolha = leia.nextInt();
                if (escolha == 1) {
                    System.out.println("Homem");
                } else if(escolha==2)
                    System.out.println("Vaca");
            }
        } else if(escolha==2) {
            System.out.println("Digite a opção escolhida: ");
            System.out.println("1- inseto");
            System.out.println("2- anelídeo");
            escolha = leia.nextInt();
            if (escolha == 1) {
                System.out.println("Digite a opção escolhida: ");
                System.out.println("1- hermatofago");
                System.out.println("2- herbívoro");
                escolha = leia.nextInt();
                if (escolha == 1) {
                    System.out.println("Pulga");
                } else if(escolha==2)
                    System.out.println("Lagarta");
            } else if(escolha==2){
                System.out.println("Digite a opção escolhida: ");
                System.out.println("1- hermatofago");
                System.out.println("2- onívoro");
                escolha = leia.nextInt();
                if (escolha == 1) {
                    System.out.println("Sanguessuga");
                } else if(escolha==2)
                    System.out.println("minhoca");
            }
        }
    }while(escolha!=3);
    System.out.println("Saindo...");

        leia.close();
    }
}
