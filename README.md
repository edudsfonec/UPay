Here's the English translation of the provided text:

# UPay
**Upay** is a RESTful API designed to manage financial transactions and provide real-time statistics. Developed as a challenge to practice and enhance back-end development skills, Upay focuses on building a robust and efficient solution for in-memory data manipulation.

---

## Highlighted Skills and Technologies:

* **Java and Spring Boot:** Building a scalable and maintainable web application using the Spring Boot ecosystem.
* **RESTful APIs:** Implementing endpoints (POST /transactions, DELETE /transactions, GET /statistics) following API design best practices.
* **In-Memory Data Management:** Storing and processing transactions in memory using **ConcurrentLinkedQueue** to ensure thread safety and high performance.
* **Data Validation:** Applying rigorous validations for input data and proper error handling (HTTP status codes 400 and 422).
* **Stream Processing:** Utilizing Java 8+ **Streams API** to efficiently and concisely filter, transform, and calculate statistics, including the use of **DoubleSummaryStatistics**.
* **Version Control:** Using **Git** and **GitHub** for code management and collaboration.

---

## API Overview:

Upay exposes the following endpoints:

* **POST /transactions:** Adds a new transaction.
* **DELETE /transactions:** Clears all stored transactions.
* **GET /statistics:** Returns aggregated statistics (sum, average, minimum, maximum, count) for transactions from the last 60 seconds.

This project demonstrates the ability to build efficient back-end solutions, adhering to specific requirements and optimizing real-time data processing.
