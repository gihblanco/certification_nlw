package com.gihblanco.certification_nlw.Modelos.Estudante.Entities;

import java.util.UUID;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class CertificadosEstudantes {
    private UUID id;
    private UUID estudanteID;
    private String tecnologia;
    private Integer nota;
    private List<RespostasCertificados> respostaCertificados;

}
