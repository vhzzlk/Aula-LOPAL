package fabri;

import java.util.Scanner;

public class TrocaValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Olá Usuario!!!");
        // Solicita o valor de A
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        // Solicita o valor de B
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Efetua a troca dos valores
        int temp = a;
        a = b;
        b = temp;

        // Apresenta os valores após a troca
        System.out.println("Valor de A após a troca: " + a);
        System.out.println("Valor de B após a troca: " + b);

        scanner.close();
    }
}
