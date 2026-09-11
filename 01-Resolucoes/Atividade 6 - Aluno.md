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
