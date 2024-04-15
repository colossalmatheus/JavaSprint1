package br.com.fiap.sprint1.dto.response;

public record CadEstoqueResponse(
        Long id,
        String nm_caes,
        String end_caes,
        String cgd_caes,
        String stt_caes,
        AdmEstoqueResponse admin
) {
}
