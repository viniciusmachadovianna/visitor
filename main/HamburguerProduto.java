package com.hamburgueria.visitor;

public class HamburguerProduto implements ItemElemento {
    private final String nome;
    private final double preco;
    private final int caloriasBase;

    public HamburguerProduto(String nome, double preco, int caloriasBase) {
        this.nome = nome;
        this.preco = preco;
        this.caloriasBase = caloriasBase;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getCaloriasBase() { return caloriasBase; }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitarHamburguer(this);
    }
}