package org.iesvdm.service;

import org.iesvdm.dao.PedidoDAO;
import org.iesvdm.modelo.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoDAO pedidoDAO;

    public List<Pedido> findByComercialID(int id) {
        return pedidoDAO.findByComercialID(id);
    }
}
