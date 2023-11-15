package org.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="aluno")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @NotEmpty(message = "Nome nao pode ser vazio")
    @Column(name="nome")
    private String nome;
    @NotNull(message = "Data Obrigatoria")
    @Column(name = "nas")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dataNas;
    @NotEmpty(message = "Não pode ser vazio")
    @Column(name="cpf", length = 15)
    private String cpf;

}
