import java.util.Scanner;

public class imparOuPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        int num2;
        do {
            System.out.println("Digite o segundo número maior que o primeiro: ");
            num2 = scanner.nextInt();

            if (num2 <= num1) {
                System.out.println("Número inválido! O segundo número deve ser maior que " + num1 + ". Tente novamente.");
            }
        } while (num2 <= num1);

        System.out.println("Digite 1 para Par ou 2 para Ímpar: ");
        int opcao = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {

            if (opcao == 1 && i % 2 == 0) {
                System.out.println(i);
            }
            else if (opcao == 2 && i % 2 != 0) {
                System.out.println(i);
            }

        }

        scanner.close();
    }
}
