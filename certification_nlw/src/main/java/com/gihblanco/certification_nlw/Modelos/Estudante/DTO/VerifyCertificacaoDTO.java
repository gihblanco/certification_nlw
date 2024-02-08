package com.gihblanco.certification_nlw.Modelos.Estudante.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class VerifyCertificacaoDTO {
    private String email;
    private String tecnologia;
}
