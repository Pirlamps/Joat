package br.com.mat.jackofalltrades.Objects;

import java.io.Serializable;

import br.com.mat.jackofalltrades.Interfaces.JoatObjectInterface;

/**
 * Created by matheus on 25/09/2016.
 */

public class AnimalVO  {

    private String Tipo;
    private String cor;

    public AnimalVO() {
    }

    public AnimalVO(String tipo, String cor) {
        Tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
