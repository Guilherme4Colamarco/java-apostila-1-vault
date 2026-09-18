# Atividade 4 - Produto em Estoque

[[00 - Índice|← Índice]]

> Fonte oficial: `Atividades.zip` - classe `atividades.Produto`.

```java
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome; this.preco = preco; this.quantidade = quantidade;
    }
    public void entrada(int unidades) {
        if (unidades > 0) quantidade += unidades;
    }
    public boolean saida(int unidades) {
        if (unidades > 0 && unidades <= quantidade) { quantidade -= unidades; return true; }
        System.out.println("Estoque insuficiente."); return false;
    }
    public void exibirDados() {
        System.out.printf("%s | R$ %.2f | estoque: %d%n", nome, preco, quantidade);
    }
}
```

**Teste pedido:** começar com 5; entrada de 3 resulta em 8; saída de 6 resulta em 2; tentativa de saída de 5 falha e mantém 2 unidades.


## Leitura do código: por que ele funciona

- O construtor cria um produto já completo: nome, preço e quantidade inicial. `int` é adequado para unidades inteiras; `double`, para preço.
- `entrada(unidades)` soma ao estoque somente se a entrada for positiva.
- `saida(unidades)` testa se há quantidade suficiente antes de subtrair. Essa ordem evita estoque negativo.
- O `boolean` retornado por `saida` informa ao `main` se a baixa foi realizada.

**Rastro no `main`:** criar com 5 → entrada 3 → saída 6 → tentar saída 5 → exibir. A última tentativa falha e preserva o estado em 2. [[02-Conceitos/Fluxo main, construtor e objeto|Como `main` chama o construtor]]
