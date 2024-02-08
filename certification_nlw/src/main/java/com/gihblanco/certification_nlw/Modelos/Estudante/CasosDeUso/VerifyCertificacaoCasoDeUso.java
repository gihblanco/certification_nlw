package com.gihblanco.certification_nlw.Modelos.Estudante.CasosDeUso;

import org.springframework.stereotype.Service;

import com.gihblanco.certification_nlw.Modelos.Estudante.DTO.VerifyCertificacaoDTO;

@Service
public class VerifyCertificacaoCasoDeUso {
    public boolean executa(VerifyCertificacaoDTO dto){
        if(dto.getEmail().equals("giu@gii.com") && dto.getTecnologia().equals("JAVA")){
            return true;
        }
        return false;
    }
}
