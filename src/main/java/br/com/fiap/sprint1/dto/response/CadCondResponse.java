package br.com.fiap.sprint1.dto.response;

public record CadCondResponse(
        Long id,
        String cpnj_caco,
        String nm_caco,
        String end_caco,
        String fn_caco,
        RespCondResponse cadastroCond
) {
}
