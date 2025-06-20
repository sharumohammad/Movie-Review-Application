# 🎬 Movie Review Application

This is a RESTful Movie Review Application built using **Java Spring Boot**, with **MySQL** as the database, **Maven** for dependency management, and **Lombok** to reduce boilerplate. It allows users to perform CRUD operations on movies and their reviews.

---

## 🚀 Features

- Add, view, update, and delete movie details
- Add and retrieve reviews for movies
- Rate movies using stars or feedback
- API tested using **Postman**
- Built-in validation and exception handling
- Hosted on **Apache Tomcat**

---

## 🛠️ Tech Stack

| Technology   | Purpose                             |
|--------------|-------------------------------------|
| Java         | Programming Language                |
| Spring Boot  | Backend Framework                   |
| Maven        | Build & Dependency Management       |
| Lombok       | Reduces boilerplate code            |
| MySQL        | Relational Database                 |
| Tomcat       | Embedded Server                     |
| Postman      | API Testing Tool                    |

---


---

## 📦 Installation & Setup

### ✅ Prerequisites
- Java 17+
- Maven
- MySQL Server
- Postman (optional for testing)

### 🔧 Steps to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/movie-review-app.git
   cd movie-review-app
   ----------------------------
----Set up MySQL Database---- 
CREATE DATABASE movie_review_db;
Update application.properties

PROPERTIES
----------

spring.datasource.url=jdbc:mysql://localhost:3306/movie_review_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

📬 API Endpoints

| Method | Endpoint     | Description     |
| ------ | ------------ | --------------- |
| GET    | /movies      | Get all movies  |
| GET    | /movies/{id} | Get movie by ID |
| POST   | /movies      | Add new movie   |
| PUT    | /movies/{id} | Update a movie  |
| DELETE | /movies/{id} | Delete a movie  |

⭐ Review APIs

| Method | Endpoint             | Description               |
| ------ | -------------------- | ------------------------- |
| POST   | /movies/{id}/reviews | Add a review to movie     |
| GET    | /movies/{id}/reviews | Get all reviews for movie |

🧪 Testing
You can import the provided Postman collection (if any) or manually test using:

POST /movies with JSON body

GET /movies for listing

POST /movies/{id}/reviews for adding reviews

📸 Sample JSON Request
{
  "title": "Inception",
  "description": "A mind-bending thriller",
  "releaseYear": 2010
}

{
  "reviewer": "John Doe",
  "comment": "Amazing visuals and concept!",
  "rating": 5
}

