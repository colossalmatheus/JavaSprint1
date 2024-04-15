package br.com.fiap.sprint1.dto.request;

public record CadEstoqueRequest(

        String nm_caes,
        String end_caes,
        String cgd_caes,
        String stt_caes,
        AbstractRequest admin
) {
}
