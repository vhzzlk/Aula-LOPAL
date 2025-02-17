		package fabri;
		
		import java.util.Scanner;
		
		public class VolumeLataOleo {
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println(" Olá Usuario!!!");
		        // Solicita o raio da lata
		System.out.print("Digite o raio da lata de óleo: ");
		double raio = scanner.nextDouble();
		
		// Solicita a altura da lata
		System.out.print("Digite a altura da lata de óleo: ");
		double altura = scanner.nextDouble();
		
		// Calcula o volume da lata
		double volume = 3.14159 * Math.pow(raio, 2) * altura;
		
		// Apresenta o resultado formatado
		System.out.printf("O volume da lata de óleo é: %.2f%n", volume);
		
		        scanner.close();
		    }
		}
