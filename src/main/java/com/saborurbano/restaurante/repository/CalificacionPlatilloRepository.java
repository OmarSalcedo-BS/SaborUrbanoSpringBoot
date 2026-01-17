package com.saborurbano.restaurante.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saborurbano.restaurante.model.CalificacionPlatillo;

@Repository
public interface CalificacionPlatilloRepository extends JpaRepository<CalificacionPlatillo, Integer> {
    boolean existsByUsuarioIdAndPlatilloIdPlatillo(Integer idUsuario, Long idPlatillo);
    List<CalificacionPlatillo> findByUsuarioId(Integer idUsuario);
}
