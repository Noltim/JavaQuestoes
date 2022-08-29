import java.util.Locale;
import java.util.Scanner;

public class Exercicio7{
   public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner leia = new Scanner(System.in);

    System.out.println("Digite o valor: ");
    int valor = leia.nextInt();

    System.out.println(valor);
    int notaDe100= valor/100;
    System.out.println(notaDe100+" nota(s) de R$ 100,00");
    int notaDe50= valor%100/50;
    System.out.println(notaDe50+" nota(s) de R$ 50,00");
    int notaDe20= ((valor%100)%50)/20;
    System.out.println(notaDe20+" nota(s) de R$ 20,00");
    int notaDe10= (((valor%100)%50)%20)/10;
    System.out.println(notaDe10+" nota(s) de R$ 10,00");
    int notaDe5= ((((valor%100)%50)%20)%10)/5;
    System.out.println(notaDe5+" nota(s) de R$ 5,00");
    int notaDe2= (((((valor%100)%50)%20)%10)%5)/2;
    System.out.println(notaDe2+" nota(s) de R$ 2,00");
    int notaDe1= ((((((valor%100)%50)%20)%10)%5)%2)/1;
    System.out.println(notaDe1+" nota(s) de R$ 1,00");
    leia.close();
   }
}
