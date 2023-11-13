package org.example;

public class User {
    private String nome;
    private Integer cpf;
    private String cargo;

    public User(String nome, Integer cpf, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getCargo() {
        return cargp;
    }
}
