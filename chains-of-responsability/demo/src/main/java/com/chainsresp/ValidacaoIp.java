package com.chainsresp;

public class ValidacaoIp extends Validacoes{
    @Override
    public void handler(String pedido){
        System.out.println("Validando ip...");

        super.handler(pedido);
    }

    @Override
    public Validacoes proximaValidacao(Validacoes v){
        
        return super.proximaValidacao(v);
    }
}
