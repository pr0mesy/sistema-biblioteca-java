package br.com.biblioteca;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("\n--- MENU DA BIBLIOTECA ---");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Usuário");
            System.out.println("3. Listar Livros");
            System.out.println("4. Listar Usuários");
            System.out.println("5. Emprestar Livro");
            System.out.println("6. Devolver Livro");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int ano = Integer.parseInt(scanner.nextLine());
                    System.out.print("Digite a quantidade de exemplares: ");
                    int qtd = Integer.parseInt(scanner.nextLine());

                    Livro novoLivro = new Livro(titulo, autor, ano, qtd);
                    biblioteca.adicionarLivro(novoLivro);
                    break;

                case 2:
                    System.out.print("Digite o nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();
                    System.out.print("Digite o ID do usuário: ");
                    String idUsuario = scanner.nextLine();

                    Usuario novoUsuario = new Usuario(nomeUsuario, idUsuario);
                    biblioteca.adicionarUsuario(novoUsuario);
                    break;

                case 3:
                    biblioteca.listarLivros();
                    break;

                case 4:
                    biblioteca.listarUsuarios();
                    break;

                case 5:
                    System.out.print("Digite o título do livro a emprestar: ");
                    String tituloEmprestar = scanner.nextLine();
                    System.out.print("Digite o ID do usuário: ");
                    String idEmprestar = scanner.nextLine();
                    biblioteca.emprestarLivro(tituloEmprestar, idEmprestar);
                    break;

                case 6:
                    System.out.print("Digite o título do livro a devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    System.out.print("Digite o ID do usuário: ");
                    String idDevolver = scanner.nextLine();
                    biblioteca.devolverLivro(tituloDevolver, idDevolver);
                    break;

                case 7:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}