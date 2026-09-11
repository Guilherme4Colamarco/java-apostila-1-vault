# Atividade 2 - Conta Bancária

[[00 - Índice|← Índice]]

`sacar()` consulta o saldo porque um saque só pode ocorrer se houver dinheiro suficiente. Depósito válido soma ao saldo; saque válido subtrai.

> Fonte oficial: `Atividades.zip` - classe `atividades.ContaBancaria`. O teste publicado deposita R$ 200, saca R$ 100 e tenta sacar R$ 1.000.

```text
ContaBancaria: titular, saldo | depositar(), sacar(), exibirSaldo()
```

```java
public class ContaBancaria {
    private String titular;
    private double saldo;
    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
        else System.out.println("Depósito deve ser positivo.");
    }
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) { saldo -= valor; return true; }
        System.out.println("Saque inválido ou saldo insuficiente.");
        return false;
    }
    public void exibirSaldo() { System.out.printf("%s: R$ %.2f%n", titular, saldo); }
}
```

**Objeto pedido:** `ContaBancaria conta1 = new ContaBancaria("Carlos", 500.00);`.
