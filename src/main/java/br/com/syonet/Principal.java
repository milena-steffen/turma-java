package br.com.syonet;

public class Principal {
    public static void main( String[] args ){
        Turma turma = new Turma();
        
        turma.adicionarAluno(new Aluno("João", "123", 8.5));
        turma.adicionarAluno(new Aluno("Maria", "456", 9.0));
        turma.adicionarAluno(new Aluno("Pedro", "789", 7.5));

        System.out.println("Lista de alunos:");
        for (Aluno aluno : turma.listarAlunos()) {
            System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula() + ", Nota: " + aluno.getNota());
        }
        System.out.println("Média das notas: " + turma.calcularMedia());
    }

    }

