# Project Tracker

A simple CRUD (Create, Read, Update, Delete) web application for managing projects, built with Spring Boot and Thymeleaf.

## Features
- **List Projects**: View all projects with their status and simple details.
- **Create Project**: Add new projects with validation (Name, Description, Status required).
- **Edit Project**: Update existing project details.
- **Delete Project**: Remove projects from the system.
- **View Details**: See full details of a specific project.
- **Search/Filter**: (Planned/Future)

## Tech Stack
- **Java 17+**: Core programming language.
- **Spring Boot**: Framework for rapid application development.
- **Spring MVC**: Model-View-Controller architecture.
- **Spring Data JPA**: Abstraction for data access.
- **Thymeleaf**: Server-side Java template engine.
- **H2 Database**: In-memory database for development/testing.
- **Maven**: Build automation tool.

## Getting Started

### Prerequisites
- Java 17 or higher installed.

### Running the Application
1. Clone the repository.
2. Open a terminal in the project root.
3. Run the application using the Maven wrapper:
   ```sh
   ./mvnw spring-boot:run
   ```
   *Note: On the first run, this may take a moment to download dependencies.*

4. Access the application in your browser at:
   [http://localhost:8080/projects](http://localhost:8080/projects)

### H2 Console
To access the database directly:
1. Go to [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
2. **JDBC URL**: `jdbc:h2:mem:testdb`
3. **User Name**: `sa`
4. **Password**: (blank)
5. Click **Connect**.

## Project Structure
- `src/main/java`: Backend source code (Controller, Service, Repository, Entity).
- `src/main/resources/templates`: Thymeleaf HTML templates.
- `src/main/resources/static`: Static assets (CSS, JS).