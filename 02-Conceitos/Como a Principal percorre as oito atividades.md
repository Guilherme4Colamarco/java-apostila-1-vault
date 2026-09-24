# Como a `Principal` percorre as oito atividades

> Material didático baseado no código original do professor Roberto. Fonte: [[Apostila do professor Roberto - leitura 1x1]] e `04-Codigo-Fonte/Atividades/src/atividades/Principal.java`.
>
> **Importante:** esta página explica a execução; não é uma transcrição literal do caderno. O código original usa campos públicos e não declara construtores nas classes de exercício.

## A sequência que se repete

Em cada bloco, `Principal.main` executa uma sequência de instruções. O objeto mantém seus valores entre as chamadas:

1. `Tipo variavel = new Tipo();` cria uma instância.
2. As atribuições seguintes preenchem seus campos.
3. Uma chamada `variavel.metodo(...)` executa uma regra definida na classe.
4. Chamadas de exibição mostram os valores atuais.

### O que acontece em `new Livro()`?

`Livro` não declara nenhum construtor. O compilador disponibiliza um construtor sem argumentos implícito. Assim, `new Livro()` cria o objeto e chama esse construtor. Inicialmente, os campos recebem os valores-padrão do Java: `null` para referências como `String`, `0.0` para `double`, `0` para `int` e `false` para `boolean`. O `main` então atribui `"POO na Prática"`, `"Ana Souza"` e `true`.

Isso é diferente de escrever `new Livro("POO na Prática", "Ana Souza")`: a chamada com parâmetros exigiria um construtor explícito, que não existe na classe original. Não use essa forma ao descrever fielmente esta implementação.

## Rastreamento das atividades

| Exercício | Criação e estado inicial no `main` | Chamadas em ordem | Efeito principal |
|---|---|---|---|
| 1 — Livro | `Livro l1 = new Livro()`; título `POO na Prática`, autor `Ana Souza`, disponível `true` | `exibirDados()` → `emprestar()` → `exibirDados()` → `devolver()` → `exibirDados()` | Disponibilidade: `true` → `false` → `true`. As exibições mostram o estado em cada ponto. |
| 2 — Conta bancária | `ContaBancaria c1`; titular `Carlos`, saldo `500` | `depositar(200)` → `mostrarSaldo()` → `sacar(100)` → `mostrarSaldo()` → `sacar(1000)` | Saldo: `500` → `700` → `600`; o saque de `1000` é recusado porque excede o saldo, que permanece `600`. |
| 3 — Reserva de sala | `ReservaSala r1`; sala `Laboratório 3`, responsável `Marina`, ativa `false` | `exibirSituacao()` → `reservar()` → `reservar()` → `exibirSituacao()` → `cancelar()` | A primeira reserva muda `false` para `true`; a segunda encontra a reserva já ativa; o cancelamento volta para `false`. |
| 4 — Produto | `Produto p1`; nome `Teclado`, preço `120`, quantidade `5` | `entrada(3)` → `exibirDados()` → `saida(6)` → `exibirDados()` → `saida(5)` | Quantidade: `5` → `8` → `2`; a saída de `6` é permitida, a de `5` depois é recusada. |
| 5 — Consulta | `Consulta co1`; paciente `Ana`, médico `Dr. Paulo`, data `10/09/2026`, horário `14:00`, situação `Agendado` | `exibir()` → `confirmar()` → `reagendar("11/09/2026", "15:00")` → `exibir()` → `cancelar()` → `exibir()` | Situação: `Agendado` → `Confirmada` → `Reagendada` → `Cancelada`. O reagendamento troca também data e horário. |
| 6 — Aluno | `Aluno a1`; `Lucas`, matrícula `2026001`, situação `Ativo` | `exibirDados()` → `alterarSituacao("Abandono")` → `exibirDados()` | O parâmetro `novaSituacao` recebe `"Abandono"` e substitui a situação do mesmo objeto `a1`. |
| 7 — Pagamento | `Pagamento pa1`; valor `250`, forma `Cartão`; situação começa como `Pendente` no inicializador do campo e é atribuída novamente no `main` | `exibir()` → `confirmar()` → `exibir()` → `cancelar()` → `exibir()` | Situação: `Pendente` → `Confirmado` → `Cancelado`. A confirmação exige valor positivo e situação ainda não cancelada. |
| 8 — Ingresso | `Ingresso i1`; evento `Congresso de Tecnologia`, valor `80.00`, usado `false` | `usar()` → `usar()` | A primeira chamada muda `usado` para `true`; a segunda vê esse estado e impede o segundo uso. |

## Ligando cada chamada à classe certa

`Principal` organiza o cenário de teste, mas não implementa as regras dos exercícios. Por exemplo, a condição que autoriza o saque está em `ContaBancaria.sacar`; o estado consultado e alterado é `c1.saldo`. A chamada `c1.sacar(100)` direciona a execução para esse método, e quando ele termina o `main` continua na próxima linha.

O objeto não é recriado a cada chamada. `c1.depositar(200)` e depois `c1.sacar(100)` operam sobre a mesma instância referenciada por `c1`. Por isso o segundo método recebe o saldo já atualizado pelo primeiro.

## Pegadinhas observáveis no código original

- **Uma variável guarda a referência ao objeto:** `l1`, `c1`, `r1` etc. continuam apontando para suas instâncias enquanto o método `main` executa.
- **A chamada do método não reinicia os campos:** cada operação parte do estado deixado pela operação anterior.
- **`Pagamento` tem inicializador de campo:** `situacao` começa como `"Pendente"` assim que o objeto é criado, antes da atribuição explícita no `main`.
- **A checagem de `Produto.saida` só testa `qtd <= quantidade`:** no código original, uma quantidade negativa também passaria nessa condição e aumentaria o estoque ao subtrair um número negativo. A implementação não verifica `qtd > 0`; isso é uma observação sobre a fonte, não uma regra da atividade.
- **Nem todas as mudanças são exibidas depois:** por exemplo, a atividade 3 cancela a reserva sem chamar `exibirSituacao()` novamente. O campo ainda muda para `false`, embora essa última mudança não apareça na saída daquela sequência.

## Um jeito de explicar em voz alta

Para cada exercício, responda nesta ordem: “`main` criou qual objeto? Que valores colocou nele? Qual método chamou? Que condição foi avaliada? Qual campo mudou? O que foi impresso depois?” Se responder isso seguindo as linhas reais, você consegue reconstruir a execução sem decorar o programa como uma sequência sem sentido.

## Links

- [[Fluxo main, construtor e objeto]]
- [[Apostila do professor Roberto - leitura 1x1]]
- [[00 - Índice]]
