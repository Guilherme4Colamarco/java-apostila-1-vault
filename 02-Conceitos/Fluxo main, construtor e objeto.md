# Fluxo do código: `main` → `new` → construtor → métodos

## A ordem real em que o programa acontece

A prova não avalia “palavras mágicas soltas”. Ela avalia se você entende a sequência abaixo:

1. Java inicia em `public static void main(String[] args)`.
2. A linha `Tipo nome = new Tipo(dados)` cria um objeto.
3. No mesmo instante, o construtor `Tipo(...)` recebe os dados e dá um estado inicial ao objeto.
4. As chamadas `nome.metodo()` usam aquele mesmo objeto: podem mudar seu estado, testar regras ou exibir dados.
5. Uma chamada final de exibição prova o que mudou.

```java
Produto produto1 = new Produto("Mouse", 80.0, 5);
```

Essa linha não é uma única ideia; ela reúne quatro:

| Trecho | Significado |
|---|---|
| `Produto` (à esquerda) | tipo da variável de referência |
| `produto1` | nome usado para acessar aquele objeto |
| `new Produto(...)` | cria o objeto na memória |
| `Produto(...)` | chama o construtor imediatamente |

No construtor, `this.nome = nome` quer dizer: “grave no atributo do objeto o valor recebido pelo parâmetro”. O `this` resolve a ambiguidade porque ambos têm o mesmo nome.

## Por que o construtor importa

O construtor evita que o objeto nasça incompleto. Exemplo:

```java
public Produto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}
```

Depois de `new Produto("Mouse", 80.0, 5)`, o objeto já possui nome, preço e quantidade. Não é preciso criar o objeto vazio e preencher atributo por atributo no `main`.

## Como ler cada método

- Método que só imprime, como `exibirDados()`: **consulta** o estado; não deveria mudá-lo.
- Método como `depositar(valor)`: recebe dado externo, valida a regra e muda o estado.
- Método como `usar()` ou `emprestar()`: lê um `boolean`, decide com `if` e altera esse boolean quando permitido.
- `boolean` como retorno: além de agir, informa ao `main` se a ação deu certo. Ex.: `if (conta.sacar(100))`.

## Forma de revisar no papel

Para qualquer exercício, escreva uma setinha mental:

`main` cria → construtor inicializa → método altera/testa → método exibe.

Se você consegue dizer quais atributos começam com quais valores e qual chamada os altera, você entendeu o programa — não apenas copiou a sintaxe.

Voltar: [[00 - Índice]]
