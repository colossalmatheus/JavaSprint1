package br.com.fiap.sprint1.dto.request;

public record CadCondRequest(
        String cpnj_caco,
        String nm_caco,
        String end_caco,
        String fn_caco,
        AbstractRequest cadastroCond
) {
}
