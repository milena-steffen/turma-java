package br.com.syonet;

public class Aluno {
    String nome;
    String matricula;
    Double nota;


public Aluno (String nome, String matricula, Double nota){
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
}

public String getNome() {
    return nome;
}

public String getMatricula() {
    return matricula;
}

public double getNota() {
    return nota;
}

public String toString() {
    return "Aluno{" +
            "nome='" + nome + '\'' +
            ", matricula='" + matricula + '\'' +
            ", nota=" + nota +
            '}';
}
}