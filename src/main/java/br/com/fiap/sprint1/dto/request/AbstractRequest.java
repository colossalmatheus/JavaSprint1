package br.com.fiap.sprint1.dto.request;

import jakarta.validation.constraints.NotNull;


public record AbstractRequest(
        @NotNull(message = "O id é campo obrigatório")
        Long id
) {
}
