# Apostila do professor Roberto — leitura 1×1 do código original

> Referência: `04-Codigo-Fonte/Atividades/src/atividades/` e `Principal.java`, material baixado do AVA. Este documento lê o código **como ele foi entregue**; as páginas de resolução também mostram a evolução didática com construtores explícitos.

## Antes de cada exercício: o detalhe dos construtores

No código original, as classes `Livro`, `ContaBancaria`, `ReservaSala`, `Produto`, `Consulta`, `Aluno`, `Pagamento` e `Ingresso` **não declaram construtor**. Por isso Java fornece automaticamente o construtor vazio implícito.

Assim, quando a `Principal` escreve `Livro l1 = new Livro();`, ocorre isto:

1. cria-se o objeto `l1`;
2. Java chama o construtor vazio implícito `Livro()`;
3. atributos começam com valores-padrão: `null` para `String`, `0.0` para `double`, `0` para `int` e `false` para `boolean`;
4. as linhas seguintes da `Principal` preenchem os atributos públicos, por exemplo `l1.titulo = "POO na Prática"`.

A versão com `new Livro("POO na Prática", "Ana Souza")` nas notas é uma evolução: ela substitui as atribuições soltas por um construtor explícito. O conceito é o mesmo; a diferença é **onde** o estado inicial é configurado.

## 1. Livro

A `Principal` cria `l1`, define título, autor e `disponivel = true`, exibe, empresta, exibe, devolve e exibe novamente.

- `emprestar()` só muda `disponivel` para `false` quando ele já está `true`.
- `devolver()` põe o mesmo atributo de volta em `true`.
- `exibirDados()` não altera nada: apenas mostra o estado corrente.

**Leitura da lógica:** o booleano é a memória de “o livro pode ser emprestado agora?”.

## 2. Conta Bancária

A `Principal` cria `c1`, preenche titular Carlos e saldo 500, deposita 200, mostra saldo, saca 100, mostra de novo e tenta sacar 1000.

- `depositar(double valor)` exige `valor > 0`, então o saldo só cresce com depósito válido.
- `sacar(double valor)` verifica `valor > 0 && valor <= saldo`; ambas as condições precisam ser verdadeiras.
- `saldo += valor` soma; `saldo -= valor` subtrai.

**Resultado mental:** 500 → 700 → 600 → tentativa de saque 1000 falha, então continua 600.

## 3. Reserva de Sala

`r1` nasce, recebe sala Laboratório 3, responsável Marina e `ativa = false`. A `Principal` exibe, reserva duas vezes, exibe e cancela.

- `!ativa` significa “ativa é falsa”. A primeira reserva entra no `if` e passa a `true`.
- A segunda reserva cai no `else`, pois a mesma reserva já está ativa.
- `cancelar()` só desativa quando há reserva ativa.

**O que se prova:** método não deve apenas trocar valor; deve respeitar o estado anterior.

## 4. Produto

`p1` recebe nome Teclado, preço 120 e quantidade 5. Depois entra 3, sai 6 e tenta sair 5.

- `entrada(int qtd)` soma somente se `qtd > 0`.
- `saida(int qtd)` confere se `qtd <= quantidade` antes de subtrair.

**Resultado mental:** 5 → 8 → 2 → tentativa de retirar 5 falha, continua 2. Observação: no código original faltou checar `qtd > 0` em `saida`; a revisão melhorada acrescenta essa proteção.

## 5. Consulta

`co1` recebe paciente, médico, data, horário e situação Agendado. Em seguida, a principal exibe, confirma, reagenda, exibe, cancela e exibe.

- `confirmar()` grava a string Confirmada.
- `reagendar(novaData, novoHorario)` primeiro testa se a situação não é Cancelada. Só então substitui data e horário e registra Reagendada.
- Para texto, a comparação correta é `situacao.equals("Cancelada")`, pois `==` não compara o conteúdo das strings.

**Rastro:** Agendado → Confirmada → Reagendada → Cancelada.

## 6. Aluno

`a1` recebe Lucas, matrícula 2026001 e situação Ativo. Após a primeira exibição, chama-se `alterarSituacao("Abandono")` e exibe-se outra vez.

- O parâmetro `novaSituacao` carrega o valor enviado pelo `main`.
- `situacaoAcademica = novaSituacao` grava esse valor no atributo do objeto.

**O ponto-chave:** o método altera o mesmo `a1`; não há um segundo aluno.

## 7. Pagamento

`pa1` recebe valor 250, forma Cartão e situação Pendente. Depois exibe, confirma, exibe, cancela e exibe.

- A própria classe já define `situacao = "Pendente"`; a atribuição da `Principal` repete esse estado inicial.
- `confirmar()` aceita valor positivo enquanto a situação não for Cancelado.
- `cancelar()` altera a situação para Cancelado, desde que ainda não esteja cancelado.

**Rastro:** Pendente → Confirmado → Cancelado.

## 8. Ingresso

`i1` recebe Congresso de Tecnologia, valor 80 e `usado = false`. A principal chama `usar()` duas vezes.

- Na primeira chamada, `!usado` é verdadeiro; logo, o atributo passa a `true`.
- Na segunda, `!usado` é falso; o `else` impede reutilização.

**O ponto-chave:** o objeto preserva memória entre chamadas de método.

## O papel de `Principal`

`Principal` é o roteiro de testes da apostila. Ela não guarda a regra de empréstimo, saque, reserva ou consulta; cada regra fica na classe que possui o estado correspondente.

A fórmula para decorar é:

`Principal cria o objeto` → `atributos definem estado inicial` → `método aplica regra` → `exibição evidencia o estado final`.

Ver também: [[02-Conceitos/Fluxo main, construtor e objeto]] · [[00 - Índice]]
