package br.com.fiap.sprint1.dto.request;

public record AdmEstoqueRequest(
        String nm_admest,
        String us_admest,
        String sn_admest,
        AbstractRequest login
) {
}
