package com.saborurbano.restaurante.service.CalificacionPlatillo;

import java.util.List;

import com.saborurbano.restaurante.dtos.CalificacionPlatilloDto;

public interface CalificacionPlatilloServiceInt {

    CalificacionPlatilloDto registrarCalificacion(CalificacionPlatilloDto calificacion, Integer idUsuario,
            Long idPlatillo);

    List<CalificacionPlatilloDto> getAllCalificaciones();

    CalificacionPlatilloDto getCalificacionById(Integer id);

    List<CalificacionPlatilloDto> getCalificacionByUsuarioId(Integer idUsuario);

    void deleteCalificacion(Integer id);
}
