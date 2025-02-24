package Condições;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		
		double num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o Segundo número: ");
		num2 = sc.nextDouble();
		
		if(num1 > num2) {
			System.out.println("O número 1 é maior que o número 2!");
			System.out.println("O maior numero:"+ num1);
		} else if (num2 > num1){
			System.out.println("O número 2 é maior que o número 1!");
			System.out.println("O maior numero:"+ num2);
		
		} else  if(num1 == num2){
			System.out.println("O número 1 é igual o número 2!");
		}
			sc.close();
	}
}