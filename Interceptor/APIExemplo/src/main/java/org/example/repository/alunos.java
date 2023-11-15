package org.example.repository;

import org.example.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface alunos extends JpaRepository<Aluno, Integer> {

}
