package org.example;

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
