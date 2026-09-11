/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividades;

/**
 *
 * @author roberto.dti
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("##########################");
        System.out.println("Atividade 1");
        System.out.println("##########################");
        Livro l1 = new Livro();
        l1.titulo = "POO na Prática";
        l1.autor = "Ana Souza";
        l1.disponivel = true;

        l1.exibirDados();
        l1.emprestar();
        l1.exibirDados();
        l1.devolver();
        l1.exibirDados();

        System.out.println("\n##########################");
        System.out.println("Atividade 2");
        System.out.println("##########################");
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Carlos";
        c1.saldo = 500;
        
        c1.depositar(200);
        c1.mostrarSaldo();
        c1.sacar(100);
        c1.mostrarSaldo();
        c1.sacar(1000);
        
        System.out.println("\n##########################");
        System.out.println("Atividade 3");
        System.out.println("##########################");  
        ReservaSala r1 = new ReservaSala();
        r1.sala = "Laboratório 3";
        r1.responsavel = "Marina";
        r1.ativa = false;
        
        r1.exibirSituacao();
        r1.reservar();
        r1.reservar();
        r1.exibirSituacao();
        r1.cancelar();

        System.out.println("\n##########################");
        System.out.println("Atividade 4");
        System.out.println("##########################");  
        Produto p1 = new Produto();
        p1.nome = "Teclado";
        p1.preco = 120;
        p1.quantidade = 5;
        
        p1.entrada(3);
        p1.exibirDados();
        p1.saida(6);
        p1.exibirDados();
        p1.saida(5);
        
        System.out.println("\n##########################");
        System.out.println("Atividade 5");
        System.out.println("##########################");         
        Consulta co1 = new Consulta();
        co1.paciente = "Ana";
        co1.medico = "Dr. Paulo";
        co1.data = "10/09/2026";
        co1.horario = "14:00";
        co1.situacao = "Agendado";
        
        co1.exibir();
        co1.confirmar();
        co1.reagendar("11/09/2026", "15:00");
        co1.exibir();
        co1.cancelar();
        co1.exibir();
        
        System.out.println("\n##########################");
        System.out.println("Atividade 6");
        System.out.println("##########################");         
        Aluno a1 = new Aluno();
        a1.nome = "Lucas";
        a1.matricula = "2026001";
        a1.situacaoAcademica = "Ativo";
        
        a1.exibirDados();
        a1.alterarSituacao("Abandono");
        a1.exibirDados();
        
        System.out.println("\n##########################");
        System.out.println("Atividade 7");
        System.out.println("##########################");          
        Pagamento pa1 = new Pagamento();
        pa1.valor = 250;
        pa1.forma = "Cartão";
        pa1.situacao = "Pendente";
        
        pa1.exibir();
        pa1.confirmar();
        pa1.exibir();
        pa1.cancelar();
        pa1.exibir();
        
        System.out.println("\n##########################");
        System.out.println("Atividade 8");
        System.out.println("##########################");
        Ingresso i1 = new Ingresso();
        i1.evento = "Congresso de Tecnologia";
        i1.valor = 80.00;
        i1.usado = false;

        i1.usar();
        i1.usar();
    }

}
