# Atividade 7 - Pagamento

[[00 - Índice|← Índice]]

> Fonte oficial: `Atividades.zip` - classe `atividades.Pagamento`. A solução publicada permite cancelar enquanto a situação não for `Cancelado`.

**Regras definidas:** um pagamento só é confirmado se o valor for maior que zero; um pagamento confirmado não pode ser cancelado.

```java
public class Pagamento {
    private double valor;
    private String forma, situacao;
    public Pagamento(double valor, String forma) {
        this.valor = valor; this.forma = forma; this.situacao = "Pendente";
    }
    public void confirmar() {
        if (valor > 0 && situacao.equals("Pendente")) situacao = "Confirmado";
        else System.out.println("Não foi possível confirmar.");
    }
    public void cancelar() {
        if (situacao.equals("Pendente")) situacao = "Cancelado";
        else System.out.println("Somente pagamento pendente pode ser cancelado.");
    }
    public void exibir() { System.out.printf("R$ %.2f | %s | %s%n", valor, forma, situacao); }
}
```

Pagamento é um objeto abstrato: não é físico, mas possui estado e comportamentos próprios.


## Leitura do código: por que ele funciona

- O construtor recebe valor e forma de pagamento, mas define a situação internamente como `"Pendente"`: é a regra do estado inicial.
- `confirmar()` exige valor positivo e situação pendente; assim um pagamento já cancelado não vira confirmado sem regra explícita.
- `cancelar()` aceita somente o estado pendente. O método protege a consistência do objeto.
- `situacao.equals(...)` compara o conteúdo dos textos corretamente em Java.

**Rastro no `main`:** criar pagamento pendente → exibir → confirmar **ou** cancelar → exibir. Teste também a chamada proibida para ver a mensagem e confirmar que o estado não mudou. [[02-Conceitos/Fluxo main, construtor e objeto|Como `main` chama o construtor]]
