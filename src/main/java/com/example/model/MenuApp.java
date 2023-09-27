package com.example;

import com.example.dao.MenuItemDAO;
import com.example.model.MenuItem;

import java.util.List;

public class MenuApp {
    public static void main(String[] args) {
        // Criando instância do MenuItemDAO
        MenuItemDAO menuItemDAO = new MenuItemDAO();

        // Criando alguns itens de menu fictícios
        MenuItem item1 = new MenuItem("Hambúrguer", 10.99);
        MenuItem item2 = new MenuItem("Pizza Margherita", 8.99);
        MenuItem item3 = new MenuItem("Salada Caesar", 5.99);

        // Incluindo os itens de menu
        menuItemDAO.incluir(item1);
        menuItemDAO.incluir(item2);
        menuItemDAO.incluir(item3);

        // Listando todos os itens do menu
        List<MenuItem> menuItens = menuItemDAO.listarTodos();
        System.out.println("Itens do Menu:");
        for (MenuItem item : menuItens) {
            System.out.println(item);
        }

        // Pesquisando por ID e alterando um item
        MenuItem itemAlterado = new MenuItem(2L, "Pizza Quatro Queijos", 9.99);
        menuItemDAO.alterar(itemAlterado);

        // Exibindo o item alterado
        System.out.println("\nItem Alterado:");
        System.out.println(menuItemDAO.pesquisarPorId(2L));

        // Pesquisando por string
        System.out.println("\nPesquisa por string 'Hambúrguer':");
        List<MenuItem> resultadosPesquisa = menuItemDAO.pesquisarPorString("Hambúrguer");
        for (MenuItem item : resultadosPesquisa) {
            System.out.println(item);
        }

        // Excluindo um item do menu
        menuItemDAO.excluir(1L);

        // Listando os itens do menu após a exclusão
        System.out.println("\nItens do Menu após Exclusão:");
        menuItens = menuItemDAO.listarTodos();
        for (MenuItem item : menuItens) {
            System.out.println(item);
        }
    }
}
