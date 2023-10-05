package com.manoelcampos.exportador;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe abstrata que fornece uma implementação base para as subclasses
 * que definem formatos específicos de exportação de dados.
 *
 * @author Manoel Campos da Silva Filho
 */
public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto {

    /**
     * Colunas a serem exibidas na tabela gerada no processo de exportação.
     */
    protected static final List<String> TITULOS_COLUNAS = List.of("ID", "Descrição", "Marca", "Modelo", "Estoque");

    @Override
    public final String exportar(List<Produto> listaProdutos) {

        var sb = new StringBuilder()
                        .append(abrirTabela())
                        .append(abrirLinhaTitulos())
                        .append(gerarColunas())
                        .append(fecharLinhaTitulos())
                        .append(gerarLinhasDados(listaProdutos))
                        .append(fecharTabela());

        return sb.toString();
    }

    private String gerarLinhasDados(List<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            
        }
        return null;
    }

    private String gerarColunas() {
        return TITULOS_COLUNAS.stream()
                              .map(col -> "<th>%s</th>".formatted(col))
                              .collect(Collectors.joining());
    }
}
