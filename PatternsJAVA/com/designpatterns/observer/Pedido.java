package com.designpatterns.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Pedido {
    
    private String id;
    private PropertyChangeSupport support;

    public Pedido(String id) {
        this.id = id;
        this.support = new PropertyChangeSupport(this);
    }

    public String getId() {
        return id;
    }

    // Adiciona um listener para ouvir eventos
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    // Remove um listener
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    // Método para simular a conclusão do pedido
    public void concluirPedido() {
        System.out.println("Pedido " + id + " está sendo concluído.");
        // Notifica todos os listeners
        support.firePropertyChange("pedidoConcluido", null, id);
    }
}
