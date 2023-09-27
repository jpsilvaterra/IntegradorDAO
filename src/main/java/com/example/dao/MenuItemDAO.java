package com.example.dao;

import com.example.model.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MenuItemDAO {
    private List<MenuItem> menuItems = new ArrayList<>();
    private long nextId = 1;

    public void incluir(MenuItem menuItem) {
        menuItem.setId(nextId);
        nextId++;
        menuItems.add(menuItem);
    }

    public void excluir(Long id) {
        menuItems.removeIf(item -> item.getId().equals(id));
    }

    public void alterar(MenuItem menuItem) {
        Optional<MenuItem> existingItem = menuItems.stream()
                .filter(item -> item.getId().equals(menuItem.getId()))
                .findFirst();

        existingItem.ifPresent(item -> {
            item.setName(menuItem.getName());
            item.setPrice(menuItem.getPrice());
        });
    }

    public MenuItem pesquisarPorId(Long id) {
        return menuItems.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<MenuItem> pesquisarPorString(String se archString) {
        List<MenuItem> results = new ArrayList<>();

        for (MenuItem menuItem : menuItems) {
            if (menuItem.getName().toLowerCase().contains(searchString.toLowerCase())) {
                results.add(menuItem);
            }
        }

        return results;
    }

    public List<MenuItem> listarTodos() {
        return null;
    }
}
