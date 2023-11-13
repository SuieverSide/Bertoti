package entidades;

public class User {
    private String nome;
    private Double cpf;
    private String cargo;

    public User(String nome, Double cpf, String cargo) {
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

    public void setCpf(Double cpf) {
        this.cpf = cpf;
    }

    public Double getCpf() {
        return cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
