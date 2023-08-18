package modulo1_3;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o Filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

        }
        System.out.println("-----------------");
        System.out.println("Media de avaliação " + mediaAvaliacao / 3);
        leitura.close();
    }
}
