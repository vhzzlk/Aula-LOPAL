package Condições;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        
        do {
        System.out.println("Digite sua Idade :");
        idade = sc.nextInt();

        if (idade < 0) {
            System.out.println("Essa idade não é permitida!Por favor digite novamente .");
        		}
        }  while (idade < 0); 
        
         if (idade < 18) {
            System.out.println("Ele é criança!");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Ele é maior de idade!");
        } else if (idade >= 60) {
            System.out.println("Ele é idoso!");
        }

        sc.close();
    }
}
