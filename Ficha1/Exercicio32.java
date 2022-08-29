import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tipoCombustivel = new int[5];
        int qtdAlcool = 0;
        int qtdGasolina = 0;
        int qtdDiesel = 0;
        float qtdLitrosAlcool = 0;
        float qtdLitrosGasolina = 0;
        float qtdLitrosDiesel = 0;
        float somaLitrosGasolina = 0;
        float somaLitrosAlcool = 0;
        float somaLitrosDiesel = 0;

        for (int i = 0; i < tipoCombustivel.length; i++) {
            System.out.println("Digite o tipo de combustível preferido: ");
            System.out.println("1 - Álcool / 2 - Gasolina / 3 - Diesel: ");
            tipoCombustivel[i] = sc.nextInt();

            switch (tipoCombustivel[i]) {
                case 1: {
                    qtdAlcool += 1;
                    System.out.println("Digite a quantidade de litros a ser abastecido: ");
                    qtdLitrosAlcool = sc.nextFloat();                    
                    somaLitrosAlcool += qtdLitrosAlcool;
                }
                    break;
                case 2: {
                    qtdGasolina += 1;
                    System.out.println("Digite a quantidade de litros a ser abastecido: ");                    
                    qtdLitrosGasolina = sc.nextFloat();
                    somaLitrosGasolina += qtdLitrosGasolina;
                }
                    break;
                case 3: {
                    qtdDiesel += 1;
                    System.out.println("Digite a quantidade de litros a ser abastecido: ");                    
                    qtdLitrosDiesel = sc.nextFloat();
                    somaLitrosDiesel += qtdLitrosDiesel;
                    break;
                }
            }
        }
        System.out.println("Álcool: " + qtdAlcool + " - Qtd Litros: " + somaLitrosAlcool);
        System.out.println("Gasolina: " + qtdGasolina + " - Qtd Litros: " + somaLitrosGasolina);
        System.out.println("Diesel: " + qtdDiesel + " - Qtd Litros: " + somaLitrosDiesel);

        sc.close();
    }
}
