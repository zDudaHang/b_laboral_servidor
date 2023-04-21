package br.zdudahang.laboralbridge.api

import br.zdudahang.laboralbridge.model.Presenca
import br.zdudahang.laboralbridge.service.PresencaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("presenca")
class PresencaController(
    @Autowired private val service: PresencaService
) {

    @GetMapping("/{id}", produces = ["application/json"])
    fun get(@PathVariable id: Long): Presenca? {
        return service.getById(id)
    }

    @PostMapping("/{bridgerUuid}")
    fun post(@PathVariable bridgerUuid: UUID): Long? {
        return service.create(bridgerUuid)
    }
}