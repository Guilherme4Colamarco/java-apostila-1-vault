# Atividade 6 - Aluno

[[00 - Índice|← Índice]]

> Fonte oficial: `Atividades.zip` - classe `atividades.Aluno`.

```java
public class Aluno {
    private String nome, matricula, situacao;
    public Aluno(String nome, String matricula, String situacao) {
        this.nome = nome; this.matricula = matricula; this.situacao = situacao;
    }
    public void alterarSituacao(String novaSituacao) { situacao = novaSituacao; }
    public void exibirDados() {
        System.out.printf("%s | matrícula: %s | %s%n", nome, matricula, situacao);
    }
}
```

**Atributos relevantes:** nome, matrícula e situação acadêmica. Exemplo: `new Aluno("João", "2026001", "Ativo")`.

**Informações deliberadamente fora da classe:** cor dos olhos e comida favorita. Elas não participam do cadastro nem de regras acadêmicas deste cenário.


## Leitura do código: por que ele funciona

- O construtor recebe os três dados que definem o cadastro: nome, matrícula e situação.
- `alterarSituacao(novaSituacao)` recebe o novo estado por parâmetro e o grava no atributo do objeto. Não é necessário criar outro aluno.
- A escolha de não incluir atributos irrelevantes mostra modelagem: classe guarda o que o problema precisa, não toda curiosidade possível sobre uma pessoa.
- `exibirDados()` é a evidência visual de que a mudança ocorreu.

**Rastro no `main`:** criar aluno ativo → exibir → alterar para trancado/inativo → exibir. [[02-Conceitos/Fluxo main, construtor e objeto|Como `main` chama o construtor]]
