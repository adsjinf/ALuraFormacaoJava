package Modulo1_4;

import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {
        int operacao = 0;
        double valor = 0.0;
        String msg ="";
        Scanner leitura = new Scanner(System.in);
        MovimentacaoDeContaCorrente contaCorrente = new MovimentacaoDeContaCorrente();
        System.out.println("******************************************************************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome:          " + contaCorrente.getNome());
        System.out.println("Tipo conta:    " + contaCorrente.getTipoConta());
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());
        System.out.println("\n******************************************************************");
        while (operacao!=4){
            System.out.println("\nOperações");
            System.out.println("\n1 - Consulta saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("\nDigite a opção desejada:");
            operacao = leitura.nextInt();
            if (operacao == 1){
                System.out.println("O saldo da conta é: " + contaCorrente.getSaldo());
            } else if (operacao == 2) {
                System.out.println("Informe valor a ser depositado");
                valor = leitura.nextDouble();
                contaCorrente.setSaldo(valor);
                System.out.println("O saldo da conta é " + contaCorrente.getSaldo());
            } else if (operacao == 3) {
                System.out.println("Informe valor para ser transferido");
                valor = leitura.nextDouble();
                msg = contaCorrente.TransferirValor(valor);
                System.out.println(msg);
            }
        }
    }
}
