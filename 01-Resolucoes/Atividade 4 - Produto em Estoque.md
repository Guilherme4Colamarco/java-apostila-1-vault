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
