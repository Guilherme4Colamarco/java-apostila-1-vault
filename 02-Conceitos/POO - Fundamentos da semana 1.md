# POO - Fundamentos da semana 1

## Ideias centrais

- **Classe:** molde ou descrição de um conceito, como `Livro`.
- **Objeto:** ocorrência concreta da classe, como `livro1`.
- **Identidade:** diferencia cada objeto, mesmo se os valores forem iguais.
- **Estado:** valores atuais dos atributos.
- **Comportamento:** ações que o objeto executa por meio de métodos.

## Método de modelagem

1. Identifique o conceito que importa para o problema.
2. Escolha apenas os atributos necessários para regras e decisões.
3. Coloque na classe os comportamentos que usam ou alteram seu próprio estado.
4. Defina regras antes de escrever o código: por exemplo, não permitir saque acima do saldo.

## Java mínimo

```java
class Livro {
    private String titulo; // estado

    void emprestar() {     // comportamento
        // altera ou consulta o estado
    }
}

Livro livro1 = new Livro(); // objeto
```

## Relação entre estado e comportamento

Uma operação pode mudar o estado (`cancelar`, `depositar`) e o estado pode limitar uma operação (`sacar` depende do saldo; `usar` depende de o ingresso ainda não ter sido usado).
