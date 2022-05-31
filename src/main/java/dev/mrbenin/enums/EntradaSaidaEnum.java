package dev.mrbenin.enums;

public enum EntradaSaidaEnum {

    CREDITO("Credito"),
    DEBITO("Debito");

    private String descricao;

    EntradaSaidaEnum(String tipo) {
        this.descricao = tipo;
    }

    public String getDescricao(){
        return descricao;
    }
}
