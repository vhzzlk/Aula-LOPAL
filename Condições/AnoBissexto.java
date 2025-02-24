package Condições;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano;

        System.out.println("Digite um ano:");
        ano = sc.nextInt();

        if (ehBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        sc.close();
    }

    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}

