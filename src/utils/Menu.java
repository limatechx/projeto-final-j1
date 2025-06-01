package utils;

import servico.Servico;

import java.util.Scanner;

public class Menu {
    private static Scanner scan = new Scanner(System.in);

    private static final String MENU_PRINCIPAL = """
                Bem-vindo(a) a sua biblioteca pessoal!😆
                O que deseja fazer?
                1 - ➕ Adicionar Itens
                2 - 📃 Listar Itens
                3 - 🔎 Localizar Itens
                4 - 🪄 Listar Itens por Categoria
                5 - ✏️ Atualizar Itens
                6 - 🗑️ Remover Itens
                7 - Sair...‍🏃🏻‍♂️‍➡️🏃🏻‍♂️‍➡️🏃🏻‍♂️‍➡️
            """;

    public static void exibirMenu() {
        System.out.println(MENU_PRINCIPAL);
    }

    public static void iniciarPrograma() {
        while (true) {
            exibirMenu();
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1 -> Servico.AdicionarItem();
                case 2 -> Servico.listarItems();
                case 3 -> Servico.localizarItems();
                case 4 -> Servico.listarPorCategoria();
                case 5 -> Servico.atualizarItem();
                case 6 -> Servico.removerItem();
                case 7 -> {
                    System.out.println("Biblioteca pessoal encerrada!");
                    System.out.println("Até a próxima!🙋🏻‍♂️");
                    return;
                }
            }
        }

    }
}
