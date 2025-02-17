package fabri;

import java.util.Scanner;

public class CalculoPrestacaoAtraso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Olá Usuario!!!");
        // Solicita o valor do bem
        System.out.print("Digite o valor do bem: ");
        double valor = scanner.nextDouble();

        // Solicita a taxa de juros
        System.out.print("Digite a taxa de juros (em %): ");
        double taxa = scanner.nextDouble();

        // Solicita o tempo em atraso
        System.out.print("Digite o tempo em atraso (em meses): ");
        double tempo = scanner.nextDouble();

        // Calcula a prestação em atraso
        double prestacao = valor + (valor * (taxa / 100) * tempo);

        // Apresenta o resultado formatado
        System.out.printf("O valor da prestação em atraso é: %.2f%n", prestacao);

        scanner.close();
    }
}
