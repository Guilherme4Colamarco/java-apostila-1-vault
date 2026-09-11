# Atividade Referencial - Academia

[[00 - Índice|← Índice]]

Fonte: **Atividade Referencial de Resposta**, publicada no Disco Virtual em 08/09/2026. Este é um exercício adicional, separado do Caderno de Prática 1.

## Classes propostas

| Classe | Estado | Mudanças de estado |
|---|---|---|
| `Aluno` | nome, matrícula, idade, ativo | `ativar()` define `ativo = true`; `desativar()` define `false` |
| `Plano` | nome, valor mensal, duração, disponível | altera preço somente com valor positivo; disponibiliza ou indisponibiliza o plano |
| `Pagamento` | código, valor, mês de referência, pago | `pagar()` define `pago = true`; `cancelarPagamento()` define `false` |

## Regras de correção destacadas pelo professor

- As três classes devem existir separadamente.
- Os atributos usam apenas `String`, `int`, `double` e `boolean`.
- Não criar atributos cujo tipo seja uma das outras classes.
- A classe `Principal` deve criar e testar um objeto de cada classe.
- `alterarValor()` deve recusar valores menores ou iguais a zero.

## Resultado esperado do teste

Inicialmente: aluno inativo, plano de R$ 99,90 e pagamento pendente. Depois dos métodos: aluno ativo, plano de R$ 109,90 e pagamento marcado como pago.
