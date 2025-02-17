package Piso;

import java.util.Scanner;


public class Piso {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	double largura, comprimento, valor, area, custo;
	
		System.out.println ("Digite o valor da largura do cômodo: ");
		largura = sc.nextDouble();
		System.out.println("Digite o valor do comprimento do cômodo: ");
		comprimento = sc.nextDouble();
		area = largura * comprimento;
		System.out.println("Área do comodo: "+ area);
		area = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		valor = sc.nextDouble();
		custo = (valor*area);
		System.out.println("Custo total: "+ custo);		
		
		sc.close();
		
	

	}

}
