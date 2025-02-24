package Desafios;

import java.util.Random;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // Gera um número aleatório entre 1 e 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        
        // Inicializa o número de tentativas
        int tentativas = 0;
        
        // Cria um Scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu estou pensando em um número entre 1 e 100.");
        
        while (true) {
            System.out.print("Tente adivinhar o número: ");
            int palpite = scanner.nextInt();
            
            tentativas++;
            
            if (palpite < numeroAleatorio) {
                System.out.println("Seu palpite é muito baixo. Tente novamente!");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Seu palpite é muito alto. Tente novamente!");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            }
        }
        
        scanner.close();
    }
}
