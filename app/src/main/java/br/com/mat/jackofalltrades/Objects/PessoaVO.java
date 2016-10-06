package br.com.mat.jackofalltrades.Objects;

import java.io.Serializable;

/**
 * Created by matheus on 25/09/2016.
 */

public class PessoaVO {

    private String nome;
    private String telefone;

    public PessoaVO() {
    }

    public PessoaVO(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
