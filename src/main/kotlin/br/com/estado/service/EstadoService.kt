package br.com.estado.service

import br.com.estado.dto.EstadoDTO
import br.com.estado.model.EstadoEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface EstadoService {

    fun save(estadoEntity: EstadoEntity): EstadoDTO?

    fun findById(id: Long): EstadoDTO?

    fun deleteById(id: Long)

    fun findAllFields(search: String?, page: Pageable?): Page<EstadoDTO>

    fun findAll(page: Pageable?): Page<EstadoDTO>
}
