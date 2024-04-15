package br.com.fiap.sprint1.dto.request;

public record MoradorRequest(

        String nm_mrd,
        String cpf_mrd,
        String fn_mrd,
        String end_mrd,
        AbstractRequest respCond
) {
}
