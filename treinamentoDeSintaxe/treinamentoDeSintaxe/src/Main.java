import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = scanner.next();

        System.out.println("seja bem vindo " + nome);

        System.out.println("agora me diga sua idade");
        int idade = scanner.nextInt();

        System.out.println(nome + " voce tem " + idade + " anos " + " parabens");
        int sexo = 0;
        while (sexo != 1 && sexo != 2) {
            System.out.println("digite seu sexo 1 para masculino ou 2 para feminino");
            sexo = scanner.nextInt();
        }
        switch (sexo) {
            case 1:
                System.out.println("sexo masculino");
                break;
            case 2:
                System.out.println("sexo feminino");
                break;
            default:
                System.out.println("digite apenas 1 ou 2");


        }
    }

}
