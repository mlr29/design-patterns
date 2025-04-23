package com.chainsresp;

public interface  ValidacoesI {
    public abstract ValidacoesI proximaValidacao(Validacoes v);
    public void handler(String pedido);
}
