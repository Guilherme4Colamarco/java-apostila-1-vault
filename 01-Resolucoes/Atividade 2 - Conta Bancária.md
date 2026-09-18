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


## Leitura do código: por que ele funciona

- O construtor recebe `saldoInicial` porque uma conta precisa nascer já associada a titular e saldo.
- `depositar(valor)` usa `valor > 0`: depósito negativo seria, na prática, uma retirada disfarçada.
- `sacar(valor)` verifica duas condições juntas: o valor deve ser positivo **e** não pode passar do saldo. Só então `saldo -= valor` muda o estado.
- O retorno `boolean` permite que o `main` saiba se o saque ocorreu. `true` significa sucesso; `false`, falha.
- `exibirSaldo()` não altera o dinheiro: apenas torna o estado visível.

**Rastro no `main`:** `new ContaBancaria("Carlos", 500.00)` → depositar 200 → sacar 100 → tentar sacar 1000 → exibir. [[02-Conceitos/Fluxo main, construtor e objeto|Como `main` chama o construtor]]
