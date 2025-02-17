package Quadro;

import java.util.Scanner;

public class Quadro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		double largura, altura, area, perimetro, diagonal;
		
		System.out.print("Digite o valor da largura do quadro: ");
		largura = sc.nextDouble();
		System.out.print("Digite o valor da altura do quadro: ");
		altura = sc.nextDouble();
		area = largura * altura;
		System.out.println("Area: " + area);
		perimetro = 2 * largura + 2 * altura;
		System.out.println("Perimetro: " + perimetro);
		diagonal = Math.sqrt(altura * altura + largura * largura);
		System.out.printf("Diagonal : %.4f", diagonal);
		
		sc.close();
	}

}
