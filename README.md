# SISTEMA-BIBLIOTECA-JAVA

Potencializando o Gerenciamento Inteligente de Bibliotecas.

![Licença](https://img.shields.io/badge/licença-MIT-blue.svg)
![Java](https://img.shields.io/badge/java-17%2B-orange.svg)

Feito com: **Java** e **Maven**.

<br>

## Índice

- [Visão Geral](#visão-geral)
- [Começando](#começando)
  - [Pré-requisitos](#pré-requisitos)
  - [Instalação](#instalação)
- [Uso](#uso)
- [Testes](#testes)

## Visão Geral

O sistema-biblioteca-java é um sistema de gerenciamento de bibliotecas baseado em Java que oferece uma abordagem estruturada para desenvolver aplicações de biblioteca. Ele fornece um conjunto de classes e funcionalidades projetadas para construir aplicações robustas, manuteníveis e escaláveis.

Este projeto enfatiza o desenvolvimento de sistemas de gerenciamento de bibliotecas com foco em modularidade e confiabilidade. Os recursos principais incluem:

-   **🏗️ Arquitetura Modular:** Utiliza classes bem definidas como `Livro`, `Usuario`, `Emprestimo`, e `Biblioteca` para garantir um design de código limpo e de fácil manutenção.
-   **🛠️ Consistência de Build:** Um arquivo `pom.xml` abrangente gerencia as dependências e as configurações de build, garantindo um fluxo de trabalho de desenvolvimento consistente.
-   **🧪 Testes Integrados:** Inclui testes unitários fundamentais para garantir que as funcionalidades principais funcionem como esperado.
-   **🧑‍💻 Interface Amigável:** Fornece uma interface de menu via console para gerenciar livros, usuários e empréstimos, melhorando a usabilidade.
-   **📚 Gerenciamento de Recursos:** Rastreia de forma eficiente o inventário, os empréstimos e os dados dos usuários dentro de um sistema coeso.

## Começando

Este projeto requer as seguintes dependências:

### Pré-requisitos

-   Linguagem de Programação: **Java** (versão 17 ou superior)
-   Gerenciador de Pacotes: **Maven**

### Instalação

1.  Clone o repositório (substitua `seu-usuario` pelo seu nome de usuário no GitHub):
    ```sh
    git clone [https://github.com/seu-usuario/sistema-biblioteca-java.git](https://github.com/seu-usuario/sistema-biblioteca-java.git)
    ```
2.  Navegue até o diretório do projeto:
    ```sh
    cd sistema-biblioteca-java
    ```
3.  Instale as dependências usando o Maven:
    ```sh
    mvn install
    ```

## Uso

O projeto é executado através da sua classe principal (`App.java`):

```sh
mvn exec:java