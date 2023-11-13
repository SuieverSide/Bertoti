package org.example;

import java.util.LinkedList;
import java.util.List;

public class Sistema {
    private String nome;
    private List<Produto> produtos;
    private List<User> users;

    public Sistema() {
    }

    public Sistema(String nome, List<Produto> produtos, List<User> users) {
        this.nome = nome;
        this.produtos = produtos;
        this.users = users;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Produto> buscarProdutos(String nomeDoProduto) {
        List<Produto> produtosEncontrados = new LinkedList<Produto>();

        for (Produto produto : produtos) {
            if (produto.getNome().startsWith(nomeDoProduto)) {
                produtosEncontrados.add(produto);
            }
        }

        return produtosEncontrados;
    }

    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public String toString() {
        return "nome: "
                + nome
                + "\npossui os produtos: "
                + produtos
                + ",\nos users são: "
                + users;
    }
}


