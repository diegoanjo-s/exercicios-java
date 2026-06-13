# Exercício 05 — Scanner, While e Switch Case

## 📋 Descrição

Programa em Java que coleta dados do usuário via terminal usando a classe `Scanner`, valida a entrada com `while` e exibe resultados com `switch case`.

## 🧠 Conceitos praticados

- Importação e uso da classe `Scanner`
- Leitura de `String`, `int` com os métodos `next()`, `nextLine()`, `nextInt()`
- Laço de repetição `while` para validar entrada do usuário
- Estrutura `switch case` com `default`
- Concatenação de Strings no `println`

## 💻 O que o programa faz

1. Pede o nome do usuário
2. Pede a idade
3. Exibe uma mensagem de boas vindas com nome e idade
4. Pede o sexo — **1 para Masculino** ou **2 para Feminino**
5. Se o usuário digitar um valor inválido, fica pedindo até digitar 1 ou 2
6. Exibe o sexo correspondente

## 📄 Código

```java
package revisao.sintaxe;

import java.util.Scanner;

public class revisaoSwitch {
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
```

## 🗓️ Data
Junho 2026

## 👨‍💻 Autor
Diego — Estudante de ADS | Uninove | Bootcamp Santander 2026
