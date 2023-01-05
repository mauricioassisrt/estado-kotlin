package br.com.nextage.microservice.exemplo.service

import br.com.nextage.microservice.exemplo.dto.EstadoDTO
import br.com.nextage.microservice.exemplo.model.EstadoEntity
import br.com.nextage.microservice.exemplo.repository.EstadoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class EstadoServiceImpl : EstadoService {

    @Autowired
    private lateinit var estadoRepository: EstadoRepository


    override fun save(estadoEntity: EstadoEntity): EstadoDTO? {

        return EstadoDTO(estadoRepository.save(estadoEntity))
    }

    override fun findById(id: Long): EstadoDTO? {
        return EstadoDTO(estadoRepository.findByIdOrNull(id))
    }

    override fun deleteById(id: Long) {
        estadoRepository.deleteById(id)
    }

    override fun findAllFields(search: String?, page: Pageable?): Page<EstadoDTO> {
        TODO("Not yet implemented")
    }

    override fun findAll(page: Pageable?): Page<EstadoDTO> {
        return estadoRepository.findAll(null, page).map { EstadoDTO(it) }
    }
}
