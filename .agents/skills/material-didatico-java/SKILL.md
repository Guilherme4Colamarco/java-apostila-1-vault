---
name: material-didatico-java
description: Cria e revisa materiais didáticos no Obsidian a partir da Apostila 1 de POO do professor Roberto, preservando o conteúdo-fonte e separando explicação, solução e melhorias.
---

# Material didático de Java a partir da Apostila 1

Use esta skill quando Guilherme pedir para ler, transcrever, explicar, revisar ou ampliar exercícios e código da Apostila 1 no vault `java-apostila-1-vault`.

## Fontes do vault

- Enunciados e conteúdo original: `05-Material-Original/Caderno_de_Atividades_POO_Roteiro_1.pdf` e `05-Material-Original/PooRoteiro1.pdf`.
- Implementação entregue pelo professor: `04-Codigo-Fonte/Atividades/src/atividades/`.
- Resoluções de estudo: `01-Resolucoes/`.
- Índice de entrada: `00 - Índice.md`.

Leia primeiro a fonte específica do pedido e confirme qual versão está sendo usada. Não confunda o caderno de atividades com o roteiro teórico, nem a implementação do professor com uma versão didática revisada.

## Procedimento

1. **Identifique o pedido e a fonte.** Se o usuário especificar commit, ramo, arquivo ou versão, use exatamente essa referência. Para esta tarefa, a base é o commit `b1d0871fde7d632c28e1e760d75d8ef273d93be7`.
2. **Leia a fonte integralmente.** Para PDF, extraia o texto página por página e confira a ordem; para código, abra a classe correspondente e `Principal.java`.
3. **Separe as camadas do conteúdo.** Use cabeçalhos claros para (a) trecho/enunciado fiel, (b) explicação, (c) solução original, (d) extensão didática ou correção proposta.
4. **Trace a execução.** Comece em `public static void main(String[] args)`, siga cada `new`, atribuição e chamada de método na ordem real. Registre o estado antes e depois de cada operação relevante.
5. **Explique a criação do objeto corretamente.** Verifique se há construtor declarado na classe. Na versão original desta apostila, as classes de exercício não declaram construtores; `new Tipo()` chama o construtor vazio implícito e os campos recebem valores padrão. Depois, `main` atribui os valores iniciais. Em `Pagamento`, considere também o inicializador `situacao = "Pendente"`.
6. **Conecte sintaxe e efeito.** Explique parâmetros, atributos, `this` se realmente aparecer no trecho, condicionais, operadores, retorno ou impressão. Não ensine `this`/construtor parametrizado como se estivessem no código-fonte original quando não estiverem.
7. **Aponte pegadinhas com contexto.** Distinga o comportamento pedido pelo enunciado do comportamento literal do código. Se houver limitação ou possível erro, mostre a condição, o caso de teste e o efeito; não altere a fonte silenciosamente.
8. **Faça a nota navegável.** Use nomes descritivos, links Obsidian para conceito, exercício e fonte, e atualize `00 - Índice.md`.
9. **Revise.** Confira fatos contra os arquivos originais, coerência dos rastros de estado, compilabilidade de qualquer código apresentado como executável e ausência de links quebrados.

## Esqueleto de uma página de explicação

```markdown
# [Tema do exercício]

> Fonte: [[...]] · arquivo de código: `...`

## Enunciado ou trecho original
<!-- preservar a fonte se o pedido for transcrição 1×1 -->

## O que o programa precisa representar

## Código original, por partes

## Fluxo chamado por `Principal.main`
1. `new ...`: criação e construtor real chamado.
2. Atribuições: estado inicial.
3. Métodos: regra executada e mudança de estado.
4. Impressão: evidência do resultado.

## Rastreamento do estado
| Momento | Chamada | Estado antes | Estado depois |
|---|---|---|---|

## Pegadinhas e observações da fonte

## Extensão didática (se solicitada)

## Links relacionados
```

## Limites

- Não substitua a apostila por um resumo quando for solicitada transcrição literal.
- Não atribua ao professor uma melhoria criada para ensino.
- Não altere os arquivos de código original para “consertar” a explicação; proponha uma versão separada e identifique a mudança.
- Não use frameworks, Maven ou Gradle. Para verificar o projeto existente, use o `build.xml` e tarefas Ant disponíveis, sem presumir que o ambiente tenha JDK instalado.
