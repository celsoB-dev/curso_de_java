package entities;

public class ContaBancaria {

    public String titular;
    public int numeroConta;
    public double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public String toString() {
        return "Titular: " + titular + " | Conta: " + numeroConta + " | Saldo: R$" + String.format("%,.2f", saldo);
    }
}
