package com.designpatterns.strategy;

public class DescontoComum implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double valor){
        return valor*0.9;
    }
    
}
