# SpringSecurityJwt

Este repositório contém uma implementação de autenticação **stateless** utilizando JWT (JSON Web Token) na stack Spring, juntamente com o módulo Spring Security. Inclui exemplos de rotas protegidas e públicas, além da configuração necessária para a autenticação via JWT.

## Descrição

A autenticação via JWT é amplamente utilizada em APIs RESTful para garantir que as operações realizadas pelos usuários autenticados sejam seguras. Neste exemplo, utilizamos o **Spring Security** para proteger rotas e gerenciar tokens JWT, permitindo que a autenticação e autorização sejam feitas de forma eficiente e sem o uso de sessões de usuário.

### Funcionalidades:
- Autenticação stateless utilizando JWT.
- Proteção de rotas com diferentes níveis de permissão (públicas, autenticadas, específicas para administradores).
- Exemplos de rotas de login, criação de usuários, e rotas protegidas para administradores e clientes.

## Exemplos de Rotas

- **Públicas**: 
  - `/users/login`: Rota para login e recuperação de token JWT.
  - `/users`: Rota pública para criação de novos usuários.

- **Protegidas**:
  - `/users/test`: Rota protegida que exige autenticação.
  - `/users/test/customer`: Rota acessível apenas para usuários com a permissão de "CUSTOMER".
  - `/users/test/administrator`: Rota acessível apenas para usuários com a permissão de "ADMINISTRATOR".

## Referência

Este código foi baseado no artigo [Protegendo sua API REST com Spring Security e Autenticando Usuários com Token JWT em uma Aplicação Stateless](https://medium.com/@felipeacelinoo/protegendo-sua-api-rest-com-spring-security-e-autenticando-usu%C3%A1rios-com-token-jwt-em-uma-aplica%C3%A7%C3%A3o-d70e5b0331f9) por Felipe Acelino.
