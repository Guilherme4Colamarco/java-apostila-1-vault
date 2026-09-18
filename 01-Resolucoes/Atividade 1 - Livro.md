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


## Leitura do código: por que ele funciona

- `titulo`, `autor` e `disponivel` são o estado que cada livro precisa guardar. `disponivel` começa como `true` porque um livro novo no sistema ainda não foi emprestado.
- `new Livro("POO na Prática", "Ana Souza")` chama o construtor e entrega os dois textos aos parâmetros. O construtor copia esses valores para os atributos com `this.titulo` e `this.autor`.
- `emprestar()` lê `disponivel` antes de alterar. Sem esse `if`, o mesmo livro poderia ser emprestado infinitamente.
- `devolver()` restaura o estado para `true`; ele não cria outro livro.
- `exibirDados()` serve para o `main` provar o antes e o depois da ação.

**Rastro no `main`:** criar → exibir → emprestar → exibir → devolver → exibir. [[02-Conceitos/Fluxo main, construtor e objeto|Como `main` chama o construtor]]
