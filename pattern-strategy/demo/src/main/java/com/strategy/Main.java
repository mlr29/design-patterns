package com.strategy;

import java.util.Scanner;

//=========================================================
//Atividade realizada na disciplina Padrões de projeto para 
//demonstração do padrão Strategy
//=========================================================

public class Main {
    public static void main(String[] args) {
        PedidoVenda c;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\n\nCálculo de Imposto\n1-Brasil\n2-Canadá\n3-EUA\n\n");
            System.out.print("Selecione o país: ");
            int op = scanner.nextInt();        
            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();

            c = switch (op) {
                case 1 -> new PedidoVenda(new ImpostoBrasil());
                case 2 -> new PedidoVenda(new ImpostoCanada());
                case 3 -> new PedidoVenda(new ImpostoEua());
                default -> throw new AssertionError();
            };

            double valorImposto = c.calcularImposto(valor);
            System.out.println("Imposto calculado: " + valorImposto);
        }

    }
}