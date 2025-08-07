package br.com.biblioteca;

public class Usuario {
    private String nomeUsuario;
    private String idUsuario;

    public Usuario(String registrarNomeUsuario, String registrarIdUsuario) {
        this.nomeUsuario = registrarNomeUsuario;
        this.idUsuario = registrarIdUsuario;
    }

    //getters
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    //setters
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    //toString
    @Override
    public String toString() {
        return "Usuario: " + nomeUsuario + "| ID: " + idUsuario;
    }

}
