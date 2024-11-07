package com.designpatterns.strategy;

public class DescontoVIP implements DescontoStrategy {

    @Override
    public double aplicarDesconto(double valor){
        return valor*0.8;
    }
}
