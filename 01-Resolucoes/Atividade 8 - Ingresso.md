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


## Leitura do código: por que ele funciona

- O construtor recebe o que identifica o ingresso (`evento`, `valor`) e inicia `usado` como `false`.
- `if (!usado)` é a trava principal: só permite a primeira utilização.
- Depois de `usar()`, o atributo muda para `true`. Na segunda chamada, a condição falha; logo, o estado permanece correto.
- `exibir()` permite que o `main` mostre se o ingresso ainda pode ser utilizado.

**Rastro no `main`:** criar → exibir → usar → exibir → tentar usar novamente. [[02-Conceitos/Fluxo main, construtor e objeto|Como `main` chama o construtor]]
