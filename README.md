## Table of Contents

- [What is the project?](#what-is-the-project)
- [What is the purpose of the project?](#what-is-the-purpose-of-the-project)
- [What is expected from this project?](#what-is-expected-from-this-project)
- [Development Progress](#development-progress)
    - [✅ Completed Features](#-completed-features)
    - [🛠️ Currently In Development](#️-currently-in-development)
    - [🔜 Next Steps](#-next-steps)
- [Conclusion](#conclusion)

---

## **What is the project?**

**EventHub** is a platform for managing and recommending events, built using modern technologies from the Java ecosystem. The application is designed to showcase advanced skills in **backend development**, **software architecture**, **data structures**, **asynchronous processing**, and **service integration**.

Unlike a simple CRUD system, EventHub stands out by implementing:

1. An **efficient search engine** using a **Trie (Prefix Tree)**.
2. A **recommendation system** based on **Graphs**, connecting users to relevant events.
3. A **modular architecture**, which can be expanded into microservices.
4. **Asynchronous processing** for notifications using **messaging systems (Kafka or RabbitMQ)**.
5. **Containerization and automated deployment** using **Docker and CI/CD**.

---

## **What is the purpose of the project?**

**EventHub** solves two main problems for users interested in events:

### 1 **Event Registration and Management**

- Users can **create, edit, view, and delete events**.
- Each event can be associated with categories such as "technology", "music", "business", etc.
- Events can be **efficiently indexed** for fast searches.

### 2 **Smart Recommendation and Search**

- Implements a **Trie (Prefix Tree)** to quickly search events by keyword.
- Uses **Graphs** to suggest events based on user interests and connections.
- Efficient algorithms to personalize recommendations.

### 3 **Notifications and Asynchronous Processing**

- Users can be notified when relevant events are available.
- Communication between services occurs via **Kafka**, making the system scalable and efficient.

### 4 **Modular and Scalable Architecture**

- Each feature is a **separate module**, and can later be converted into a microservice.
- The project can be **easily extended**, adding new features without impacting the core codebase.

---

## **What is expected from this project?**

EventHub is not intended to be a complete production-ready system, but rather a **highly technical proof of concept** that demonstrates the following skills:

### **Backend Skills with Java 17+**

- Use of **modern language features** (Records, Sealed Classes, Pattern Matching).
- Robust development with **Spring Boot**.

### **Use of Advanced Data Structures**

- Implementation of a **Trie** for efficient searches.
- Construction of a **Graph** to model relationships between users and events.
- Custom algorithms to optimize performance and scalability.

### **Software Architecture and Best Practices**

- Modular and well-structured code.
- Proper use of **layered architecture (Controller, Service, Repository)**.
- Application of **SOLID principles and Clean Code** practices.

### **Integration with Popular Technologies**

- **Spring Data JPA/MongoDB** for persistence.
- **Spring Security** for authentication.
- **Kafka/RabbitMQ** for asynchronous communication.
- **Docker** for containerization.

### **Professional Development Process**

- **Unit and integration tests** (JUnit, Mockito).
- **API documentation** (Swagger/OpenAPI).
- **CI/CD for automated deployments**.

---

## **Development Progress**

This section outlines the current development status of the **EventHub** project. It provides a clear view of what has already been implemented, what is currently being developed, and the next planned features.

### ✅ **Completed Features**

- ✅ **User Authentication and Authorization**  
  Implemented using **Spring Security** with JWT.

- ✅ **Event Creation and Management**  
  Basic CRUD operations for events, with category tagging.

- ✅ **Modular Project Structure**  
  Hexagonal architecture (Ports and Adapters) to ensure clean separation of concerns.

- ✅ **Containerized PostgreSQL Database**  
  Fully containerized using **Docker**, ready for local and cloud deployment.

---

### 🛠️ **Currently In Development**

- 🛠️ **Efficient Search Engine using Trie**  
  Implementing a custom **Trie** structure to index and search events by keyword.

- 🛠️ **Event Recommendations using Graphs**  
  Modeling relationships between users and events to build a graph-based recommendation system.

- 🛠️ **Swagger/OpenAPI Documentation**  
  Creating interactive API documentation for easier testing and developer onboarding.

---

### 🔜 **Next Steps**

- 🔜 **Asynchronous Notifications with Kafka**  
  Implementing a messaging system to notify users about new and relevant events.

- 🔜 **CI/CD Pipeline Setup**  
  Automating deployment processes using GitHub Actions or GitLab CI.

- 🔜 **Frontend Integration** *(Optional for POC)*  
  Optionally building a simple frontend or integrating with an existing UI to demonstrate full-stack functionality.

- 🔜 **Unit & Integration Tests**  
  Expanding test coverage using **JUnit** and **Mockito** for better code quality assurance.

---

## **Conclusion**

**EventHub** is more than just a portfolio project—it is a comprehensive demonstration of the **key skills required by the market**. It balances **modern architecture, advanced data structures, and development best practices**, making it an ideal project to highlight my capabilities as a Java developer.
