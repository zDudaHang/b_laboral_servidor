package br.zdudahang.laboralbridge.service

import br.zdudahang.laboralbridge.model.Presenca
import br.zdudahang.laboralbridge.repository.BridgerRepository
import br.zdudahang.laboralbridge.repository.PresencaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.util.UUID

@Service
class PresencaService(
    @Autowired private val presencaRepository: PresencaRepository,
    @Autowired private val bridgerRepository: BridgerRepository
) {
    fun getById(id: Long): Presenca? {
        return presencaRepository.findByIdOrNull(id)
    }

    fun create(bridgerUuid: UUID): Long? {
        val bridger = bridgerRepository.findByIdOrNull(bridgerUuid)

        return if (bridger != null) {
            val now = LocalDate.now()
            val novaPresenca = Presenca(
                dataMarcada = now,
                bridger = bridger
            )
            presencaRepository.save(novaPresenca).id
        } else {
            null
        }
    }
}