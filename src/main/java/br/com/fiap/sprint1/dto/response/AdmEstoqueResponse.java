package br.com.fiap.sprint1.dto.response;

import lombok.Builder;

@Builder
public record AdmEstoqueResponse(
        Long id,
        String nm_admest,
        String us_admest,
        String sn_admest,
        LoginResponse login
) {}
