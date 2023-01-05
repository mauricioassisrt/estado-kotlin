package br.com.estado.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "estado")
class EstadoEntity(
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @Column(name = "nome")
        var nome: String? = null,
        @Column(name = "sigla")
        var sigla: String? = null,


        ) : Serializable
