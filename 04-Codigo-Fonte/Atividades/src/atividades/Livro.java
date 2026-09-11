/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;


public class Livro {
    public String titulo;
    public String autor;
    public boolean disponivel;

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Empréstimo realizado.");
        } else {
            System.out.println("Livro indisponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido.");
    }

    public void exibirDados() {
        System.out.println(titulo + " - " + autor);
        System.out.println("Disponível: " + disponivel);
    }
}
