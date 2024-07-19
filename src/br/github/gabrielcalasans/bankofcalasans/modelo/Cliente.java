package br.github.gabrielcalasans.bankofcalasans.modelo;
/**
 * 
 * A Classe {@code Cliente} implementa as informações para criação de um novo usuário 
 * 
 * @author Anderson Gabriel Calasans
 * @version 0.1
 */
public class Cliente {

    private String titular;
    private String cpf;
    private String telefone;
    private static int totalClientes = 0;

    public static int getTotalClientes() {
        return totalClientes;
    }

    /**
     *
     * @param nome
     * @param cpf
     * @param telefone
     */
    public Cliente(String nome, String cpf, String telefone) {
        this.setTitular(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        
        System.out.println("\nCliente associado com sucesso!");
        totalClientes++;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void info() {
        System.out.printf("""
                
                - Dados do Cliente:
                    Nome: %s
                    CPF: %s
                    Telefone: %s

                """,getTitular(),getCpf(),getTelefone() );
    }

}
