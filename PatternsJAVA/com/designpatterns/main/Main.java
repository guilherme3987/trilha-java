package com.designpatterns.main;

import com.designpatterns.observer.Pedido;
import com.designpatterns.observer.PedidoObserver;

public class Main {

    public static void main(String[] args) {

        // Criação do pedido
        Pedido pedido = new Pedido("123");

        // Criação do observador
        PedidoObserver observer = new PedidoObserver();

        // Registro do observador no pedido
        pedido.addPropertyChangeListener(observer);

        // Concluir o pedido e notificar os observadores
        pedido.concluirPedido();
    }
}
