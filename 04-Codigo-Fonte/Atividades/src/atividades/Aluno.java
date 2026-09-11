/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

/**
 *
 * @author roberto.dti
 */
public class Aluno {
    public String nome;
    public String matricula;
    public String situacaoAcademica;

    public void alterarSituacao(String novaSituacao) {
        situacaoAcademica = novaSituacao;
    }

    public void exibirDados() {
        System.out.println(nome + " - " + matricula);
        System.out.println("Situação: " + situacaoAcademica);
    }
}

