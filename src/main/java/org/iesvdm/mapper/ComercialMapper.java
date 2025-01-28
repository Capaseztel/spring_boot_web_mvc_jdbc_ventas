package org.iesvdm.mapper;

import org.iesvdm.dto.ComercialDTO;
import org.iesvdm.modelo.Cliente;
import org.iesvdm.modelo.Comercial;
import org.iesvdm.modelo.Pedido;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComercialMapper {
    ComercialDTO toDTO(Comercial comercial, List<Pedido> pedidos, List<Cliente> clientes, double total, double media, double lowest, double highest);
    Comercial toEntity(ComercialDTO comercialDTO);
}
