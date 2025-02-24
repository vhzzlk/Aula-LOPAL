package Condições;

import java.util.Scanner;

public class VerificarNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num;
		
		System.out.println("Digite o número desejado:");
		num = sc.nextDouble();
		
		if (num <0) {
		System.out.println("Este número é negativo!");
		} else if (num == 0) {
			System.out.println("Este número é igual a 0!");
		} else if (num > 0) {
			System.out.println("Este numero é positivo!");
		} 
		
		
		
		
		
		sc.close();
	}

}
