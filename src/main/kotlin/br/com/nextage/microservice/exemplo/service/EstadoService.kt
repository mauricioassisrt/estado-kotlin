package br.com.nextage.microservice.exemplo.service

import br.com.nextage.microservice.exemplo.dto.EstadoDTO
import br.com.nextage.microservice.exemplo.model.EstadoEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface EstadoService {

    fun save(estadoEntity: EstadoEntity): EstadoDTO?

    fun findById(id: Long): EstadoDTO?

    fun deleteById(id: Long)

    fun findAllFields(search: String?, page: Pageable?): Page<EstadoDTO>

    fun findAll(page: Pageable?): Page<EstadoDTO>
}
