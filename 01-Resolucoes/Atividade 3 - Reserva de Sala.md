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
