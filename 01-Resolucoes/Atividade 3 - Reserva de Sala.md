# Atividade 3 - Reserva de Sala

[[00 - Índice|← Índice]]

> Fonte oficial: `Atividades.zip` - classe `atividades.ReservaSala`. O teste chama `reservar()` duas vezes, exibe a situação e então cancela.

```java
public class ReservaSala {
    private String sala, responsavel;
    private boolean ativa;
    public ReservaSala(String sala, String responsavel) {
        this.sala = sala; this.responsavel = responsavel; this.ativa = false;
    }
    public void reservar() {
        if (!ativa) { ativa = true; System.out.println("Reserva ativada."); }
        else System.out.println("A sala já está reservada.");
    }
    public void cancelar() { ativa = false; System.out.println("Reserva cancelada."); }
    public void exibirSituacao() {
        System.out.printf("%s | %s | ativa: %b%n", sala, responsavel, ativa);
    }
}
```

**Objeto pedido:** `new ReservaSala("Laboratório 3", "Marina")`. O estado inicial é `ativa = false`; chamar `reservar()` o torna `true`.


## Leitura do código: por que ele funciona

- Uma reserva nasce inativa: por isso o construtor define `ativa = false`.
- `!ativa` significa “não está ativa”. É a regra que impede reservar duas vezes a mesma reserva.
- `reservar()` muda apenas o booleano do objeto que recebeu a chamada; `cancelar()` faz o caminho inverso.
- Os parâmetros `sala` e `responsavel` entram no construtor porque identificam qual reserva está sendo criada.

**Rastro no `main`:** criar sala/responsável → reservar → tentar reservar de novo → exibir → cancelar → exibir. [[02-Conceitos/Fluxo main, construtor e objeto|Como `main` chama o construtor]]
