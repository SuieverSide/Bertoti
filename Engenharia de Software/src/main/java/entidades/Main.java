package entidades;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Produto p0 = new Produto("Laptop", 2, 15.9);
        Produto p1 = new Produto("Monitor",70, 999.9);


        List<Produto> listaProduto = new LinkedList<Produto>();

        listaProduto.add(p1);
        listaProduto.add(p1);
        listaProduto.add(p0);
        listaProduto.add(p0);
        listaProduto.add(p0);
        listaProduto.add(p0);

        User fuc1 = new User("Marcelo",90990990909.0,"Vendedor");
        User fuc2 = new User("Carlos",13245678900.0,"CFO");
        List<User> listaUser = new LinkedList<User>();

        listaUser.add(fuc1);
        listaUser.add(fuc2);

        Sistema lib = new Sistema("Estoque",listaProduto,listaUser);

        System.out.println(lib.searchProduto("Laptop"));


    }

}