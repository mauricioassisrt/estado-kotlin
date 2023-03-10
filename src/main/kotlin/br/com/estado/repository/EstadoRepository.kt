package br.com.estado.repository

import br.com.estado.model.EstadoEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.domain.Specification
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EstadoRepository : JpaRepository<EstadoEntity, Long> {

    fun findAll(spec: Specification<EstadoEntity?>?, page: Pageable?): Page<EstadoEntity>

}
