package com.example.milani.cadastro;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by milani on 30/09/15.
 */
public class Pessoa implements Serializable{
    protected String nome;
    protected String sobrenome;
    protected String sexo;
    protected int idade;

    //Contrutor vazio
    public Pessoa (){
    }

    //Contrutor setando
    public Pessoa(String nome, String sobrenome, String sexo, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
    }

    //Compondo usuario e gosto na classe usuario
    Usuario usuario;
    //array de gostos
    //depois gostos.add(obj tipo gosto)
    ArrayList<Gosto> gostos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
