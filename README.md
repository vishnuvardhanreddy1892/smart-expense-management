# Smart Expense Management System

A full-stack web application for managing personal income, expenses, budgets, and financial reports.

## Features

- User registration
- User login
- JWT-based authentication
- Add, edit, and delete expenses
- Add, edit, and delete income
- Add, edit, and delete budgets
- Expense categories
- Dashboard with financial summaries
- Income vs Expenses chart
- Expenses by Category chart
- Financial reports
- Export expenses as CSV
- Backend and frontend validation
- MySQL database integration

## Technologies Used

### Frontend
- React.js
- Vite
- React Router
- Recharts
- JavaScript
- HTML
- CSS

### Backend
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Spring Security
- JWT
- Bean Validation
- Maven

### Database
- MySQL 8

## Project Structure

```text
smart-expense-management/
├── src/
│   └── main/
│       └── java/
│           └── com/expense/smartexpensemanagement/
│               ├── config/
│               ├── controller/
│               ├── entity/
│               ├── repository/
│               ├── security/
│               └── service/
├── pom.xml
├── test.http
└── README.md

smart-expense-frontend/
├── src/
│   ├── pages/
│   ├── App.jsx
│   ├── App.css
│   ├── index.css
│   └── main.jsx
├── package.json
└── vite.config.js