package com.chainsresp;

public class ValidacaoLogin extends Validacoes{
    @Override
    public void handler(String pedido){
        System.out.println("Validando login...");

        super.handler(pedido);
    }

    @Override
    public Validacoes proximaValidacao(Validacoes v){
        
        return super.proximaValidacao(v);
    }
}
