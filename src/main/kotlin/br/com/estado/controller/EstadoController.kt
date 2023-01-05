package br.com.estado.controller

import br.com.estado.dto.EstadoDTO
import br.com.estado.service.EstadoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/estado")
class EstadoController {

    @Autowired
    private lateinit var estadoService: EstadoService

    @PostMapping(value = ["/v1/"])
    fun save(@RequestBody estadoDTO: EstadoDTO): ResponseEntity<EstadoDTO?> {
        return ResponseEntity.status(HttpStatus.CREATED).body(estadoService.save(estadoDTO.toEntity()))
    }

    @GetMapping(value = ["/v1/{id}/"])
    fun findById(@PathVariable("id") id: Long): ResponseEntity<EstadoDTO?> {
        return ResponseEntity.status(HttpStatus.OK).body(estadoService.findById(id))
    }

    @DeleteMapping(value = ["/v1/{id}/"])
    @ResponseStatus(value = HttpStatus.OK)
    fun deleteById(@PathVariable("id") id: Long) {
        estadoService.deleteById(id)
    }

    @GetMapping(value = ["/v1/"])
    fun list(@RequestParam search: String?, page: Pageable?): Page<EstadoDTO> {
        return if (search?.isNotBlank() == true)
            estadoService.findAllFields(search, page)
        else
            estadoService.findAll(page)
    }
}
