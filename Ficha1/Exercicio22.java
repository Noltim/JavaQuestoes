import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double valorTotal;
        System.out.println("Digite a quantidade inteira em m³ que sua residência consome: ");
        int metrosCubicos = sc.nextInt();

        if(metrosCubicos <= 10){
            valorTotal = 7;
            System.out.println("R$ " + valorTotal);
        } else if(metrosCubicos <= 30){
            valorTotal = (metrosCubicos - 10 * 1) + 7;
            System.out.println("R$ " + valorTotal);
        }else if(metrosCubicos > 30 && metrosCubicos <= 100){
            valorTotal = 7 + ((30 - 10) * 1) + ((metrosCubicos - 31) * 2);
            System.out.println("R$ " + valorTotal);
        }else if(metrosCubicos > 100){
            valorTotal = 7 + ((30 - 10) * 1) + ((100 - 30) * 2) + ((metrosCubicos - 100) * 5);
            System.out.println("R$ " + valorTotal);
        }

        sc.close();
    }
}
