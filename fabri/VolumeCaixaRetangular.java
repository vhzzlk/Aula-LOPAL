package fabri;

import java.util.Scanner;

public class VolumeCaixaRetangular {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Olá Usuario!!!");

        // Solicita o comprimento da caixa
        System.out.print("Digite o comprimento da caixa retangular: ");
        double comprimento = scanner.nextDouble();

        // Solicita a largura da caixa
        System.out.print("Digite a largura da caixa retangular: ");
        double largura = scanner.nextDouble();

        // Solicita a altura da caixa
        System.out.print("Digite a altura da caixa retangular: ");
        double altura = scanner.nextDouble();

        // Calcula o volume da caixa
        double volume = comprimento * largura * altura;

        // Apresenta o resultado formatado
        System.out.printf("O volume da caixa retangular é: %.2f%n", volume);

        scanner.close();
    }
}
