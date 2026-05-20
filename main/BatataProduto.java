package com.hamburgueria.visitor;

public class BatataProduto implements ItemElemento {
    private final double preco;
    private final int gramas;

    public BatataProduto(double preco, int gramas) {
        this.preco = preco;
        this.gramas = gramas;
    }

    public double getPreco() { return preco; }
    public int getGramas() { return gramas; }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarBatata(this);
    }
}