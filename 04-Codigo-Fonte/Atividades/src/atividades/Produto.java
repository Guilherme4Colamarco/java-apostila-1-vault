/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

/**
 *
 * @author roberto.dti
 */
public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void entrada(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
        }
    }

    public void saida(int qtd) {
        if (qtd <= quantidade) {
            quantidade -= qtd;
        } else {
            System.out.println("Saída não permitida.");
        }
    }

    public void exibirDados() {
        System.out.println(nome + " - R$ " + preco);
        System.out.println("Estoque: " + quantidade);
    }
}

