package com.denkitronik.clienteservice.repositories;

import com.denkitronik.clienteservice.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.denkitronik.clienteservice.entities.Region;
import java.util.List;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
    @Query("from Region")
    List<Region> findAllRegiones();
}
