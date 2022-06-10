package dev.mrbenin.stonks.services;

import java.util.List;
import java.util.Map;

import dev.mrbenin.stonks.dto.MovimentacaoB3DTO;
import dev.mrbenin.stonks.enums.EntradaSaidaEnum;
import dev.mrbenin.stonks.enums.MovimentacaoEnum;

public class B3Service extends ExcelService {

    public MovimentacaoB3DTO obterOperacoesFii(String filePath) {

        MovimentacaoB3DTO movimentacaoB3DTO = new MovimentacaoB3DTO();
        Map<Integer,List<String>> listaMovimentacoes = readExcel(filePath);
        listaMovimentacoes.remove(index -> index == 0);


        listaMovimentacoes.forEach((numeroLinha, listaDados) ->{
            if(numeroLinha > 0){
                movimentacaoB3DTO.setEntradaSaida(EntradaSaidaEnum.valueByField(listaDados.get(0)));
                movimentacaoB3DTO.setDataOperacao(new Date());
                movimentacaoB3DTO.setMovimentacao(MovimentacaoEnum.valueByField(listaDados.get(1)));
                movimentacaoB3DTO.setTipoProduto(listaDados.get(2));
                movimentacaoB3DTO.setInstituicaoFinanceira(listaDados.get(3));
                movimentacaoB3DTO.setQuantidade(Integer.valueOf(listaDados.get(4)));
                movimentacaoB3DTO.setPrecoUnitario(Double.valueOf(listaDados.get(5)));
                movimentacaoB3DTO.setValorOperacao(Double.valueOf(listaDados.get(6)));
            }
        });    
        
        return null;
    }
}
