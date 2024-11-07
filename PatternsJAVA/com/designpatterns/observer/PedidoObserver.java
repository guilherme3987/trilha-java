package com.designpatterns.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PedidoObserver implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("pedidoConcluido".equals(evt.getPropertyName())) {
            String pedidoId = (String) evt.getNewValue();
            System.out.println("Pedido " + pedidoId + " foi concluído!");
        }
    }
}
