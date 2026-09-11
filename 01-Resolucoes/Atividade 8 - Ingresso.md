# Atividade 8 - Ingresso

[[00 - Índice|← Índice]]

> Fonte oficial: `Atividades.zip` - classe `atividades.Ingresso`.

```java
public class Ingresso {
    private String evento;
    private double valor;
    private boolean usado;
    public Ingresso(String evento, double valor) {
        this.evento = evento; this.valor = valor; this.usado = false;
    }
    public void usar() {
        if (!usado) { usado = true; System.out.println("Ingresso utilizado."); }
        else System.out.println("Este ingresso já foi utilizado.");
    }
    public void exibir() {
        System.out.printf("%s | R$ %.2f | usado: %b%n", evento, valor, usado);
    }
}
```

**Teste:**

```java
Ingresso ingresso1 = new Ingresso("Show", 80.00);
ingresso1.usar(); // muda usado para true
ingresso1.usar(); // informa que já foi utilizado; estado não muda
```
