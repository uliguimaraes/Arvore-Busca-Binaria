# Árvore Binária de Busca

Implementação de uma **Árvore Binária de Busca (ABB)** em Java, feita como trabalho da disciplina de Estrutura de Dados no curso de Análise e Desenvolvimento de Sistemas (ULBRA - Campus Torres).

## Sobre o projeto

Uma árvore binária de busca é uma estrutura de dados em que cada nó tem no máximo dois filhos, e a ordem dos valores segue sempre a mesma regra:

- tudo que está na subárvore da **esquerda** é menor que o valor do nó;
- tudo que está na subárvore da **direita** é maior que o valor do nó.

Essa organização deixa a busca, a inserção e a remoção bem mais rápidas do que numa lista comum, já que a cada comparação dá pra descartar metade da árvore (quando ela está balanceada).

## Funcionalidades

- Inserir um valor
- Buscar um valor
- Remover um valor (folha, nó com um filho e nó com dois filhos)
- Percurso em ordem (*in-order*): mostra os valores em ordem crescente
- Percurso em pré-ordem (*pre-order*)
- Percurso em pós-ordem (*post-order*)
- Encontrar o menor e o maior valor
- Calcular a altura da árvore

<!-- ajustar: apague o que não foi implementado e inclua o que faltou -->

## Complexidade

| Operação | Caso médio (árvore balanceada) | Pior caso (árvore degenerada) |
|----------|-------------------------------|-------------------------------|
| Inserção | O(log n)                      | O(n)                          |
| Busca    | O(log n)                      | O(n)                          |
| Remoção  | O(log n)                      | O(n)                          |
| Percursos| O(n)                          | O(n)                          |

O pior caso acontece quando os valores são inseridos já em ordem (por exemplo 1, 2, 3, 4, 5), porque a árvore vira praticamente uma lista encadeada.

## Estrutura do projeto

```
Arvore-Busca-Binaria/
├── No.java                  # Representa um nó (valor, filho esquerdo, filho direito)
├── ArvoreBinariaBusca.java  # Operações da árvore
├── Main.java                # Programa de teste / menu
└── README.md
```

<!-- ajustar: conferir os nomes reais dos arquivos -->

## Como executar

Pré-requisito: ter o **JDK 17 ou superior** instalado.

```bash
# clonar o repositório
git clone https://github.com/uliguimaraes/Arvore-Busca-Binaria.git
cd Arvore-Busca-Binaria

# compilar
javac *.java

# executar
java Main
```

Também dá pra abrir a pasta direto no IntelliJ IDEA, Eclipse ou VS Code e rodar a classe `Main`.

## Exemplo de uso

Inserindo os valores `50, 30, 70, 20, 40, 60, 80`, a árvore fica assim:

```
        50
       /  \
     30    70
    /  \   /  \
  20   40 60   80
```

Resultado dos percursos:

| Percurso  | Saída                    |
|-----------|--------------------------|
| Em
