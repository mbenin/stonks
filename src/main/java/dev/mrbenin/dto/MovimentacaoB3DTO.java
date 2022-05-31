package dev.mrbenin.dto;

import dev.mrbenin.enums.EntradaSaidaEnum;
import dev.mrbenin.enums.MovimentacaoEnum;

import java.util.Date;

public class MovimentacaoB3DTO {

    private EntradaSaidaEnum entradaSaida;
    private Date dataOperacao;
    private MovimentacaoEnum movimentacao;
    private String tipoProduto;
    private String instituicaoFinanceira;
    private Integer quantidade;
    private Double precoUnitario;
    private Double valorOperacao;

    public EntradaSaidaEnum getEntradaSaida() {
        return entradaSaida;
    }

    public void setEntradaSaida(EntradaSaidaEnum entradaSaida) {
        this.entradaSaida = entradaSaida;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public MovimentacaoEnum getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(MovimentacaoEnum movimentacao) {
        this.movimentacao = movimentacao;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getInstituicaoFinanceira() {
        return instituicaoFinanceira;
    }

    public void setInstituicaoFinanceira(String instituicaoFinanceira) {
        this.instituicaoFinanceira = instituicaoFinanceira;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Double getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(Double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }
}
