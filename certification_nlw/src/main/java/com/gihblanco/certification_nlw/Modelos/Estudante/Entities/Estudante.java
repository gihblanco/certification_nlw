package com.gihblanco.certification_nlw.Modelos.Estudante.Entities;

import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor @NoArgsConstructor
public class Estudante {
    private UUID id;
    private String email;
    private List<CertificadosEstudantes> certificadosEstudantes;
}
