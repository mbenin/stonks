package dev.mrbenin.stonks.enums;

public enum EntradaSaidaEnum {
    CREDITO("Credito"),
    DEBITO("Debito");


    private EntradaSaidaEnum(String field) {
        this.field = field;
    }

    private String field;

    public String getField() {
        return this.field;
    }

    public static EntradaSaidaEnum valueByField(String field){
        for(EntradaSaidaEnum entradaSaidaEnum : EntradaSaidaEnum.values()){
            if(entradaSaidaEnum.getField().equals(field)){
                return entradaSaidaEnum;
            }
        }
        return null;
    }

}
