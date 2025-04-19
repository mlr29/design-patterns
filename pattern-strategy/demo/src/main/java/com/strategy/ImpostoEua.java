package com.strategy;

public class ImpostoEua implements ImpostoStrategy {
    
    @Override
    public double calcularImposto(double valor){
        System.out.println("\nEfetuando cálculo do imposto estadunidense... ");
        return valor * 0.2;
    }
}
