package dev.mrbenin.entity;

import java.io.Serializable;

public class Escriturador implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private Long cnpj;
    private String razaoSocial;

    public Escriturador(Long cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    

    public Long getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
}
