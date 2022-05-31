package dev.mrbenin.enums;

public enum MovimentacaoEnum {
    COMPRA("Compra"),
    VENDA("Venda"),
    DIVIDENDO("Dividendo"),
    RENDIMENTO("Rendimento"),
    LIQUIDACAO("Transferência - Liquidação"),
    JCP("Juros Sobre Capital Próprio");

    private String descricao;

    MovimentacaoEnum(String tipo) {
        this.descricao = tipo;
    }
}
