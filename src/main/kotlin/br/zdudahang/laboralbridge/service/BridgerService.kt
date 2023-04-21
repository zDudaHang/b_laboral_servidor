package br.zdudahang.laboralbridge.service

import br.zdudahang.laboralbridge.api.model.CreateBridgerDto
import br.zdudahang.laboralbridge.model.Bridger
import br.zdudahang.laboralbridge.repository.BridgerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class BridgerService(
    @Autowired private val repository: BridgerRepository
) {
    fun getByUuid(uuid: UUID): Bridger? {
        return repository.findByIdOrNull(uuid)
    }

    fun create(dto: CreateBridgerDto): UUID? {
        val novoBridger = Bridger(
            nomeCompleto = dto.nomeCompleto,
            email = dto.email
        )
        return repository.save(novoBridger).uuid
    }
}