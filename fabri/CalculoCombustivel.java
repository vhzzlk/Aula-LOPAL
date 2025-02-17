package fabri;

import java.util.Scanner;

public class CalculoCombustivel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Olá Usuario!!!");
        // Solicita o tempo gasto na viagem
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        // Solicita a velocidade média durante a viagem
        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        double velocidade = scanner.nextDouble();

        // Calcula a distância percorrida
        double distancia = tempo * velocidade;

        // Calcula a quantidade de litros de combustível utilizada
        double litrosUsados = distancia / 12;

        // Apresenta os resultados formatados
        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Tempo gasto na viagem: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.printf("Quantidade de litros utilizada: %.2f litros%n", litrosUsados);

        scanner.close();
    }
}
