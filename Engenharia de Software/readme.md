## Comentários do livro Software Engineering at Google

1. We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

//A engenharia de software trabalha em uma escala maior que o dezenvolvimento de aplicações, o engenheiro esta preocupado com eficiência da implementação, a escala, e o tempo, tendo em mente o que e onde será implementado. O engenheiro de software deve fazer decisões complexas baseadas com estimativas imprecisas.//

2. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

//Engenharia de software é a programação aplicada em um tempo e um ambiente, a engenhaeria de software aborda todos os aspectos da implementação e manutenção de um projeto//

## Três exemplos de trade-offs

1. Implementação de um linguagem de programação de alto nível onde se perde performance em troco de tempo e conforto.
2. Utlização de raid 0 onde se ganha performance em perda da segurança de dados.
3. Utilização NoSQL em vez de banco de dados relacionais onde se ganha performance na task mas perde em flexibilidade.

## 10 Usability Heuristics for User Interface Design

### Visibility of system status.
Erro: Sistema de carregamento de páginas do teams que não demonstra o progresso.
Acerto: Progresso de download de arquivo no windows

### Match between system and the real world.
Erro: Exibição de códigos erros referenciando portas de rede.
Acerto: Utilizar sistema de arquivos imitando um arquivo físico no windows

### User control and freedom.
Erro: Páginas web de cadastros que ao realizar um erro ao retornar a página anterior o progresso é perdido.
Acerto: Atalhos para retornar a um estado anterior do arquivo no word.

### Consistency and standards.
Erro: Utilização de caminhos confusos para alterações de configurações em aplicativos da meta.
Acerto: Utilização de cores para online, ocupado e ausente no discord.

### Error prevention.
Erro: Inversão de cores no siga.
Acerto: Confirmação que vai sobreescrever um arquivo no windowns.

### Recognition rather than recall.
Erro: Uma tela de confirmação que não mostra qual opção selecionou.
Acerto: Usar um calendário para selecionar um dia.

### Flexibility and efficiency of use.
Erro: Office 365 onde foi retirado diversas funcionalidades e atalhos.
Acerto: Intellij com diversos atalhos para maxizar eficiência.

### Aesthetic and minimalist design.
Erro: Telegram com design com muitas opções de uma vez só.
Acerto: Whatsapp com icones simples e legíveis.

### Help users recognize, diagnose, and recover from errors.
Erro: Erros de compilar Java, erros 
Acerto: Login que apresenta se o erro foi no nome do usúario ou na senha.

### Help and documentation.
Erro: Documentação do Geoserver.
Acerto: Documentação do Java.

________________________________________________________________________________________________________________________________________

## Diagramas


Diagrama de caso de uso:

![DiagramaUso2](https://github.com/SuieverSide/bertoti/assets/31674205/dd92b5de-266a-4b70-aa0e-e2bbd6ec0c78)




Diagrama de classe:

## Códigos Java

<summary>Classe Produto</summary>

<details>
    
```
package org.example;

public class Produto {
    private String nome;
    private Integer quantidade;
    private Double preco;

    public Produto(String nome, Integer quantidade, Double preco) {
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }    
}



```
     
</details>

<summary>Classe Sistema</summary>

<details>

```
package org.example;

public class User {
    private String nome;
    private Integer cpf;
    private Double cargo;

    public User(String nome, Integer cpf, Double cargo) {
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

    public Integer getCpf() {
        return cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}

```
    
</details>

<summary>Classe Sistema</summary>

<details>

```

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

```
    
</details>

<summary>Teste Junit</summary>

<details>

```

package entidades;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class Teste {

    @Test
    void testSearch() {
        List<Produto> listaProduto = new LinkedList<Produto>();

        listaProduto.add(new Produto("Maçarico", 10, 50.0));
        listaProduto.add(new Produto("Computador", 7, 90.0));
        listaProduto.add(new Produto("Caneta", 3, 70.0));
        listaProduto.add(new Produto("Celular", 9, 60.0));

        List<User> listaUser = new LinkedList<User>();

        listaUser.add(new User("Mateus", 34534534545.00, "Atendente"));
        listaUser.add(new User("Lucas", 98898898898.00, "CEO"));
        listaUser.add(new User("Lucas", 98898898898.00, "CEO"));

        Sistema aux = new Sistema("Estoque",listaProduto,listaUser);

        assertEquals(aux.searchProduto("Maçarico").size(),1 );
    }
    @Test
    void testCpf(){
        List<Produto> listaProduto = new LinkedList<Produto>();

        listaProduto.add(new Produto("Maçarico", 10, 50.0));
        listaProduto.add(new Produto("Computador", 7, 90.0));
        listaProduto.add(new Produto("Caneta", 3, 70.0));
        listaProduto.add(new Produto("Celular", 9, 60.0));

        List<User> listaUser = new LinkedList<User>();

        listaUser.add(new User("Mateus", 34534534545.00, "Atendente"));
        listaUser.add(new User("Lucas", 98898898898.00, "CEO"));
        listaUser.add(new User("Lucas", 98898898898.00, "CEO"));

        Sistema aux = new Sistema("Estoque",listaProduto,listaUser);

        assertEquals(aux.getUsers(), "Estoque" );
    }

}

```
    
</details>


