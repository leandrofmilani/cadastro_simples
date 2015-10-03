package com.example.milani.cadastro;

/**
 * Created by milani on 30/09/15.
 */
public class Gosto {
    protected int codigo;
    protected String descricao;

    public Gosto(){

    }

    public Gosto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
