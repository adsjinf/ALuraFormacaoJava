package modulo1_3;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;
        while(nota!=-1) {
            System.out.println("Digite sua avaliação para o Filme ou -1 para sair: ");
            nota = leitura.nextDouble();
            if (nota>-1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }
        if (totalDeNotas>0) {
            System.out.println("-----------------");
            System.out.println("Media de avaliação " + mediaAvaliacao / totalDeNotas);
        }
        leitura.close();
    }

}
