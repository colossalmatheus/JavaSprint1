package br.com.fiap.sprint1.dto.response;

public record LoginResponse(
        Long id,
        String us_lg,
        String sn_lg,
        MoradorResponse morador
) {
}
