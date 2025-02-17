package fabri;

import java.util.Scanner;

public class CombinacoesAdicaoMultiplicacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Olá Usuario!!!");
        // Ler quatro valores inteiros
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        int d = scanner.nextInt();

        // Realizar as adições e apresentar os resultados
        System.out.println("Adição de A + B: " + (a + b));
        System.out.println("Adição de A + C: " + (a + c));
        System.out.println("Adição de A + D: " + (a + d));
        System.out.println("Adição de B + C: " + (b + c));
        System.out.println("Adição de B + D: " + (b + d));
        System.out.println("Adição de C + D: " + (c + d));

        // Realizar as multiplicações e apresentar os resultados
        System.out.println("Multiplicação de A * B: " + (a * b));
        System.out.println("Multiplicação de A * C: " + (a * c));
        System.out.println("Multiplicação de A * D: " + (a * d));
        System.out.println("Multiplicação de B * C: " + (b * c));
        System.out.println("Multiplicação de B * D: " + (b * d));
        System.out.println("Multiplicação de C * D: " + (c * d));

        scanner.close();
    }
}
