package br.com.fiap.sprint1.dto.request;

import org.antlr.v4.runtime.misc.NotNull;

public record AbstractRequest(
        @NotNull(message = "O id é campo obrigatório")
        Long id

) {

}
