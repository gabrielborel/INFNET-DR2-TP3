package org.INFNET.TP3;

public class User {
    private final String nome;
    private String email;
    private String cargo;

    public User(String nome, String email, String cargo) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public void definirCargo(String novoCargo) {
        this.cargo = novoCargo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCargo() {
        return cargo;
    }
}
