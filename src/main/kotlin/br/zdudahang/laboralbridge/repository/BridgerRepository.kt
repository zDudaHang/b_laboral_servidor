package br.zdudahang.laboralbridge.repository

import br.zdudahang.laboralbridge.model.Bridger
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface BridgerRepository : CrudRepository<Bridger, UUID>