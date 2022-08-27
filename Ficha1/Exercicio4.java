import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[3];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o "+(i+1)+"º número: ");
           num[i] = sc.nextInt();
        }
      
        int maior=num[0];
        int menor=num[0];
        for (int i = 0; i < 3; i++) {
            if(maior < num[i]){
                maior = num[i];
            }
            if(menor > num[i]){
                menor = num[i];
            }
            
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        sc.close();

    }
}
