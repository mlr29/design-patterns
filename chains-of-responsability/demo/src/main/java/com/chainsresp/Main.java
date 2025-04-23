package com.chainsresp;

public class Main {
    public static void main(String[] args) {
        ValidacaoIp l = new ValidacaoIp();

        l.proximaValidacao(new ValidacaoLogin()).proximaValidacao(new ValidacaoBanco());

        l.handler("teste");
    }
}