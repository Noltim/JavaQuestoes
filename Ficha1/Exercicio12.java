import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        String escolha;
        do{
        System.out.println("Digite a opção escolhida: ");
        System.out.println("1- Vertebrado");
        System.out.println("2- Invertebrado");
        System.out.println("3- Sair");
        escolha = leia.nextLine();

        if (escolha.equalsIgnoreCase("vertebrado")) {
            System.out.println("Digite a opção escolhida: ");
            System.out.println("1- ave");
            System.out.println("2- mamifero");
            escolha = leia.nextLine();
            if (escolha.equalsIgnoreCase("ave")) {
                System.out.println("Digite a opção escolhida: ");
                System.out.println("1- carnívoro");
                System.out.println("2- onívoro");
                escolha = leia.nextLine();
                if (escolha.equalsIgnoreCase("carnivoro")) {
                    System.out.println("águia");
                } else if(escolha.equalsIgnoreCase("onivoro"))
                    System.out.println("pomba");
            } else if(escolha.equalsIgnoreCase("mamifero")) {
                System.out.println("Digite a opção escolhida: ");
                System.out.println("1- onívoro");
                System.out.println("2- herbívoro");
                escolha = leia.nextLine();
                if (escolha.equalsIgnoreCase("onivoro")) {
                    System.out.println("Homem");
                } else if(escolha.equalsIgnoreCase("herbivoro"))
                    System.out.println("Vaca");
            }
        } else if(escolha.equalsIgnoreCase("invertebrado")) {
            System.out.println("Digite a opção escolhida: ");
            System.out.println("1- inseto");
            System.out.println("2- anelídeo");
            escolha = leia.nextLine();;
            if (escolha.equalsIgnoreCase("inseto")) {
                System.out.println("Digite a opção escolhida: ");
                System.out.println("1- hermatofago");
                System.out.println("2- herbívoro");
                escolha = leia.nextLine();;
                if (escolha.equalsIgnoreCase("hermatofago")) {
                    System.out.println("Pulga");
                } else if(escolha.equalsIgnoreCase("herbivoro"))
                    System.out.println("Lagarta");
            } else if(escolha.equalsIgnoreCase("anelideo")){
                System.out.println("Digite a opção escolhida: ");
                System.out.println("1- hermatofago");
                System.out.println("2- onívoro");
                escolha = leia.nextLine();
                if (escolha.equalsIgnoreCase("hermatofago")) {
                    System.out.println("Sanguessuga");
                } else if(escolha.equalsIgnoreCase("onivoro"))
                    System.out.println("minhoca");
            }
        }
    }while(!escolha.equals("sair"));
    System.out.println("Saindo...");

        leia.close();
    }
}
