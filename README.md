# JWT Token Authentication using Spring and MySQL

A Spring-based project for generating and validating JSON Web Tokens (JWTs) using MySQL as the database.


## **Overview**

This project provides a secure authentication mechanism using JWT tokens to authenticate and authorize users in a web application. It leverages Spring Boot for the backend framework, MySQL for database management, and JWT (JSON Web Tokens) for token generation and validation.

## **Features**

* User registration and login functionality: Easily manage user access with secure registration and login processes.
* JWT token generation and validation: Implemented using the HS256 algorithm for secure communication.
* MySQL database integration: Used for storing user credentials and token information securely.
* Spring Security integration: Handles all authentication and authorization tasks.
* RESTful API: Exposes endpoints for token generation, validation, and user management.


## **Technologies Used**

* Spring Boot: 3.3.2
* MySQL: 8.0.33
* JWT: 0.9.1
* jaxb-api: 2.3.1
* ModelMapper: 3.1.1
* Spring Security: 5.3.2


## **Installation**

### **Prerequisites**

* Java: 17 or higher
* MySQL: 8.0.33 or higher
* Maven: 4.0.0 or higher

### **Steps to Install**

* Clone the repository:git clone https://github.com/nadeesamaraweera/SE10-JWT.git
* Create a MySQL database and update the `[application.properties]`file with the correct database credentials.
* Run the project:`mvn spring-boot:run`
* Test the API endpoints using a tool like Postman or cURL.


### **API Endpoints**

* #### **User Registration**

1. [ ] Endpoint: `POST /register`
2. [ ] Description: Register a new user
3. [ ] Request Body:`name,password,email,role`
4. [ ] Response: `201` Created with a JSON response containing the user ID


* #### **User Login**

1. [ ] Endpoint: `POST /login`
2. [ ] Description: Login an existing user
3. [ ] Request Body: `email,password`
4. [ ] Response: `200 OK `with a JSON response containing the JWT 


* #### **Token Validation**

1. [ ] Endpoint: `GET /validate`
2. [ ] Description: Validate a JWT token
3. [ ] Request Header: `Authorization` with the JWT token
4. [ ] Response: `200 OK` if the token is valid, 401 Unauthorized otherwise

* #### **Token Refresh**

1. [ ] Endpoint: `POST /refresh`
2. [ ] Description: Refresh an existing JWT token
3. [ ] Request Header: Authorization with the JWT token
4. [ ] Response: `200 OK` with a new JWT token


### **Postman Documentation**
https://documenter.getpostman.com/view/35385577/2sAXjGcu1z

### **Database Schema**

The project uses the following database schema:

~~~~~
CREATE TABLE users (
  uid UUID PRIMARY KEY AUTO_INCREMENT,
  email VARCHAR(50) NOT NULL,
  password VARCHAR(100) NOT NULL,
  name VARCHAR(100) NOT NULL,
  CompanyName VARCHAR(100) NOT NULL,
  role VARCHAR(100) NOT NULL
);
