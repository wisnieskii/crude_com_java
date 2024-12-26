package com.springcrud.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/alunos")
public class AlunnoController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping(consumes = "application/x-www-form-urlncoded")
    public String salvarAluno(Aluno aluno){
        String sql= "INSERT INTO Aluno (nome, idade, matricula, curso) VALUES (?, ?, ?, ?)";
        int rowsAffected = jdbcTemplate.update(sql, aluno.getNome(), aluno.getIdade(), aluno.getMatricula(),aluno.getCurso());

        if (rowsAffected > 0) {
            return "Aluno cadastrado com sucesso!";
        } else {
            return "Erro ao cadastrar o aluno.";
        }
    }


}
