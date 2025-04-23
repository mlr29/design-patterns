package com.chainsresp;

public abstract class Validacoes implements ValidacoesI{
    Validacoes v;

    @Override
    public Validacoes proximaValidacao(Validacoes v){
        if(this.v == null){
            this.v = v;
        }

        return this.v;
    };

    @Override
    public void handler(String pedido){
        
        if(v != null){
            v.handler(pedido);
        }
    }

}
