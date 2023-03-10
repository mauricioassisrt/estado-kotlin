package br.com.estado.dto

import br.com.estado.model.EstadoEntity

data class EstadoDTO(
    var id: Long? = null,
    var nome: String? = null,
    var sigla: String? = null
) {
    constructor(estadoEntity: EstadoEntity?) : this() {
        this.id = estadoEntity?.id
        this.nome = estadoEntity?.nome
        this.sigla = estadoEntity?.sigla

    }

    fun toEntity(): EstadoEntity {
        return EstadoEntity(
            this.id,
            this.nome,
            this.sigla
        )
    }
}

