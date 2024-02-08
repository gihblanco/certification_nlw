package com.gihblanco.certification_nlw.Modelos.Estudante.Entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor @NoArgsConstructor
public class RespostasCertificados {
    private UUID id;
    private UUID certificadosEstudantesID;
    private UUID estudantesID;
    private UUID questaoID;
    private UUID respostaID;
    private boolean estaCorreta;
    
}
