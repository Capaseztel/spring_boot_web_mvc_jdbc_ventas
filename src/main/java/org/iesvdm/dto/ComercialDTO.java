package org.iesvdm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesvdm.modelo.Cliente;
import org.iesvdm.modelo.Pedido;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComercialDTO {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private float comision;

    private List<Pedido> pedidos;
    private List<Cliente> clientes;
    private float total;
    private float media;
    private float lowest;
    private float highest;
}
