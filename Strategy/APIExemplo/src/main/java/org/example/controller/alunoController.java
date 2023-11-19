package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.example.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.example.repository.alunos;
import org.example.service.alunoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/aluno")

public class alunoController {

    private alunos alunosRepository;

@Autowired
    private alunoService alunoService;
    public alunoController(alunos alunosRepository) {
        this.alunosRepository = alunosRepository;
    }

    @GetMapping("teste")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String teste(){
        return "HELLO WORD";
    }

    @GetMapping
    @Operation(
            method = "GET",
            description = "Lista todos os alunos cadastrados",
            summary = "Sumario",
            tags = "/api/aluno")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Aluno> find()
    {
        return alunoService.buscarTodos();
    }
    @GetMapping(value = "{id}")
    @Operation(
            method = "GET",
            description = "Lista um aluno cadastrado",
            summary = "Sumario",
            tags = "/api/aluno/id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Optional<Aluno> findById(@PathVariable int id)
    {
        return alunoService.buscar(id);
    }
    @DeleteMapping(value = "{id}")
    @Operation(
            method = "DELETE",
            description = "Deleta um aluno cadastrado",
            summary = "Sumario",
            tags = "/api/aluno/id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable int id)
    {
        alunoService.exluir(id);
    }
    @PostMapping
    @Operation(
            method = "POST",
            description = "Salva um novo aluno",
            summary = "Sumario",
            tags = "/api/aluno")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Aluno salvar(@RequestBody Aluno aluno)
    {
        return alunoService.salvar(aluno);
    }
    @PutMapping
    @Operation(
            method = "PUT",
            description = "Atualiza um aluno existente",
            summary = "Sumario",
            tags = "/api/aluno/id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Aluno editar(@RequestBody Aluno aluno)
    {
        return alunoService.salvar(aluno);
    }

}
