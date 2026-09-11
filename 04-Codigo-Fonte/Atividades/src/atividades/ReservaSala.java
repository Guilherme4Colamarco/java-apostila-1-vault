/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;


public class ReservaSala {
    public String sala;
    public String responsavel;
    public boolean ativa;

    public void reservar() {
        if (!ativa) {
            ativa = true;
            System.out.println("Reserva realizada.");
        } else {
            System.out.println("A reserva já está ativa.");
        }
    }

    public void cancelar() {
        if (ativa) {
            ativa = false;
            System.out.println("Reserva cancelada.");
        } else {
            System.out.println("Não há reserva ativa.");
        }
    }

    public void exibirSituacao() {
        System.out.println("Sala: " + sala);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Ativa: " + ativa);
    }
}
