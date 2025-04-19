package com.strategy;

public class PedidoVenda implements ImpostoStrategy{
    ImpostoStrategy s;

    public PedidoVenda(ImpostoStrategy s){
        if(this.s == null){
            this.s = s;
        }
    }

    @Override
    public double calcularImposto(double valor){
        return s.calcularImposto(valor);
    }
}
