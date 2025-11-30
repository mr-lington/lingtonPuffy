# lingtonPuffy
**Java Spring Boot Web Application – Containerized & Deployment-Ready**

`lingtonPuffy` is a Java Spring Boot web application built to practise real-world DevOps workflows:  
building, packaging, containerizing and preparing an application for deployment to the cloud (AWS, Docker,
Kubernetes, etc.).

The project uses a standard Maven structure, includes UI/frontend updates, and ships with a Dockerfile so it
can be built and run as a lightweight container.


## Project Goals

- Practise building a Java + Spring Boot application that follows production-style structure  
- Learn how to package the app with Maven using the Maven wrapper  
- Containerize the app with Docker using a custom Dockerfile  
- Prepare the project to be plugged into a CI/CD pipeline (Jenkins, GitHub Actions, Argo CD)  
- Use the app as a deployment target for AWS EC2 / ECS / EKS experiments

## Tech Stack

- **Language:** Java  
- **Framework:** Spring Boot  
- **Build Tool:** Maven (with `mvnw` / Maven Wrapper)  
- **Containerization:** Docker  
- **Version Control:** Git & GitHub  



## Repository Structure (High Level)

- `.mvn/wrapper/` – Maven wrapper files for reproducible builds  
- `src/` – Application source code & frontend/UI  
- `pom.xml` – Maven project configuration  
- `Dockerfile` – Instructions to build a Docker image  
- `mvnw`, `mvnw.cmd` – Maven wrapper scripts for Linux/Windows  



## Running the Application Locally

### Prerequisites

- Java (11+ recommended)  
- Git  
- Docker (optional, if you want to run it as a container)

### 1. Clone the repository

```bash
git clone https://github.com/mr-lington/lingtonPuffy.git
cd lingtonPuffy
```

### 2. Build source code into artifact with maven
```bash
mvn clean package
```
### 3. Run the packaged JAR file
```bash
java -jar target/demoApp.jar
```
### Visit the application at:
http://localhost:8080

## Running the Application with Docker
### 1. Build the Docker image
```bash
docker build -t lingtonpuffy-app .
```
### 2. Run the container
```bash
docker run -p 8080:8080 lingtonpuffy-app
```
### Access the application at:
http://localhost:8080
