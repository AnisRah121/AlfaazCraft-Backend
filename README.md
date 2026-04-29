# ⚙️ AlfaazCraft Backend

AlfaazCraft Backend is a robust Spring Boot REST API that powers a modern poetry and shayari platform. It handles data persistence, business logic, and API endpoints for seamless interaction with the frontend.

---

## 🚀 Features

* 🔗 RESTful API architecture
* 📝 CRUD operations for posts
* 🗄️ PostgreSQL database integration
* ⚡ Spring Data JPA & Hibernate ORM
* 🧩 Layered architecture (Controller → Service → Repository)
* 🔄 Automatic table creation using Hibernate

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven

---

## 📂 Project Structure

```id="q8t2r1"
src/main/java/com/BlogApplication/
 ├── controller/
 ├── service/
 ├── repository/
 ├── model/
 └── BlogApplication.java
```

---

## ⚙️ Configuration

### 📌 application.properties

```properties id="c3j5kp"
spring.datasource.url=jdbc:postgresql://localhost:5432/alfaazcraft_db
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Run Locally

```bash id="0d9zpl"
mvn clean install
mvn spring-boot:run
```

---

## 🔗 API Endpoints (Example)

| Method | Endpoint        | Description     |
| ------ | --------------- | --------------- |
| GET    | /api/posts      | Get all posts   |
| GET    | /api/posts/{id} | Get post by ID  |
| POST   | /api/posts      | Create new post |
| PUT    | /api/posts/{id} | Update post     |
| DELETE | /api/posts/{id} | Delete post     |

---

## 🌐 Future Improvements

* 🔐 Authentication & Authorization (JWT)
* ❤️ Like & comment system
* 🔍 Search functionality
* 📊 Pagination & sorting

---

## 💡 About

AlfaazCraft is built to give words a voice — a platform where poetry meets technology.

---
