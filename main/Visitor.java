package com.hamburgueria.visitor;

public interface Visitor {
    void visitarHamburguer(HamburguerProduto hamburguer);
    void visitarBatata(BatataProduto batata);
}