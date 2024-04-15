package br.com.fiap.sprint1.dto.response;

public record MoradorResponse(

        Long id,
        String nm_mrd,
        String cpf_mrd,
        String fn_mrd,
        String end_mrd,
        RespCondResponse respCond
) {
}
