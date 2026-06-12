import java.util.Scanner;

public class calculoDoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em CM, EX: 190cm(1 metro e 90 cm): ");
        int  altura = scanner.nextInt();
        double alturaMetros = altura / 100.0;
        double imc = peso / (alturaMetros * alturaMetros);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if(imc <= 34.9){
            System.out.println("obesidade grau 1");
        }else if(imc <= 39.9){
            System.out.println("obesidade grau 2");
        }else
            System.out.println("obesidade morbida");

    }
}

