package Modulo1_4;

public class MovimentacaoDeContaCorrente {
    private String nome = "Jacqueline Oliveira";
    private String tipoConta = "Corrente";
    private double saldo = 2500.00;

    public double getSaldo() {
        return saldo;
    }

    public String getNome(){
        return nome;
    }

    public String getTipoConta(){
        return tipoConta;
    }

    public void setSaldo(double valor) {
        if (valor>0) {
            saldo = saldo + valor;
        }
    }

    public String TransferirValor(double valor) {
        if (valor<1) {
            return "Valor para transferencia menor ou igual a zero " + valor + ", imposivel fazer a transferência";
        } else if (saldo < valor && valor>0) {
                return "Saldo insuficiente para transferencia.";
            }
            else
            {
                saldo -= valor;
                return "Transferencia feita com sucesso, o saldo da conta é: " + saldo;
            }
    }
}
