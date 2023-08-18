package modulo1_3;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhaNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroRandom = new Random().nextInt(100);

        System.out.println("Jogo de adivinhação de números, você tem 5 tentativas.");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número entre 0 até 100");
            int numero = leitura.nextInt();
            if (numero> numeroRandom) {
                System.out.println("Número digitado é maior que número sorteado, você ainda tem" + (4-i) + " Tentativas");
            } else if (numero==numeroRandom) {
                System.out.println("Parabés você acertou o número sorteado");
                i=5;
            } else {
                System.out.println("Número digitado é menor que número sorteado, você ainda tem " + (4-i) + " Tentativas");
            }
        }
    }
}
