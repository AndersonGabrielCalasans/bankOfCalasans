/*
 * Classe principal do projeto.
 * Metodos implementados até agora: Saca e deposita.
 * 
 * TODO's:
 * - Criar metodos que implementem a interface
 * - opcao cadastrar cliente
 * - opcao criar nova conta
 * - metodo sacar
 * - metodo depositar
 * - saldo
 * - info do cliente e contas associadas ao cliente (um cliente pode ter mais de uma conta)
 * - transferir entre contas
 */

public class App {
    public static void main(String[] args) throws Exception {

        Cliente gabriel = new Cliente("Gabriel Calasans", "10314248498", "81991428408");
        gabriel.info();
        Conta contaGabriel = new Conta(gabriel);
        contaGabriel.info();

        contaGabriel.deposita(1000);
        contaGabriel.saca(500);
    }
}
