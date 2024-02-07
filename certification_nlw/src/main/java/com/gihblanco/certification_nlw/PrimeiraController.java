package com.gihblanco.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
    
    @GetMapping("/retornarPrimeiraController")
    public Usuario retornoPrimeiraController(){
        var usuario = new Usuario("giu", 20);
        return usuario;
    }

    record Usuario(String nome, int idade) {}
}
