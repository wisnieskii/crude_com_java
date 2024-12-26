package com.springcrud.crud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/cadastro")
    public String exibirCadastro(){
        return "cadastro";
    }
}
