package org.example;

import lombok.Data;

@Data
public class Aluno {
    private String nome;
    private String telefone;
    private Integer anoCadastro;

    private Aluno(AlunoBuilder alunoBuilder) {
        this.nome = alunoBuilder.nome;
        this.telefone = alunoBuilder.telefone;
        this.anoCadastro = alunoBuilder.anoCadastro;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", anoCadastro=" + anoCadastro +
                '}';
    }

    public static class AlunoBuilder{
        private String nome;
        private String telefone;
        private Integer anoCadastro;

        public AlunoBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        public AlunoBuilder telefone(String telefone){
            this.telefone = telefone;
            return this;
        }
        public AlunoBuilder anoCadastro(Integer ano){
            this.anoCadastro = ano;
            return this;
        }

        public Aluno build(){
            return new Aluno(this);
        }
    }
}
