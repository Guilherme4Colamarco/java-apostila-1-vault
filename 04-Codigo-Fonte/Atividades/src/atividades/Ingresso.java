/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

public class Ingresso {
    public String evento;
    public double valor;
    public boolean usado;

    public void usar() {
        if (!usado) {
            usado = true;
            System.out.println("Ingresso utilizado.");
        } else {
            System.out.println("Ingresso já utilizado.");
        }
    }

    public void exibir() {
        System.out.println("Evento: " + evento);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Usado: " + usado);
    }
}


