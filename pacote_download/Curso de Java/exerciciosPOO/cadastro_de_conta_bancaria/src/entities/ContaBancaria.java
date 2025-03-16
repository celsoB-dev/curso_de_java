package entities;

public class ContaBancaria {

    private final int numeroDaConta;
    private double saldo;
    public String titular;

    public ContaBancaria(int numeroDaConta, double depositoInicial, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        deposito(depositoInicial);
    }

    public ContaBancaria(int numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor + 5.00;
    }

    public String toString() {
        return "Conta " + numeroDaConta + ", Titular: " + titular + ", Saldo: R$ " + String.format("%.2f", saldo);
    }

}
