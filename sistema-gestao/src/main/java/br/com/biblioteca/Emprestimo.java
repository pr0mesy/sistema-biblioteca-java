package br.com.biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate data;

    public Emprestimo(Livro registrarLivro, Usuario registrarUsuario) {
        this.livro = registrarLivro;
        this.usuario = registrarUsuario;
        this.data = LocalDate.now();
    }

    //getters
    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getData() {
        return data;
    }

    //setters
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //toString
    @Override
    public String toString() {
        return "Empréstimo - Livro: " + livro.getTituloLivro() + " | Cliente: " + usuario.getIdUsuario() + " | Data: " + data;
    }
}
