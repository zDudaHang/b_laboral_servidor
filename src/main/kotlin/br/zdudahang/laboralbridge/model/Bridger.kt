package br.zdudahang.laboralbridge.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "TB_BRIDGER")
data class Bridger(
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val uuid: UUID? = null,
    val nomeCompleto: String,
    val email: String,
    val senha: String
)
