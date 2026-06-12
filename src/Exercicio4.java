import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número inicial: ");
        int num1 = scanner.nextInt();

        int num2;
        do {
            System.out.println("Digite um número: ");
            num2 = scanner.nextInt();

            if (num2 < num1) {
                System.out.println("Número ignorado! Digite um número maior ou igual a " + num1);
            }

        } while (num2 % num1 == 0 || num2 < num1);

        System.out.println("Programa encerrado!");
        scanner.close();
    }
}