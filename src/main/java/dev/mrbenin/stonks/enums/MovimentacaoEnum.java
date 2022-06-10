package dev.mrbenin.stonks.enums;

public enum MovimentacaoEnum {
    COMPRA("Compra"),
    VENDA("Venda"),
    DIVIDENDO("Dividendo"),
    RENDIMENTO("Rendimento"),
    LIQUIDACAO("Transferência - Liquidação"),
    JCP("Juros Sobre Capital Próprio");

    private String field;

    MovimentacaoEnum(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public static MovimentacaoEnum valueByField(String field) {
        for (MovimentacaoEnum movimentacaoEnum : MovimentacaoEnum.values()) {
            if (movimentacaoEnum.getField().equals(field)) {
                return movimentacaoEnum;
            }
        }
        return null;
    }
}
