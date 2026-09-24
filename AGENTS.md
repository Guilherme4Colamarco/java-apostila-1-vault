# Instruções para trabalhar neste vault

Este repositório é um vault do Obsidian para estudar Programação Orientada a Objetos com o material do professor Roberto. Use como base a versão simples do vault no commit `b1d0871fde7d632c28e1e760d75d8ef273d93be7` (um commit antes do `main` atual quando este material foi preparado).

## Fontes e fidelidade

1. O material em `05-Material-Original/` é a referência primária dos enunciados e conceitos.
2. O código em `04-Codigo-Fonte/Atividades/src/atividades/` é a referência do que foi efetivamente programado pelo professor.
3. As páginas em `01-Resolucoes/` são materiais didáticos e podem conter explicações ou melhorias; não as apresente como se fossem transcrição literal da apostila.
4. Quando Guilherme pedir conteúdo “1×1”, preserve a sequência e o texto legível da fonte. Marque apenas o que estiver ilegível ou incerto; não resuma nem complete lacunas por suposição.
5. Mantenha transcrição fiel, explicação didática e melhorias de código em seções separadas e identificadas.

## Regras para explicar o Java desta apostila

- O projeto usa Java no NetBeans com **Apache Ant**. Não troque por Maven ou Gradle.
- Explique o fluxo concreto de `Principal.main`: `new Tipo()` cria o objeto, as atribuições iniciais definem o estado, as chamadas de métodos mudam ou consultam esse estado e as impressões permitem acompanhar o resultado.
- Nas classes originais, não há construtores explícitos. Portanto, `new Livro()` e chamadas equivalentes usam o construtor sem argumentos implícito do Java. Não invente construtores parametrizados como se fizessem parte do código original.
- Se uma versão didática adicionar construtor, encapsulamento ou validação, rotule como **extensão didática** e preserve também a leitura do código original.
- Não corrija silenciosamente o comportamento da fonte. Registre problemas ou limites observados numa seção “Observações sobre o código original” e mantenha a lógica original identificável.
- Preserve nomes, tipos, ordem de execução e resultados da fonte. Não invente requisitos, saídas ou regras que não apareçam no enunciado ou código.

## Organização no Obsidian

- Use Markdown e links internos `[[...]]` para conectar conceitos, exercícios e código.
- Reaproveite as pastas existentes: `01-Resolucoes/`, `02-Conceitos/`, `03-Canvas/`, `04-Codigo-Fonte/` e `05-Material-Original/`.
- Atualize `00 - Índice.md` quando criar uma página de estudo nova.
- Explique cada trecho de código pelo papel que cumpre, pela relação com `main` e pelo efeito no estado do objeto.
- Escreva em português claro, com exemplos curtos e sem pressupor que o leitor já sabe sintaxe de Java.
