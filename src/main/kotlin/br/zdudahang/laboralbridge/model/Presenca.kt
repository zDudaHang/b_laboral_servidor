package br.zdudahang.laboralbridge.model

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.SequenceGenerator
import jakarta.persistence.Table
import java.time.LocalDate

private const val SEQUENCE_NAME = "SQ_ID_TB_PRESENCA"

@Entity
@Table(name = "TB_PRESENCA")
data class Presenca(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
    @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 1)
    val id: Long? = null,
    val dataMarcada: LocalDate,
    @ManyToOne(fetch = FetchType.LAZY)
    val bridger: Bridger
)
