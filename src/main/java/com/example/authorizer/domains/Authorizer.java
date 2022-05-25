package com.example.authorizer.domains;

import lombok.Data;

@Data
public class Authorizer {
    public Authorizer(String codigo, String codigoEstabelecimento, String descricaoEstabelecimento, String numeroCartao, Double valor) {
        this.codigo = codigo;
        this.codigoEstabelecimento = codigoEstabelecimento;
        this.descricaoEstabelecimento = descricaoEstabelecimento;
        this.numeroCartao = numeroCartao;
        this.valor = valor;
    }

    private String codigo;
    private String codigoEstabelecimento;
    private String descricaoEstabelecimento;
    private String numeroCartao;
    private Double valor;
}
