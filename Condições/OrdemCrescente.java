package Condições;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	
		
		double num1, num2, num3;
		
		System.out.println("Digite o Primeiro número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o Segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.println("Digite o Terceiro número: ");
		num3 = sc.nextDouble();
		
		if( num1 > num2 && num2 > num3) {
			System.out.println("Números na ordem crescente!!!" );
			System.out.println("Numero 1: " + num1);
			System.out.println("Numero 2: " + num2);
			System.out.println("Numero 3: " + num3);
		}else  if(num1 > num3 && num3 > num2){
			System.out.println("Números na ordem crescente!!!" );
			System.out.println("Numero 1: " + num1);
			System.out.println("Numero 2: " + num3);
			System.out.println("Numero 3: " + num2);
		} else  if(num2 > num3 && num3 > num1){
			System.out.println("Números na ordem crescente!!!" );
			System.out.println("Numero 1: " + num2);
			System.out.println("Numero 2: " + num3);
			System.out.println("Numero 3: " + num1);
		}else if (num2 > num1 && num1 > num3){
			System.out.println("Números na ordem crescente!!!" );
			System.out.println("Numero 1: " + num2);
			System.out.println("Numero 2: " + num1);
			System.out.println("Numero 3: " + num3);
		} else  if(num3 > num2 && num2 > num1){
			System.out.println("Números na ordem crescente!!!" );
			System.out.println("Numero 1: " + num3);
			System.out.println("Numero 2: " + num2);
			System.out.println("Numero 3: " + num1);
		}else  if(num3 > num1 && num1 > num2){
			System.out.println("Números na ordem crescente!!!" );
			System.out.println("Numero 1: " + num3);
			System.out.println("Numero 2: " + num1);
			System.out.println("Numero 3: " + num2);
			
			
			
			sc.close();
		}

	}
}