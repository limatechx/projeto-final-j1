package servico;

import modelo.*;
import repositorio.BancoDeDados;

import java.util.*;

public class Servico {
    private static final Scanner scan = new Scanner(System.in);

    public static void AdicionarItem() {
        System.out.println("Qual tipo de item deseja adicionar? 🙂");
        System.out.println("1 - Livro 📙");
        System.out.println("2 - Album 💿");
        System.out.println("3 - Revista 📒");
        System.out.println("4 - Receita Culinária 😋");
        int opcao = scan.nextInt();
        scan.nextLine();

        switch (opcao) {
            case 1 -> adicionarLivro();
            case 2 -> adicionarAlbum();
            case 3 -> adicionarRevista();
            case 4 -> adicionarReceita();
            default -> System.out.println("Opção invalida! Tente novamente.🤔");
        }
    }

    public static void listarItems() {
        System.out.println("⭐ I T E N S  D A  B I B L I O T E C A ⭐");
        System.out.println();
        BancoDeDados.listarItens();
        System.out.println("F I M  D A  L I S T A");
    }

    public static void localizarItems() {
        System.out.println("Qual nome do item que deseja localizar?");
        String nome = scan.nextLine();
        Item item = BancoDeDados.localizarItem(nome);
        if (item != null) {
            System.out.println("Item localizado com sucesso!😎");
            System.out.println("Veja abaixo!");
            System.out.println();
            System.out.println(item);
        } else {
            System.out.println("Item não existe! ");
        }
    }

    public static void atualizarItem() {
        System.out.println("Qual nome do item que deseja atualizar?");
        String nome = scan.nextLine();
        Item item = BancoDeDados.localizarItem(nome);

        atualizarLivro(item, nome);
        atualizarRevista(item, nome);
        atualizarAlbum(item, nome);
        atualizarReceita(item, nome);
    }

    private static void atualizarLivro(Item item, String nome) {
        if (item != null) {
            if (item instanceof Livro) {
                System.out.println("Informe o novo título: ");
                String titulo = scan.nextLine();
                titulo = validarTitulo(titulo);
                System.out.println("Informe a nova categoria: ");
                String categoria = scan.nextLine();
                System.out.println("Informe o novo autor: ");
                String autor = scan.nextLine();
                System.out.println("Informe a nova quantidade de páginas: ");
                int qtdDePaginas = scan.nextInt();
                scan.nextLine();

                Livro livro = new Livro(titulo, categoria, autor, qtdDePaginas);
                BancoDeDados.atualizarItem(nome, livro);
                System.out.println("Item atualizado com sucesso!👏🏻");
            }
        } else {
            System.out.println("Item não existe!");
        }
    }

    private static void atualizarRevista(Item item, String nome) {
        if (item != null) {
            if (item instanceof Revista) {
                System.out.println("Informe o novo título: ");
                String titulo = scan.nextLine();
                titulo = validarTitulo(titulo);
                System.out.println("Informe a nova categoria: ");
                String categoria = scan.nextLine();
                System.out.println("Informe a nova editora: ");
                String editora = scan.nextLine();
                System.out.println("Informe a nova edição: ");
                int edicao = scan.nextInt();
                scan.nextLine();

                Revista revista = new Revista(titulo, categoria, editora, edicao);
                BancoDeDados.atualizarItem(nome, revista);
                System.out.println("Item atualizado com sucesso!👏🏻");
            }
        } else {
            System.out.println("Item não existe!");
        }
    }

    private static void atualizarAlbum(Item item, String nome) {
        if (item != null) {
            if (item instanceof Album) {
                System.out.println("Informe o novo título: ");
                String titulo = scan.nextLine();
                titulo = validarTitulo(titulo);
                System.out.println("Informe a nova categoria: ");
                String categoria = scan.nextLine();
                System.out.println("Informe o novo artista: ");
                String artista = scan.nextLine();
                System.out.println("Informe a nova quantidade de faixas: ");
                int qtdDeFaixas = scan.nextInt();
                scan.nextLine();

                Album album = new Album(titulo, categoria, artista, qtdDeFaixas);
                BancoDeDados.atualizarItem(nome, album);
                System.out.println("Item atualizado com sucesso!👏🏻");
            }
        } else {
            System.out.println("Item não existe!");
        }
    }

    private static void atualizarReceita(Item item, String nome) {
        if (item != null) {
            if (item instanceof Receita) {
                System.out.println("Informe o novo título: ");
                String titulo = scan.nextLine();
                titulo = validarTitulo(titulo);
                System.out.println("Informe a nova categoria: ");
                String categoria = scan.nextLine();
                System.out.println("Informe os novos ingredientes: ");
                String ingredientes = scan.nextLine();
                System.out.println("Informe o novo modo de preparo: ");
                String modoDePreparo = scan.nextLine();

                Receita receita = new Receita(titulo, categoria, ingredientes, modoDePreparo);
                BancoDeDados.atualizarItem(nome, receita);
                System.out.println("Item atualizado com sucesso!👏🏻");
            }
        } else {
            System.out.println("Item não existe!");
        }
    }

    public static void removerItem() {
        System.out.println("Informe o nome do item que deseja remover: ");
        String nome = scan.nextLine();
        Item item = BancoDeDados.localizarItem(nome);
        if (item != null) {
            BancoDeDados.removerItem(item);
            System.out.println("Item removido com sucesso! ❌👏🏻");
        } else {
            System.out.println("Item não existe!");
        }
    }

    private static void adicionarRevista() {
        System.out.println("Informe o título da revista: ");
        String titulo = scan.nextLine();
        titulo = validarTitulo(titulo);
        System.out.println("Informe a categoria da revista: ");
        String categoria = scan.nextLine();
        System.out.println("Informe a editora da revista: ");
        String editora = scan.nextLine();
        System.out.println("Informe a edição da revista: ");
        int edicao = scan.nextInt();
        scan.nextLine();

        Revista revista = new Revista(titulo, categoria, editora, edicao);
        BancoDeDados.adicionarItem(revista);
        System.out.println("Revista adicionada com sucesso!📒✅");
        System.out.println();
    }

    private static void adicionarAlbum() {
        System.out.println("Informe o título do album: ");
        String titulo = scan.nextLine();
        titulo = validarTitulo(titulo);
        System.out.println("Informe a categoria do album: ");
        String categoria = scan.nextLine();
        System.out.println("Informe o artista do album: ");
        String artista = scan.nextLine();
        System.out.println("Informe a quantidade de faixas do album: ");
        int qtdDeFaixas = scan.nextInt();
        scan.nextLine();

        Album album = new Album(titulo, categoria, artista, qtdDeFaixas);
        BancoDeDados.adicionarItem(album);
        System.out.println("Album adicionado com sucesso!💿✅");
        System.out.println();
    }

    private static void adicionarLivro() {
        System.out.println("Informe o título do livro: ");
        String titulo = scan.nextLine();
        titulo = validarTitulo(titulo);
        System.out.println("Informe a categoria do livro: ");
        String categoria = scan.nextLine();
        System.out.println("Informe o autor do livro: ");
        String autor = scan.nextLine();
        System.out.println("Informe a quantidade de páginas: ");
        int qtdDePaginas = scan.nextInt();
        scan.nextLine();

        Livro livro = new Livro(titulo, categoria, autor, qtdDePaginas);
        BancoDeDados.adicionarItem(livro);
        System.out.println("Livro adicionado com sucesso!📙✅");
        System.out.println();

    }

    private static void adicionarReceita() {
        System.out.println("Informe o título da receita: ");
        String titulo = scan.nextLine();
        titulo = validarTitulo(titulo);
        System.out.println("Informe a categoria da receita: ");
        String categoria = scan.nextLine();
        System.out.println("Informe os ingredientes: ");
        String ingredientes = scan.nextLine();
        System.out.println("Informe o modo de preparo: ");
        String modoDePreparo = scan.nextLine();


        Receita receita = new Receita(titulo, categoria, ingredientes, modoDePreparo);
        BancoDeDados.adicionarItem(receita);
        System.out.println("Receita adicionada com sucesso!🤩✅");
        System.out.println();

    }

    private static String validarTitulo(String titulo) {
        while (titulo.length() < 4) {
            System.out.println("O título não pode conter menos de 4 caracteres! 😐");
            System.out.println("Tente novamente!");
            titulo = scan.nextLine();
        }
        return titulo;
    }

    public static void listarPorCategoria() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome ou parte da categoria: ");
        String categoria = scan.nextLine();

        List<Item> encontrados = BancoDeDados.listarPorCategoria(categoria);

        if (encontrados.isEmpty()) {
            System.out.println("Nenhum item encontrado para essa categoria.🤨");
            System.out.println("Tente novamente!");
        } else {
            for (Item item : encontrados) {
                System.out.println("⭐ I T E N S  P O R  C A T E G O R I A ⭐");
                System.out.println(item);
                System.out.println("F I M  D A  L I S T A");
            }
        }

    }
}


