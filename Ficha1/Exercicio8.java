import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double rh, rm, rc;

        System.out.println("renda do homem: ");
        rh = sc.nextDouble();
        System.out.println("renda da mulher: ");
        rm = sc.nextDouble();

        rc = rh+rm;

        if (rc <= 900.00){
            System.out.printf("RENDA CONJUNTA: R$%.2f%n",rc);
            System.out.println("ALIQUOTA UTILIZADA: Isento");
            System.out.println("IMPOSTO DE RENDA: Isento");
            System.out.printf("RENDA LIQUIDA: R$%.2f%n",rc);

        }else if(rc > 900.00 && rc <= 1500.00){
            
            System.out.printf("RENDA CONJUNTA: R$%.2f%n",rc);
            System.out.println("ALIQUOTA UTILIZADA: 10%");
            System.out.printf("IMPOSTO DE RENDA: R$%.2f%n", (rc*0.10));
            System.out.printf("RENDA LIQUIDA: R$%.2f%n", (rc-(rc*0.10)));
            
        }else if(rc >1500.00 && rc <= 2500.00){
            System.out.printf("RENDA CONJUNTA: R$%.2f%n",rc);
            System.out.println("ALIQUOTA UTILIZADA: 15%");
            System.out.printf("IMPOSTO DE RENDA: R$%.2f%n",(rc*0.15));
            System.out.printf("RENDA LIQUIDA: R$%.2f%n", (rc-(rc*0.15)));
            
        }else{
            System.out.printf("RENDA CONJUNTA: R$%.2f%n",rc);
            System.out.println("ALIQUOTA UTILIZADA: 25%");
            System.out.printf("IMPOSTO DE RENDA: R$%.2f%n",(rc*0.25));
            System.out.printf("RENDA LIQUIDA: R$%.2f%n",(rc-(rc*0.25)));
            
        }

    }
}
