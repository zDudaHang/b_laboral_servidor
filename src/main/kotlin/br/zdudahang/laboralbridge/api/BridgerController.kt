package br.zdudahang.laboralbridge.api

import br.zdudahang.laboralbridge.api.model.CreateBridgerDto
import br.zdudahang.laboralbridge.model.Bridger
import br.zdudahang.laboralbridge.service.BridgerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("bridger")
class BridgerController(
    @Autowired private val service: BridgerService
) {

    @GetMapping("/{uuid}", produces = ["application/json"])
    fun get(@PathVariable uuid: UUID): Bridger? {
        return service.getByUuid(uuid)
    }

    @PostMapping
    fun post(@RequestBody createDto: CreateBridgerDto): UUID? {
        return service.create(createDto)
    }
}