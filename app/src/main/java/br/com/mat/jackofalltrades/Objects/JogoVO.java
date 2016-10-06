package br.com.mat.jackofalltrades.Objects;

import java.io.Serializable;

/**
 * Created by matheus on 25/09/2016.
 */

public class JogoVO  {

    private String nome;
    private String genero;

    public JogoVO() {
    }

    public JogoVO(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
