package br.com.syonet;

import java.util.ArrayList;
import  java.util.List;

public class Turma implements Gerenciamento {
    private List<Aluno> alunos = new ArrayList<>();


    @Override
public void adicionarAluno(Aluno aluno) {
    alunos.add(aluno);
}

@Override
public void removerAluno(String matricula) {
    alunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
}

@Override
public List<Aluno> listarAlunos() {
    return new ArrayList<>(alunos);
}

    @Override
public double calcularMedia() {
    if (alunos.isEmpty()) {
        return 0;
    }
    double somaNotas = 0;
    for (Aluno aluno : alunos) {
        somaNotas += aluno.getNota();
    }
    return somaNotas / alunos.size();
}
        }


