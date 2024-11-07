package com.designpatterns.factory;

import com.designpatterns.strategy.DescontoStrategy;
import com.designpatterns.strategy.DescontoComum;
import com.designpatterns.strategy.DescontoVIP;

public class DescontoFactory {

    public static DescontoStrategy obterDesconto(String tipoCliente) {
        if ("VIP".equalsIgnoreCase(tipoCliente)) {
            return new DescontoVIP();
        } else {
            return new DescontoComum();
        }
    }
}
