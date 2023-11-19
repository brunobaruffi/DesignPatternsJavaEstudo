package org.example.service;

import org.example.entity.Aluno;

import java.util.List;
import java.util.Optional;

public interface alunoService {
    Aluno salvar(Aluno aluno);
    void exluir(int id);
    Optional<Aluno> buscar(int id);
    List<Aluno> buscarTodos();
}
