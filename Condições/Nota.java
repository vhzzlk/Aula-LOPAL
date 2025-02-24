package Condições;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double nota; 
		
		do {
		System.out.println("Digite sua nota: ");
		nota = sc.nextDouble();
		
		if( nota < 0){
			System.err.println("Não exite essa nota!Tente novamente ");
			}
		} while (nota <0);
		  if( nota >= 7) {
			System.out.println("Você passou!");
		} else if ( nota <7 )
		System.out.println("Você reprovou!");
		
						
		sc.close();		
	}

}
