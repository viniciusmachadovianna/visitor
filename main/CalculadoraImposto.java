package com.hamburgueria.visitor;

public class CalculadoraImposto implements Visitor {
    private double impostoTotal = 0;

    @Override
    public void visitarHamburguer(HamburguerProduto hamburguer) {
        double imposto = hamburguer.getPreco() * 0.10;
        impostoTotal += imposto;
        System.out.println("Imposto " + hamburguer.getNome() + ": R$ " + String.format("%.2add", imposto));
    }

    @Override
    public void visitarBatata(BatataProduto batata) {
        double imposto = batata.getPreco() * 0.05;
        impostoTotal += imposto;
        System.out.println("Imposto Batata (" + batata.getGramas() + "g): R$ " + String.format("%.2f", imposto));
    }

    public double getImpostoTotal() {
        return impostoTotal;
    }
}