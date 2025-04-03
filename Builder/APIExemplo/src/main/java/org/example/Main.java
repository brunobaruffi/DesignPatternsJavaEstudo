package org.example;

public class Main {
    public static void main(String[] args) {

        Aluno novoAluno = new Aluno.AlunoBuilder()
                .nome("Bruno")
                .telefone("123123123")
                .anoCadastro(2000)
                .build();
        System.out.println(novoAluno.toString());

    }
}