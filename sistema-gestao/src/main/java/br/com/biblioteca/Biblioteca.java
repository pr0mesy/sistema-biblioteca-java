package br.com.biblioteca;

import java.util.ArrayList;
import java.util.List;

// classe que vai gerenciar as classes Livro, Usuario e Emprestimo.
public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro " + livro.getTituloLivro() + " cadastrado com sucesso!");
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário " + usuario.getNomeUsuario() + " cadastrado com sucesso!");
    }

    public void listarLivros() {
        if (this.livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado no momento. ");
            return;
        }

        System.out.println("--- Lista de livros ---");
        for (Livro livro : this.livros) {
            System.out.println(livro);
        }
        System.out.println("---------------------------------------");

    }

    public void listarUsuarios() {
        if (this.usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado no momento. ");
            return;
        }

        System.out.println("--- Lista de usuários ---");
        for (Usuario usuario : this.usuarios) {
            System.out.println(usuario);
        }
        System.out.println("---------------------------------------");

    }

    public Livro buscarLivroPorTitulo(String tituloBuscado) {
        if (this.livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado no momento. ");
            return null;
        }

        for (Livro livro : this.livros) {
            if (livro.getTituloLivro().equalsIgnoreCase(tituloBuscado)) {
                return livro;
            }
        }
        return null;
    }

    public Usuario buscarUsuarioPorId(String idBuscado) {
        if (this.usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado no momento. ");
            return null;
        }

        for (Usuario usuario : this.usuarios) {
            if (usuario.getIdUsuario().equalsIgnoreCase(idBuscado)) {
                return usuario;
            }
        }
        return null;
    }

    public void emprestarLivro(String tituloDoLivro, String idUsuario) {
        Livro livro = buscarLivroPorTitulo(tituloDoLivro);
        Usuario usuario = buscarUsuarioPorId(idUsuario);

        if (usuario == null) {
            System.out.println("ERRO: usuário de ID " + idUsuario + "nao encontrado! ");
            return;
        }

        if (livro == null) {
            System.out.println("ERRO: livro de título " + tituloDoLivro + " nao encontrado!");
            return;
        }

        if (livro.isDisponivel()) {
            livro.emprestar();

            Emprestimo novoEmprestimo = new Emprestimo(livro, usuario);
            this.emprestimos.add(novoEmprestimo);

             System.out.println("Sucesso: Empréstimo registrado. " + novoEmprestimo);

        } else {
            System.out.println("ERRO: nao há exemplares disponíveis do livro " + livro.getTituloLivro() + " no momento.");
        }
    }

    public void devolverLivro(String tituloDoLivro, String idUsuario) {
        Emprestimo emprestimoParaRemover = null;

        for (Emprestimo emprestimo : this.emprestimos) {
            boolean mesmoLivro = emprestimo.getLivro().getTituloLivro().equalsIgnoreCase(tituloDoLivro);
            boolean mesmoUsuario = emprestimo.getUsuario().getIdUsuario().equalsIgnoreCase(idUsuario);

            if (mesmoLivro && mesmoUsuario) {
                emprestimoParaRemover = emprestimo;
                break;
            }
        }

        if (emprestimoParaRemover != null) {
            emprestimoParaRemover.getLivro().devolver();
            this.emprestimos.remove(emprestimoParaRemover);

            System.out.println("SUCESSO: Devolução do livro " + tituloDoLivro + " registrada. ");
        } else {
            System.out.println("ERRO: Não foi encontrado um empréstimo ativo para esse livro e usuário. ");
        }
    }

    public void exibirEmprestimos() {
        if (this.emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo ativo no momento. ");
            return;
        }

        System.out.println("--- Relatório de Empréstimos Ativos ---");
        for (Emprestimo emprestimo : this.emprestimos) {
            System.out.println(emprestimo);
        }
        System.out.println("---------------------------------------");
    }
}
