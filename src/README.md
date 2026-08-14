# Smart Queue Management System

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.2-brightgreen)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![Maven](https://img.shields.io/badge/Build-Maven-red)

Smart Queue is a RESTful backend application designed to manage customer queues for multiple services and counters. It allows users to join a service queue, receive an automatically generated token number, follow queue activity, and view their queue history.

The application follows a layered architecture with separate controller, service, repository, DTO, and entity layers.

## Key Features

- Register, update, retrieve, and delete users
- Create and manage available services
- Add counters and assign them to services
- Update counter availability or operational status
- Join a queue for a selected service
- Automatically generate the next queue number
- View active queues in ascending token order
- Update the status of a queue entry
- View a user's queue history
- Retrieve, read, and delete notifications
- Validate incoming requests
- Handle application errors through a global exception handler
- Allow cross-origin requests through CORS configuration

## Technologies

| Category | Technology |
| --- | --- |
| Language | Java 17 |
| Framework | Spring Boot 4.0.2 |
| API | Spring Web MVC / REST |
| Persistence | Spring Data JPA, Hibernate |
| Database | MySQL |
| Build tool | Maven |
| Object mapping | ModelMapper |
| Boilerplate reduction | Lombok |
| Validation | Jakarta Bean Validation |
| Testing | JUnit, Spring Boot Test |

## Architecture

```text
Client
  |
  v
Controller Layer
  |
  v
Service Layer
  |
  v
Repository Layer
  |
  v
MySQL Database
```

The DTO layer transfers request and response data without directly exposing persistence entities. A shared `APIResponse` model provides consistent responses for create, update, delete, and status-change operations.

## Main Domain Models

- **User** - stores customer or staff information and role details
- **Service** - represents a service for which customers can queue
- **Counter** - represents a service counter and its current status
- **Queue** - stores the user, service, token number, status, and creation time
- **Notification** - stores user notifications and read status

## Project Structure

```text
src
├── main
│   ├── java/com/ijse/smartqueue
│   │   ├── config
│   │   ├── controller
│   │   ├── dto
│   │   ├── entity
│   │   ├── exception
│   │   ├── repository
│   │   ├── service
│   │   │   └── custom/impl
│   │   ├── util
│   │   └── SmartQueueApplication.java
│   └── resources
│       └── application.properties
└── test
    └── java/com/ijse/smartqueue
```

## Prerequisites

Install the following software before running the project:

- Java Development Kit (JDK) 17
- MySQL Server
- Maven, or use the included Maven Wrapper
- IntelliJ IDEA, VS Code, or another Java IDE
- Postman or another API client for testing

## Getting Started

### 1. Clone the repository

```bash
git clone <your-repository-url>
cd Smart-queue_AAD-master/smart-queue
```

### 2. Configure MySQL

Update `src/main/resources/application.properties` with your local MySQL credentials:

```properties
spring.application.name=smart-queue

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/smartqueue?createDatabaseIfNotExist=true
spring.datasource.username=YOUR_MYSQL_USERNAME
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.generate-ddl=true
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
```

Do not commit real database passwords or other secrets to GitHub. Use environment variables for production deployments.

### 3. Run the application

On Windows:

```bash
mvnw.cmd spring-boot:run
```

On macOS or Linux:

```bash
./mvnw spring-boot:run
```

The API will be available at:

```text
http://localhost:8080
```

## API Endpoints

### Users

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/v1/user` | Register a user |
| PUT | `/api/v1/user` | Update a user |
| DELETE | `/api/v1/user/{id}` | Delete a user |
| GET | `/api/v1/user/{id}` | Get a user by ID |
| GET | `/api/v1/user` | Get all users |

### Services

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/v1/service` | Create a service |
| PUT | `/api/v1/service` | Update a service |
| DELETE | `/api/v1/service/{id}` | Delete a service |
| GET | `/api/v1/service/{id}` | Get a service by ID |
| GET | `/api/v1/service` | Get all services |

### Counters

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/v1/counter` | Create a counter |
| PATCH | `/api/v1/counter/{id}/status?status={status}` | Update counter status |
| GET | `/api/v1/counter/service/{serviceId}` | Get counters assigned to a service |
| GET | `/api/v1/counter` | Get all counters |

### Queues

| Method | Endpoint | Description |
| --- | --- | --- |
| POST | `/api/v1/queue/join?userId={userId}&serviceId={serviceId}` | Join a service queue |
| PATCH | `/api/v1/queue/{id}/status?status={status}` | Update queue status |
| GET | `/api/v1/queue/active/{serviceId}` | Get pending queue entries for a service |
| GET | `/api/v1/queue/user/{userId}` | Get a user's queue history |

New queue entries receive the next available number for the selected service and start with the `PENDING` status.

### Notifications

| Method | Endpoint | Description |
| --- | --- | --- |
| GET | `/api/v1/notification/user/{userId}` | Get notifications for a user |
| PATCH | `/api/v1/notification/{id}/read` | Mark a notification as read |
| DELETE | `/api/v1/notification/{id}` | Delete a notification |

New notifications use the `UNREAD` status.

## Example: Join a Queue

```http
POST /api/v1/queue/join?userId=1&serviceId=1
Host: localhost:8080
```

Example response structure:

```json
{
  "status": 201,
  "message": "Token Issued Successfully",
  "data": {
    "queueId": 1,
    "userId": 1,
    "serviceId": 1,
    "queueNumber": 1,
    "status": "PENDING",
    "createdTime": "2026-08-14T10:30:00"
  }
}
```

## Testing

Run the test suite with the Maven Wrapper:

```bash
./mvnw test
```

On Windows:

```bash
mvnw.cmd test
```

## Future Improvements

- Add Spring Security and JWT authentication
- Add role-based authorization for administrators, staff, and customers
- Add WebSocket updates for real-time queue changes
- Add estimated waiting-time calculations
- Add Swagger/OpenAPI documentation
- Add Docker support
- Add integration and service-layer tests
- Connect a web or mobile frontend

## Author

**Jayani Dissanayake**

- GitHub: [jayanidissanayake15](https://github.com/jayanidissanayake15)
- LinkedIn: [Jayani Dissanayake](https://www.linkedin.com/in/jayani-dissanayake-9b564a253)

## License

This project is intended for educational and academic use. Add a `LICENSE` file if you plan to distribute it under a specific open-source license.
