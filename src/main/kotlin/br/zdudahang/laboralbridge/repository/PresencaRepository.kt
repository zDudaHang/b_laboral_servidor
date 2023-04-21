package br.zdudahang.laboralbridge.repository

import br.zdudahang.laboralbridge.model.Presenca
import org.springframework.data.repository.CrudRepository

interface PresencaRepository : CrudRepository<Presenca, Long>