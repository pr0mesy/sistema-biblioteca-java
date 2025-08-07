package br.com.biblioteca;

public class Livro {
    private String tituloLivro;
    private String autorLivro;
    private int anoPublicacao;
    private int quantidade;

    public Livro(String registrarTituloLivro, String registrarAutorLivro, int registrarAnoPublicacao, int registrarQuantidade) {
        this.tituloLivro = registrarTituloLivro;
        this.autorLivro = registrarAutorLivro;
        this.anoPublicacao = registrarAnoPublicacao;
        this.quantidade = registrarQuantidade;
    }
    
    public boolean isDisponivel() {
        return quantidade > 0;
    }

    public void emprestar() {
        if (isDisponivel()) {
            this.quantidade--;
        }
    }

    public void devolver() {
        this.quantidade++;
    }

    //getters
    public String getTituloLivro() {
        return tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    //setters
    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //toString
    @Override
    public String toString() {
        return "Nome do Livro: " + tituloLivro + " | Autor: " + autorLivro + " | Ano: " + anoPublicacao + " | Quantidade: " + quantidade;
    }

}
