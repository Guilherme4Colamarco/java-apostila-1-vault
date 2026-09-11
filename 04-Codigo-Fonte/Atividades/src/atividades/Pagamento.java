/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

/**
 *
 * @author roberto.dti
 */
public class Pagamento {
    public double valor;
    public String forma;
    public String situacao = "Pendente";

    public void confirmar() {
        if (valor > 0 && !situacao.equals("Cancelado")) {
            situacao = "Confirmado";
        }
    }

    public void cancelar() {
        if (!situacao.equals("Cancelado")) {
            situacao = "Cancelado";
        }
    }

    public void exibir() {
        System.out.println("Valor: R$ " + valor);
        System.out.println("Forma: " + forma);
        System.out.println("Situação: " + situacao);
    }
}

