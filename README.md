# 🛒 Ecommerce API

API REST desenvolvida com Java e Spring Boot para gestão de catálogo de produtos, utilizando PostgreSQL via Docker para persistência.

##  Stack Técnica
- **Backend:** Java 17, Spring Boot 3, Spring Data JPA, Hibernate.
- **Banco de Dados:** PostgreSQL (Dockerizado).
- **Arquitetura:** Camadas (Controller, Service, Repository, Entity).
- **Testes:** Postman.

## Funcionalidades
- **CRUD Completo:** Create, Read, Update e Delete de produtos.
- **Associações:** Relacionamento Many-to-One entre Produtos e Categorias.
- **Tratamento de Erros:** Respostas padronizadas para recursos não encontrados (404).
- **Carga de Dados:** Classe de configuração para população automática do banco em ambiente de teste.

## Como Executar
1. **Infraestrutura:** `docker-compose up -d`
2. **Aplicação:** Execute a classe `EcommerceApiApplication.java` no Eclipse/STS.
3. **Acesso:** `http://localhost:8080/products`

## Endpoints (Postman)
| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| GET | `/products` | Lista todos os produtos |
| GET | `/products/{id}` | Busca produto por ID |
| POST | `/products` | Cadastra novo produto |
| PUT | `/products/{id}` | Atualiza produto existente |
| DELETE | `/products/{id}` | Remove produto do banco |
