package com.example.milani.cadastro;

import java.io.Serializable;

/**
 * Created by milani on 30/09/15.
 */
public class Usuario implements Serializable {
    protected String login;
    protected String senha;
    protected String tipo;

    public Usuario(){

    }

    public Usuario(String login, String senha, String tipo) {
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
