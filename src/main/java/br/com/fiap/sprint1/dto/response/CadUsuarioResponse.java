package br.com.fiap.sprint1.dto.response;

public record CadUsuarioResponse(
        Long id,
        String us_ca_us,
        String sn_ca_us,
        String nm_ca_us,
        String cpf_ca_us,
        String end_ca_us,
        String fn_ca_us,
        RespCondResponse ResCad
) {
}
