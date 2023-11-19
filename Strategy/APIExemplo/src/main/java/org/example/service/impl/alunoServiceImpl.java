package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.entity.Aluno;
import org.example.service.alunoService;
import org.example.repository.alunos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class alunoServiceImpl implements alunoService {


    @Autowired
    private alunos alunosRepository;
    public Aluno salvar(Aluno aluno)
    {
        return alunosRepository.save(aluno);
    }
    public void exluir(int id)
    {
        alunosRepository.deleteById(id);
    }
    public Optional<Aluno> buscar(int id)
    {
        return alunosRepository.findById(id);
    }

    public List<Aluno> buscarTodos()
    {
        return alunosRepository.findAll();
    }
}
