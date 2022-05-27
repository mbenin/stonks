package dev.mrbenin.entity;

import java.io.Serializable;
import java.util.Date;

public class Cotacao implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private Long valor;
    private Date data;

    public Long getValor() {
        return this.valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date dataEhora) {
        this.data = dataEhora;
    }
}
