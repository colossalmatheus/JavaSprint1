package br.com.fiap.sprint1.dto.response;

public record EncomendaResponse(
        Long id,
        String nm_en,
        String cpf_dest_en,
        String nm_dest_en,
        MoradorResponse pessoa,
        AdmEstoqueResponse administrador
) {
}
