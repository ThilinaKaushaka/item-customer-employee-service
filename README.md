# 🚀 Item-Customer-Employee Microservice

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Microservices](https://img.shields.io/badge/Microservices-FF6C37?style=for-the-badge&logo=microservices&logoColor=white)

*A comprehensive microservice backend for managing items, customers, and employees*

[Features](#-features) • [Architecture](#-architecture) • [Getting Started](#-getting-started) • [API Documentation](#-api-documentation) • [Contributing](#-contributing)

</div>

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Architecture](#-architecture)
- [Tech Stack](#-tech-stack)
- [Getting Started](#-getting-started)
- [Configuration](#-configuration)
- [API Documentation](#-api-documentation)
- [Testing](#-testing)
- [Deployment](#-deployment)
- [Contributing](#-contributing)
- [License](#-license)

## 🌟 Overview

The Item-Customer-Employee Microservice is a modern, scalable backend solution built with microservices architecture principles. This service provides robust APIs for managing core business entities including items, customers, and employees with high performance and reliability.

### Why This Microservice?

- ⚡ **High Performance**: Optimized for handling thousands of concurrent requests
- 🔒 **Secure**: Built-in security features and authentication
- 📈 **Scalable**: Horizontally scalable architecture
- 🛠️ **Maintainable**: Clean code architecture with separation of concerns
- 📊 **Observable**: Comprehensive logging and monitoring capabilities

## ✨ Features

### 🏬 Item Management
- Create, read, update, and delete items
- Advanced search and filtering capabilities
- Bulk operations support
- Inventory tracking
- Category management

### 👥 Customer Management
- Customer profile management
- Customer history tracking
- Advanced search functionality
- Customer segmentation
- Activity logging

### 👨‍💼 Employee Management
- Employee profile management
- Role-based access control
- Department organization
- Performance tracking
- Attendance management

### 🔐 Security & Authentication
- JWT-based authentication
- Role-based authorization
- Secure password encryption
- API rate limiting
- CORS configuration

### 📊 Additional Features
- RESTful API design
- Comprehensive error handling
- Input validation
- Pagination support
- Audit logging
- Health check endpoints

## 🏗️ Architecture

```
┌─────────────────────────────────────────────────┐
│              API Gateway / Load Balancer         │
└────────────────┬────────────────────────────────┘
                 │
        ┌────────┴────────┐
        │                 │
┌───────▼─────────┐  ┌────▼──────────┐
│  Item Service   │  │Customer/Employee│
│                 │  │    Service      │
│  - Item CRUD    │  │  - Customer CRUD│
│  - Inventory    │  │  - Employee CRUD│
│  - Categories   │  │  - Relations    │
└────────┬────────┘  └────┬───────────┘
         │                │
    ┌────▼────────────────▼────┐
    │     Database Layer        │
    │   (PostgreSQL/MySQL)      │
    └───────────────────────────┘
```

### Service Components

- **Controllers**: Handle HTTP requests and responses
- **Services**: Business logic implementation
- **Repositories**: Data access layer
- **DTOs**: Data transfer objects
- **Entities**: Domain models
- **Config**: Application configuration
- **Security**: Authentication and authorization
- **Utils**: Helper utilities

## 🛠️ Tech Stack

| Category | Technology |
|----------|-----------|
| **Language** | Java 17+ |
| **Framework** | Spring Boot 3.x |
| **Build Tool** | Maven |
| **Database** | PostgreSQL / MySQL |
| **ORM** | Spring Data JPA / Hibernate |
| **Security** | Spring Security + JWT |
| **Documentation** | Swagger / OpenAPI 3.0 |
| **Testing** | JUnit 5, Mockito |
| **Logging** | SLF4J + Logback |
| **Validation** | Hibernate Validator |

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed:

- ☕ **Java**: JDK 17 or higher
- 📦 **Maven**: 3.8 or higher
- 🗄️ **Database**: PostgreSQL 13+ or MySQL 8+
- 🐳 **Docker** (optional): For containerized deployment

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/ThilinaKaushaka/item-customer-employee-service.git
   cd item-customer-employee-service
   ```

2. **Configure database**
   
   Update `src/main/resources/application.yml`:
   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/yourdb
       username: yourusername
       password: yourpassword
   ```

3. **Build the project**
   ```bash
   mvn clean install
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

5. **Access the application**
   - Application: `http://localhost:8080`
   - API Documentation: `http://localhost:8080/swagger-ui.html`
   - Health Check: `http://localhost:8080/actuator/health`

### Quick Start with Docker

```bash
# Build the Docker image
docker build -t item-customer-employee-service .

# Run the container
docker run -p 8080:8080 item-customer-employee-service
```

### Using Docker Compose

```bash
docker-compose up -d
```

## ⚙️ Configuration

### Application Configuration

Key configuration in `application.yml`:

```yaml
server:
  port: 8080
  servlet:
    context-path: /api/v1

spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/servicedb
    username: admin
    password: secret
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: false
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect

jwt:
  secret: your-secret-key
  expiration: 86400000

logging:
  level:
    root: INFO
    com.yourpackage: DEBUG
  file:
    name: logs/application.log
```

### Environment Variables

| Variable | Description | Default |
|----------|-------------|---------|
| `DB_HOST` | Database host | localhost |
| `DB_PORT` | Database port | 5432 |
| `DB_NAME` | Database name | servicedb |
| `DB_USER` | Database user | admin |
| `DB_PASS` | Database password | - |
| `JWT_SECRET` | JWT secret key | - |
| `SERVER_PORT` | Application port | 8080 |

## 📚 API Documentation

### Base URL
```
http://localhost:8080/api/v1
```

### Item Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/items` | Get all items (paginated) |
| `GET` | `/items/{id}` | Get item by ID |
| `POST` | `/items` | Create new item |
| `PUT` | `/items/{id}` | Update item |
| `DELETE` | `/items/{id}` | Delete item |
| `GET` | `/items/search` | Search items |

### Customer Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/customers` | Get all customers |
| `GET` | `/customers/{id}` | Get customer by ID |
| `POST` | `/customers` | Create new customer |
| `PUT` | `/customers/{id}` | Update customer |
| `DELETE` | `/customers/{id}` | Delete customer |

### Employee Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/employees` | Get all employees |
| `GET` | `/employees/{id}` | Get employee by ID |
| `POST` | `/employees` | Create new employee |
| `PUT` | `/employees/{id}` | Update employee |
| `DELETE` | `/employees/{id}` | Delete employee |

### Authentication Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/auth/login` | User login |
| `POST` | `/auth/register` | User registration |
| `POST` | `/auth/refresh` | Refresh token |

### Example Requests

#### Create Item
```bash
curl -X POST http://localhost:8080/api/v1/items \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer YOUR_JWT_TOKEN" \
  -d '{
    "name": "Laptop",
    "description": "High-performance laptop",
    "price": 1299.99,
    "quantity": 50
  }'
```

#### Get All Customers
```bash
curl -X GET http://localhost:8080/api/v1/customers?page=0&size=10 \
  -H "Authorization: Bearer YOUR_JWT_TOKEN"
```

For complete API documentation, visit: `http://localhost:8080/swagger-ui.html`

## 🧪 Testing

### Run All Tests
```bash
mvn test
```

### Run Specific Test Class
```bash
mvn test -Dtest=ItemServiceTest
```

### Generate Coverage Report
```bash
mvn clean test jacoco:report
```

### Test Structure
```
src/test/java/
├── unit/           # Unit tests
├── integration/    # Integration tests
└── e2e/           # End-to-end tests
```

## 🚢 Deployment

### Production Build

```bash
mvn clean package -DskipTests
```

The JAR file will be generated in the `target/` directory.

### Deployment Options

#### 1. Traditional Deployment
```bash
java -jar target/item-customer-employee-service-1.0.0.jar
```

#### 2. Docker Deployment
```bash
docker build -t your-registry/item-customer-employee-service:latest .
docker push your-registry/item-customer-employee-service:latest
```

#### 3. Kubernetes Deployment
```bash
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml
```

#### 4. Cloud Platforms
- AWS Elastic Beanstalk
- Google Cloud Run
- Azure App Service
- Heroku

### Health Checks

Monitor application health:
```bash
curl http://localhost:8080/actuator/health
```

## 📊 Monitoring & Logging

### Actuator Endpoints

- `/actuator/health` - Application health status
- `/actuator/metrics` - Application metrics
- `/actuator/info` - Application information
- `/actuator/loggers` - Logger configuration

### Log Levels

Configure logging in `application.yml`:
```yaml
logging:
  level:
    root: INFO
    com.yourpackage: DEBUG
  file:
    name: logs/application.log
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss} - %msg%n"
    file: "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"
```

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **Commit your changes**
   ```bash
   git commit -m 'Add some amazing feature'
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/amazing-feature
   ```
5. **Open a Pull Request**

### Code Style

- Follow Java naming conventions
- Write meaningful commit messages
- Add unit tests for new features
- Update documentation as needed
- Ensure all tests pass before submitting PR

### Development Guidelines

- Keep methods small and focused
- Use meaningful variable names
- Add JavaDoc comments for public methods
- Follow SOLID principles
- Write self-documenting code

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- **Thilina Kaushaka** - [GitHub](https://github.com/ThilinaKaushaka)

## 🙏 Acknowledgments

- Spring Boot team for the excellent framework
- Contributors and maintainers
- Open source community

## 📞 Support


---

<div align="center">

**⭐ If you find this project useful, please consider giving it a star! ⭐**

Made with ❤️ by [Thilina Kaushaka](https://github.com/ThilinaKaushaka)

</div>
