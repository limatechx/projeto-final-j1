package repositorio;

import modelo.Item;

import java.util.*;

public class BancoDeDados {
    private static List<Item> itens = new ArrayList<>();

    public static void adicionarItem(Item item) {
        itens.add(item);
    }

    public static void removerItem(Item item) {
        itens.remove(item);
    }

    public static void atualizarItem(String itemAntigo, Item novoItem) {
        Item item = localizarItem(itemAntigo);
        if (item != null) {
            itens.set(itens.indexOf(item), novoItem);
        }
    }

    public static void listarItens() {
        for (Item item : itens) {
            System.out.println(item);
        }
    }

    public static Item localizarItem(String nome) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                return item;
            }
        }
        return null;
    }
}
