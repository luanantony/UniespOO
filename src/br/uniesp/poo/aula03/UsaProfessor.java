package br.uniesp.poo.aula03;

public class UsaProfessor {
    public static void main(String[] args) {

        Professor fujioka = new Professor();
        fujioka.disciplina = "Linguagem de programação";
        fujioka.ensinar();

        Professor marcelo = new Professor();
        marcelo.disciplina = "Coordenação UNIESP";
        marcelo.ensinar();

    }
}
