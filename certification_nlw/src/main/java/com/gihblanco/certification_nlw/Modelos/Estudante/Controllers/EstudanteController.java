package com.gihblanco.certification_nlw.Modelos.Estudante.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gihblanco.certification_nlw.Modelos.Estudante.CasosDeUso.VerifyCertificacaoCasoDeUso;
import com.gihblanco.certification_nlw.Modelos.Estudante.DTO.VerifyCertificacaoDTO;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    
    @Autowired
    private VerifyCertificacaoCasoDeUso verifyCertificacaoCasoDeUso;

    @PostMapping("/verifyCertificacao")
    public String verifyCertificacao(@RequestBody VerifyCertificacaoDTO verifyCertificacaoDTO){

        var resultado = this.verifyCertificacaoCasoDeUso.executa(verifyCertificacaoDTO);
        if(resultado){

            return "Usuario já fez a prova";
        }
         return "Usuario pode fazer a prova";
    }
}
