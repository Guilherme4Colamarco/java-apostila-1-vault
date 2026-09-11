# Atividade 1 - Livro

[[00 - Índice|← Índice]] | Conceitos: [[02-Conceitos/POO - Fundamentos da semana 1|classe, estado e comportamento]]

**Classe principal:** `Livro`, pois representa o item cujo empréstimo o sistema controla.

> Fonte oficial: `Atividades.zip` - classe `atividades.Livro`. A versão publicada usa atributos públicos e preenche o objeto na classe `Principal`; a versão abaixo acrescenta construtor e encapsulamento como melhoria didática.

```text
Livro
--------------------------
- titulo: String
- autor: String
- disponivel: boolean
--------------------------
+ emprestar(): void
+ devolver(): void
+ exibirDados(): void
```

```java
public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Empréstimo realizado.");
        } else System.out.println("Livro indisponível.");
    }
    public void devolver() { disponivel = true; }
    public void exibirDados() {
        System.out.printf("%s - %s | disponível: %b%n", titulo, autor, disponivel);
    }
}
```

**Objeto pedido:** `Livro livro1 = new Livro("POO na Prática", "Ana Souza");`.

`emprestar()` muda o estado de disponível para indisponível; `devolver()` faz o caminho inverso.
