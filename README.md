## Overview

- This E-commerce application is a full-stack project developed using Spring Boot for the backend and Angular 10 for the frontend. It features OAuth2 authentication and integrates modern technologies to build a scalable web application.

## Features
- User Authentication: Secure login and registration using OAuth2.
- Product Management: Browse, search, and manage products.
- Shopping Cart: Add products to the cart and proceed to checkout.
- Order Processing: Manage orders and view order history.
- Responsive Design: Optimized for various devices.

## Technologies Used
- Backend: Spring Boot
- Frontend: Angular 10
- Authentication: OAuth2
- Database: MySQL
- Deployment: Render/Vercel

## Installation
- Prerequisites
- Node.js
- Angular CLI
- Java JDK
- MySQL

## Backend Setup

### 1. Clone the repository:
- git clone https://github.com/yourusername/ecommerce-app.git
### 2. Navigate to the backend directory:
- cd ecommerce-app/backend
### 3. Configure the database in application.properties:
- spring.datasource.url=jdbc:mysql://localhost:3306/your_database  
spring.datasource.username=your_username  
spring.datasource.password=your_password
### 4. Build and run the backend application:
- mvn spring-boot:run

## Frontend Setup

### 1. Navigate to the frontend directory:
- cd ecommerce-app/frontend
### 2. Install dependencies:
- npm install
### 3. Run the frontend application:
- ng serve
### 4. Open your browser and navigate to http://localhost:4200.




