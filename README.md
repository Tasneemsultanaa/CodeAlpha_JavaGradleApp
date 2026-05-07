# CodeAlpha Java Gradle App

A simple Task Manager application built with Java and Gradle, featuring CI/CD pipeline using GitHub Actions.

## Features
- Add tasks
- View all tasks
- Automated build and testing with Gradle
- CI/CD pipeline with GitHub Actions

## Technologies Used
- Java 21
- Gradle 8.7
- JUnit 5 (Testing)
- GitHub Actions (CI/CD)

## How to Run
1. Clone the repository
2. Run the app:
   gradle run
3. Run tests:
   gradle test

## Project Structure
- src/main/java/com/codealpha/Main.java - Entry point
- src/main/java/com/codealpha/TaskManager.java - App logic
- src/test/java/com/codealpha/TaskManagerTest.java - Unit tests

## CI/CD Pipeline
Every push to main branch automatically:
- Builds the project
- Runs all tests
- Reports success or failure
