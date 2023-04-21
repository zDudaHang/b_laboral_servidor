package br.zdudahang.laboralbridge.api.model

data class CreateBridgerDto(
    val nomeCompleto: String,
    val email: String,
    val senha: String
)