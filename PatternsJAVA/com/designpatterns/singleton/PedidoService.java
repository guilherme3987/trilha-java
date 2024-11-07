package com.designpatterns.singleton;

public class PedidoService {
    private static PedidoService instance;

    private PedidoService() {}

    public static PedidoService getInstance(){
        if (instance == null) {
            instance = new PedidoService();
        }
        return instance;
    }
}
