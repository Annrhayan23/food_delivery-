

# 🍔 Online Food Ordering Backend

A **production-ready RESTful backend** for an **Online Food Ordering System**, built using **Java 17, Spring Boot**, and **MySQL**.
This project demonstrates **secure authentication**, **role-based authorization**, and **transaction-safe order processing**, following real-world backend best practices.

---

## 🚀 Features

* **JWT Authentication**

  * Secure user registration & login
  * Stateless token-based authentication

* **Role-Based Access Control (RBAC)**

  * `CUSTOMER`
  * `RESTAURANT_OWNER`
  * `ADMIN`

* **Restaurant & Menu Management**

  * Create and manage restaurants
  * Add and manage menu items
  * Fetch restaurants with complete menus

* **Order Management**

  * Transactional order placement
  * Automatic total price calculation
  * Order status tracking
  * Order history per user

* **Robust Backend Architecture**

  * Global exception handling
  * Clean layered architecture (Controller → Service → Repository)
  * Proper entity relationships using JPA

---

## 🛠 Tech Stack

* **Java 17**
* **Spring Boot 3.2.2**
* **Spring Security**
* **Spring Data JPA (Hibernate)**
* **JWT (JJWT)**
* **MySQL**
* **Lombok**
* **Maven**

---

## 🏗 Project Structure

```
src/main/java/com/foodordering/
├── controller/      # REST API controllers
├── service/         # Business logic
├── repository/      # JPA repositories
├── entity/          # Database entities
├── security/        # JWT & security configuration
├── dto/             # Request & response DTOs
├── exception/       # Global exception handling
└── FoodOrderingApplication.java
```

---

## ⚙️ Getting Started

### Prerequisites

* **JDK 17**
* **MySQL Server**
* **Maven**

---

### Database Setup

Create the database:

```sql
CREATE DATABASE food_ordering_db;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/food_ordering_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

### Run the Application

```bash
mvn clean install
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

## 📚 API Endpoints

### 🔐 Authentication

| Method | Endpoint                    | Description         |
| ------ | --------------------------- | ------------------- |
| POST   | `/api/v1/auth/register`     | Register a new user |
| POST   | `/api/v1/auth/authenticate` | Login & receive JWT |

---

### 🏪 Restaurants

| Method | Endpoint                    | Access |
| ------ | --------------------------- | ------ |
| GET    | `/api/v1/restaurants`       | Public |
| GET    | `/api/v1/restaurants/{id}`  | Public |
| POST   | `/api/v1/restaurants/admin` | ADMIN  |

---

### 🛒 Orders

| Method | Endpoint              | Access             |
| ------ | --------------------- | ------------------ |
| POST   | `/api/v1/orders`      | Authenticated User |
| GET    | `/api/v1/orders`      | Authenticated User |
| GET    | `/api/v1/orders/{id}` | Authenticated User |

---

## 🔐 Security Highlights

* JWT validation on every request
* Role-restricted endpoints
* BCrypt password encryption
* Stateless session management

---

## 🧩 Database Design

* **User → Orders** (One-to-Many)
* **Restaurant → Menu Items** (One-to-Many)
* **Order → Menu Items** (Many-to-One)
* Referential integrity enforced via JPA

---

## 🎯 Design Highlights

* **Scalable architecture**
* **Transaction-safe order placement**
* **Clean REST API design**
* **Industry-standard security practices**

---

## 📌 Future Enhancements

* Swagger / OpenAPI documentation
* Order status lifecycle (PLACED → PREPARING → DELIVERED)
* Payment gateway integration
* Docker & CI/CD pipeline
* Admin analytics dashboard



Built using **Spring Boot** and **enterprise-grade backend practices**.

