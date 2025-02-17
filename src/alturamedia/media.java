package alturamedia;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double  altura1, altura2, media;
		
		
		System.out.println("Digite o nome da primeira pessaoa: ");
		String nome1 = sc.nextLine();
		System.out.println("Digite a altura da primeira pessoa: ");
		altura1 = sc.nextDouble();
		System.out.println("Digite o nome da segundo pessaoa: ");
		String c = sc.nextLine();
		String nome2 = sc.nextLine();
		
		System.out.println("Digite a altura da segundo pessoa: ");
		altura2 = sc.nextDouble();
		media = (altura1 + altura2) /2;
		System.out.printf("A altura média de " + nome1 + " e de " + nome2 + "e igual a %.2f" , media );
		
				sc.close();


	}

}
