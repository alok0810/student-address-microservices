# Student Address Microservices 🚀

A complete microservices ecosystem for managing student information and addresses built with Spring Boot.

## 📋 Project Overview

This project demonstrates a microservices architecture for student management system with separate services for student data, address information, service discovery, and API gateway.

## 🏗️ Architecture

    Client[Client] --> Gateway[API Gateway]
    Gateway --> Student[Student Service]
    Gateway --> Address[Address Service]
    Student --> Eureka[Eureka Server]
    Address --> Eureka
    Student --> DB1[(Student DB)]
    Address --> DB2[(Address DB)]
