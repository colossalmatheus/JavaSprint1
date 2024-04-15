package br.com.fiap.sprint1.dto.request;

public record EncomendaRequest(
        String nm_en,
        String cpf_dest_en,
        String nm_dest_en,
        AbstractRequest pessoa,
        AbstractRequest administrador
) {
}
