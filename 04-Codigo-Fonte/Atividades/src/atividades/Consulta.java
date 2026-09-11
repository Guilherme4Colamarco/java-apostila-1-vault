/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

/**
 *
 * @author roberto.dti
 */
public class Consulta {
    public String paciente;
    public String medico;
    public String data;
    public String horario;
    public String situacao;

    public void confirmar() {
        situacao = "Confirmada";
    }

    public void cancelar() {
        situacao = "Cancelada";
    }

    public void reagendar(String novaData, String novoHorario) {
        if (!situacao.equals("Cancelada")) {
            data = novaData;
            horario = novoHorario;
            situacao = "Reagendada";
        }
    }

    public void exibir() {
        System.out.println(paciente + " - " + medico);
        System.out.println(data + " " + horario + " - " + situacao);
    }
}

