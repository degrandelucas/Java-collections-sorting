# Projeto de Estudo - Trabalhando com Listas e Coleções em Java

Este projeto tem como objetivo explorar o uso de coleções em Java, como `ArrayList` e `LinkedList`, além de demonstrar a utilização de interfaces como `Comparable` e `Comparator` para ordenar objetos. O foco é apresentar as funcionalidades dessas classes e como manipular dados de forma eficiente em diferentes cenários.

---

## Funcionalidades Principais

1. **Ordenação de Números Inteiros:**
    - Utiliza a classe `ArrayList` para armazenar números inteiros e ordená-los com o método `Collections.sort()`.

2. **Ordenação de Objetos Personalizados (`Titulo`):**
    - Demonstra o uso da interface `Comparable` para ordenar objetos por um atributo específico (`nome`).
    - Aplica a interface `Comparator` para ordenar os mesmos objetos por outro atributo (`tipoConteudo`).

3. **Comparação entre `ArrayList` e `LinkedList`:**
    - Mostra exemplos de como criar e manipular listas utilizando as classes `ArrayList` e `LinkedList`.

4. **Polimorfismo com Listas:**
    - Demonstra como usar o polimorfismo ao trabalhar com listas, permitindo que tanto `ArrayList` quanto `LinkedList` sejam tratados de forma uniforme.

---

## Estrutura do Projeto

### Pacotes

- **`list.collections.application`**
    - Contém a classe principal `App`, responsável por executar os exemplos.

- **`list.collections.model`**
    - Contém a classe de domínio `Titulo`, que representa itens com um nome e um tipo de conteúdo (livro, filme ou série).

---

### Classes

- **`App`**
    - Classe principal do projeto, responsável por:
        - Demonstrar a criação e ordenação de listas de números inteiros.
        - Implementar a ordenação de objetos da classe `Titulo` utilizando `Comparable` e `Comparator`.
        - Comparar o uso de `ArrayList` e `LinkedList` em diferentes cenários.

- **`Titulo`**
    - Representa um item com os seguintes atributos:
        - `nome` (String): Nome do título.
        - `tipoConteudo` (String): Tipo do conteúdo (livro, filme ou série).
    - Implementa a interface `Comparable` para permitir ordenação natural pelo atributo `nome`.
    - Inclui uma sobrescrita do método `toString()` para exibir as informações do objeto.

---

## Como Executar o Projeto

1. Clone este repositório: *https://github.com/seuusuario/list-collections-demo.git*

2. Configure o ambiente Java:
    - Certifique-se de ter o **Java 8 ou superior** instalado.

3. Compile os arquivos:
    - Compile as classes localizadas nos pacotes:
        - `list.collections.application`
        - `list.collections.model`

4. Execute a aplicação:
    - Execute a classe `App` para visualizar os exemplos e os resultados no console.

---

## Tecnologias Utilizadas

- **Java 8 ou superior:** Linguagem utilizada para o desenvolvimento.
- **Coleções Java:** `ArrayList`, `LinkedList`, `Comparable`, `Comparator`.
- **Paradigma Orientado a Objetos:** Aplicado na modelagem da classe `Titulo`.

---

## Autor

Lucas Degrande