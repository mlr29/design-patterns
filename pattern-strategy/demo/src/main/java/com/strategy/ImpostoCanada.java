package com.strategy;

public class ImpostoCanada implements ImpostoStrategy {
    
    @Override
    public double calcularImposto(double valor){
        System.out.println("\nEfetuando cálculo do imposto canadense... ");
        return valor * 0.8;
    }
}
