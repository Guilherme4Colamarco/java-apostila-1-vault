# Atividade 5 - Consulta Médica

[[00 - Índice|← Índice]]

> Fonte oficial: `Atividades.zip` - classe `atividades.Consulta`. No teste publicado, a consulta é confirmada, reagendada para 11/09/2026 às 15:00 e depois cancelada.

```java
public class Consulta {
    private String paciente, medico, data, horario, situacao;
    public Consulta(String paciente, String medico, String data, String horario) {
        this.paciente = paciente; this.medico = medico;
        this.data = data; this.horario = horario; this.situacao = "Agendada";
    }
    public void confirmar() { if (!situacao.equals("Cancelada")) situacao = "Confirmada"; }
    public void cancelar() { situacao = "Cancelada"; }
    public void reagendar(String novaData, String novoHorario) {
        if (!situacao.equals("Cancelada")) { data = novaData; horario = novoHorario; situacao = "Agendada"; }
    }
    public void exibir() { System.out.printf("%s | %s | %s %s | %s%n", paciente, medico, data, horario, situacao); }
}
```

**Objeto pedido:** `new Consulta("Ana", "Dr. Paulo", "10/09/2026", "14:00")`.

A regra escolhida impede confirmar ou reagendar uma consulta cancelada.


## Leitura do código: por que ele funciona

- O construtor recebe paciente, médico, data e horário porque são os dados mínimos para uma consulta existir; ele define `situacao = "Agendada"` como estado inicial.
- Para comparar textos em Java, usa-se `.equals()`, não `==`. Por isso as regras testam `situacao.equals("Cancelada")`.
- `confirmar()` e `reagendar()` protegem a regra de negócio: consulta cancelada não volta a ser confirmada/reagendada por acidente.
- `reagendar()` muda data e horário do mesmo objeto e retorna sua situação para agendada.

**Rastro no `main`:** criar → confirmar → exibir → reagendar → exibir → cancelar → exibir. [[02-Conceitos/Fluxo main, construtor e objeto|Como `main` chama o construtor]]
