package Desafios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá Usuario!!!");
        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        // Formata o IMC com uma casa decimal
        DecimalFormat df = new DecimalFormat("#0.0");
        String imcFormatado = df.format(imc);

        System.out.println("Seu IMC é: " + imcFormatado);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        scanner.close();
    }
}
