JWT Token Authentication using Spring and MySQL
A Spring-based project for generating and validating JSON Web Tokens (JWTs) using MySQL as the database.

Overview
This project provides a secure authentication mechanism using JWT tokens to authenticate and authorize users in a web application. It leverages Spring Boot for the backend framework, MySQL for database management, and JWT (JSON Web Tokens) for token generation and validation.

Features
User registration and login functionality: Easily manage user access with secure registration and login processes.
JWT token generation and validation: Implemented using the HS256 algorithm for secure communication.
MySQL database integration: Used for storing user credentials and token information securely.
Spring Security integration: Handles all authentication and authorization tasks.
RESTful API: Exposes endpoints for token generation, validation, and user management.
Technologies Used
Spring Boot: 3.3.2
MySQL: 8.0.33
JWT: 0.9.1
jaxb-api: 2.3.1
ModelMapper: 3.1.1
Spring Security: 5.3.2
Installation
Prerequisites
Java: 17 or higher
MySQL: 8.0.33 or higher
Maven: 4.0.0 or higher
Steps to Install
Clone the repository:
bash
Copy code
git clone https://github.com/YourUsername/YourRepository.git
Create a MySQL database and update the application.properties file with the correct database credentials.
Run the project:
bash
Copy code
mvn spring-boot:run
Test the API endpoints using a tool like Postman or cURL.
API Endpoints
User Registration
Endpoint: POST /register
Description: Register a new user
Request Body:
json
Copy code
{
  "name": "John Doe",
  "password": "your_password",
  "email": "john.doe@example.com"
}
Response: 201 Created with a JSON response containing the user ID
User Login
Endpoint: POST /login
Description: Login an existing user
Request Body:
json
Copy code
{
  "email": "john.doe@example.com",
  "password": "your_password"
}
Response: 200 OK with a JSON response containing the JWT token
Token Validation
Endpoint: GET /validate
Description: Validate a JWT token
Request Header: Authorization with the JWT token
Response: 200 OK if the token is valid, 401 Unauthorized otherwise
Token Refresh
Endpoint: POST /refresh
Description: Refresh an existing JWT token
Request Header: Authorization with the JWT token
Response: 200 OK with a new JWT token
Postman Documentation
Database Schema
The project uses the following database schema:

sql
Copy code
CREATE TABLE users (
  uid UUID PRIMARY KEY AUTO_INCREMENT,
  email VARCHAR(50) NOT NULL,
  password VARCHAR(100) NOT NULL,
  name VARCHAR(100) NOT NULL,
  CompanyName VARCHAR(100) NOT NULL,
  role VARCHAR(100) NOT NULL
);
