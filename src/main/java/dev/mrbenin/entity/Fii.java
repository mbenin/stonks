package dev.mrbenin.entity;
import java.io.Serializable;

public class Fii implements Serializable{

    private static final long serialVersionUID = 1L;

    private String  ticker;
    private String  nome;
    private Long    cnpj;
    private Escriturador escriturador;

    public String getTicker() {
        return ticker;
    }
    public Escriturador getEscriturador() {
       return escriturador;
    }
    public void setEscriturador(Escriturador escriturador) {
        this.escriturador = escriturador;
    }
    public Long getCnpj() {
        return cnpj;
    }
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

}
