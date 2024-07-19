/*
* Classe Conta, futuramente pretendo implementar conta corrente e poupança e ela
* se tornará uma classe abstrata.
*/

package br.github.gabrielcalasans.bankofcalasans.modelo;

public class Conta {

    private Cliente titular;
    private int agencia;
    private int numeroConta = 1000;
    private double saldo = 0;
    private static int totalContas = 0;

    public Conta(Cliente titular) {
        this.setTitular(titular);
        totalContas += 1;
        this.setNumeroConta(numeroConta + totalContas);
        this.setAgencia(101);

        System.out.printf("\nConta de número: %d criada com sucesso!", getNumeroConta());
    }

    public Cliente getTitular() {
        return titular;
    }

    private void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    private void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    private void setNumeroConta(int numero) {
        this.numeroConta = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public void info() {
        System.out.printf("""

                \n- Dados da Conta:
                    Agência: %d
                    Conta: %d
                """, getAgencia(), getNumeroConta());
    }

    // Implementa metodo deposita
    public void deposita(double valor) {
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.printf("""
                    Valor depositado com sucesso na conta %d
                    Novo saldo: %.2f
                        """, this.getNumeroConta(), this.getSaldo());
        } else {
            System.out.println("Valor inválido");
        }
    }

    // Implementa saque
    public void saca(double valor) {
        if (valor <= 0 || valor > this.getSaldo()) {
            System.out.println("\nValor inválido!");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.printf("""
                    \nSaque realizado com sucesso na conta %d
                    Novo saldo: %.2f
                        """, this.getNumeroConta(), this.getSaldo());
        }
    }
}
