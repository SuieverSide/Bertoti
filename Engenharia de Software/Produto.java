public class Produto {
    private String nome;
    private Integer quantidade;
    private Double preco;

    public Medico(String nome, Integer quantidade, Double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getPreco() {
        return Preco;
    }
}