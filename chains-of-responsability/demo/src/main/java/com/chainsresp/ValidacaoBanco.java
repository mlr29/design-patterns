package com.chainsresp;

public class ValidacaoBanco extends Validacoes{
    @Override
    public void handler(String pedido){
        System.out.println("Validando banco...");

        super.handler(pedido);
    }

    @Override
    public Validacoes proximaValidacao(Validacoes v){
        
        return super.proximaValidacao(v);
    }
}
