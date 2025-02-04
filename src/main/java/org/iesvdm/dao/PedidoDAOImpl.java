package org.iesvdm.dao;

import org.iesvdm.modelo.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PedidoDAOImpl implements PedidoDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Pedido> findByComercialID(int id) {
        return jdbcTemplate.query(
                "SELECT * FROM pedido WHERE id_comercial = ?",
                (rs, rowNum) -> new Pedido(rs.getInt("id"),
                        rs.getDouble("total"),
                        rs.getDate("fecha"),
                        rs.getInt("id_comercial"),
                        rs.getInt("id_cliente")), id
        );
    }

}
