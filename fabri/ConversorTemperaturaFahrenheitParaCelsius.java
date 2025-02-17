package fabri;

import java.util.Scanner;

public class ConversorTemperaturaFahrenheitParaCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Olá Usuario!!!");
        // Solicita a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Converte Fahrenheit para Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Apresenta o resultado formatado
        System.out.printf("%.2f graus Fahrenheit equivalem a %.2f graus Celsius.%n", fahrenheit, celsius);

        scanner.close();
    }
}
 