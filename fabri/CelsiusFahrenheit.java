package fabri;

import java.util.Scanner;

public class CelsiusFahrenheit{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Olá Usuario!!!");
        // Solicita a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Converte Celsius para Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Apresenta o resultado formatado
        System.out.printf("%.2f ° Celsius equivalem a %.2f ° Fahrenheit.%n", celsius, fahrenheit);

        scanner.close();
    }
}
