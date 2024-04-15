package br.com.fiap.sprint1.dto.request;

public record LoginRequest(
        String us_lg,
        String sn_lg,
        AbstractRequest morador
) {
}
