# Ecommerce API

REST API for product catalog management built with **Java** and **Spring Boot**, using **PostgreSQL** with Docker for data persistence.

## Features

- Complete CRUD for products
- Product search by ID
- Product and category relationship
- Many-to-One association between products and categories
- Standardized error handling for missing resources
- Automatic database population for testing environments
- RESTful API structure

## Tech Stack

### Backend

- Java 17
- Spring Boot 3
- Spring Data JPA
- Hibernate

### Database

- PostgreSQL
- Docker
- Docker Compose

### Testing

- Postman

## Architecture

The project follows a layered architecture:

```text
Controller
   ↓
Service
   ↓
Repository
   ↓
Entity
   ↓
PostgreSQL
```

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/products` | List all products |
| GET | `/products/{id}` | Get a product by ID |
| POST | `/products` | Create a new product |
| PUT | `/products/{id}` | Update an existing product |
| DELETE | `/products/{id}` | Delete a product |

## How to Run

### 1. Start PostgreSQL with Docker

```bash
docker-compose up -d
```

### 2. Run the application

Start the Spring Boot application through your IDE or run the main application class:

```text
EcommerceApiApplication.java
```

### 3. Access the API

```text
http://localhost:8080/products
```

## Project Structure

```text
ecommerce-api/
├── src/
│   └── main/
│       └── java/
│           └── ...
│               ├── controller/
│               ├── service/
│               ├── repository/
│               └── entity/
├── docker-compose.yml
├── pom.xml
└── README.md
```

## Concepts Practiced

- REST API development
- Layered architecture
- Object-oriented programming
- JPA relationships
- Database persistence
- Exception handling
- Dockerized database environments

## Roadmap

- [ ] Add DTOs
- [ ] Add Bean Validation
- [ ] Add automated tests
- [ ] Add Swagger/OpenAPI documentation
- [ ] Add authentication and authorization
- [ ] Add pagination and filtering
- [ ] Deploy the application

Backend project developed to practice Java, Spring Boot, REST APIs, relational databases, and layered architecture.
