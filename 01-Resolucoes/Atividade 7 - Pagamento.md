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
