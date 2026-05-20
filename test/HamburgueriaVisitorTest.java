package com.hamburgueria.visitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburgueriaVisitorTest {

    private HamburguerProduto burguer;
    private BatataProduto batata;

    @BeforeEach
    void setUp() {
        burguer = new HamburguerProduto("Preon Burger", 30.00, 600);
        batata = new BatataProduto(10.00, 100);
    }

    @Test
    void deveCalcularImpostosCorretamente() {
        CalculadoraImposto calculadora = new CalculadoraImposto();

        burguer.aceitar(calculadora);
        assertEquals(3.00, calculadora.getImpostoTotal(), 0.001, 
            "O imposto do hambúrguer deveria ser 10% do valor (R$ 3.00)");

        batata.aceitar(calculadora);
        assertEquals(3.50, calculadora.getImpostoTotal(), 0.001, 
            "O imposto acumulado total deveria ser R$ 3.50");
    }

    @Test
    void deveContarCaloriasCorretamente() {
        ContadorCalorias contador = new ContadorCalorias();

        burguer.aceitar(contador);
        batata.aceitar(contador);
        assertEquals(900, contador.getCaloriasTotais(), 
            "O total de calorias do combo deveria ser 900 kcal");
    }

    @Test
    void deveIniciarVisitantesComValoresZerados() {
        CalculadoraImposto calc = new CalculadoraImposto();
        ContadorCalorias cont = new ContadorCalorias();

        assertEquals(0.0, calc.getImpostoTotal());
        assertEquals(0, cont.getCaloriasTotais());
    }
}