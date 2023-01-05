package br.com.nextage.microservice.exemplo.exception

import org.springframework.http.HttpStatus

class CustomException(
        var statusCode: HttpStatus? = HttpStatus.INTERNAL_SERVER_ERROR,
        override var message: String? = null
) : Exception(message)
