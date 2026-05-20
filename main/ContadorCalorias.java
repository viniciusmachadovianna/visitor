package com.hamburgueria.visitor;

public class ContadorCalorias implements Visitor {
    private int caloriasTotais = 0;

    @Override
    public void visitarHamburguer(HamburguerProduto hamburguer) {
        caloriasTotais += hamburguer.getCaloriasBase();
    }

    @Override
    public void visitarBatata(BatataProduto batata) {
        caloriasTotais += batata.getGramas() * 3;
    }

    public int getCaloriasTotais() {
        return caloriasTotais;
    }
}