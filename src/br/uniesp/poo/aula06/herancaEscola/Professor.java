package br.uniesp.poo.aula06.herancaEscola;

import java.util.Date;

public class Professor extends Pessoa{

    public Professor(String nome, String cpf, Date dataNascimento){
        super(nome, cpf, dataNascimento);
    }
    public double salario;
    public String disciplina;
}
