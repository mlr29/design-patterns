package com.strategy;

public class ImpostoBrasil implements ImpostoStrategy {
    
    @Override
    public double calcularImposto(double valor){
        System.out.println("\nEfetuando cálculo do imposto brasileiro... ");
        return valor * 0.5;
    }
}
