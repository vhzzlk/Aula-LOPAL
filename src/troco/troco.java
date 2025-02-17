package troco;

import java.util.Scanner;

public class troco {

	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);

	int Quantidade1;
	Double preco1, valor1, troco;
	
	System.out.println("Preço unitário do produto: ");
	preco1 = sc.nextDouble();
	System.out.println("Quantidade comprada: ");
	Quantidade1 = sc.nextInt();
	System.out.println("Dinheiro recebido: ");
	valor1 = sc.nextDouble();
	troco = ( preco1 * Quantidade1 ) - valor1 ;
		System.out.println("troco: "+ troco);
	
	
	sc.close();
	
			
	
	} 
}
