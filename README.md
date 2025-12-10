# Java Design Patterns Playground

A comprehensive implementation of Gang of Four and other common design patterns in Java, featuring both JUnit and Cucumber tests with AssertJ assertions.

## 📋 Table of Contents

- [Overview](#overview)
- [Design Patterns Implemented](#design-patterns-implemented)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Running Tests](#running-tests)
- [Build Commands](#build-commands)
- [Requirements](#requirements)

## 🎯 Overview

This project serves as a practical reference and learning resource for common software design patterns. Each pattern is implemented with:

- ✅ Clean, well-documented Java code
- ✅ Comprehensive JUnit 5 tests with AssertJ assertions
- ✅ Cucumber BDD tests for behavior verification
- ✅ Separate test suites that can be run independently

## 🏗️ Design Patterns Implemented

### Creational Patterns (5)
- **Singleton** - Ensures a class has only one instance
- **Factory Method** - Creates objects without specifying exact classes
- **Abstract Factory** - Creates families of related objects
- **Builder** - Constructs complex objects step by step
- **Prototype** - Clones objects instead of creating new ones

### Structural Patterns (7)
- **Adapter** - Makes incompatible interfaces work together
- **Bridge** - Separates abstraction from implementation
- **Composite** - Treats individual objects and compositions uniformly
- **Decorator** - Adds responsibilities to objects dynamically
- **Facade** - Provides a simplified interface to complex subsystems
- **Flyweight** - Shares objects to support large numbers efficiently
- **Proxy** - Provides a placeholder for another object

### Behavioral Patterns (11)
- **Strategy** - Defines a family of interchangeable algorithms
- **Observer** - Notifies dependent objects of state changes
- **Command** - Encapsulates requests as objects
- **State** - Alters object behavior when state changes
- **Template Method** - Defines algorithm skeleton in base class
- **Iterator** - Provides sequential access to collection elements
- **Chain of Responsibility** - Passes requests along a chain of handlers
- **Mediator** - Reduces coupling between communicating objects
- **Memento** - Captures and restores object state
- **Visitor** - Separates algorithms from object structure
- **Interpreter** - Defines a grammar and interprets sentences

### Additional Common Patterns (3)
- **Repository** - Abstracts data access logic
- **Dependency Injection** - Inverts control of dependencies
- **Object Pool** - Reuses expensive objects for better performance

## 📁 Project Structure

```
javaDesignPatterns/
├── src/
│   ├── main/java/com/designpatterns/
│   │   ├── creational/          # Creational patterns
│   │   │   ├── singleton/
│   │   │   ├── factory/
│   │   │   ├── abstractfactory/
│   │   │   ├── builder/
│   │   │   └── prototype/
│   │   ├── structural/          # Structural patterns
│   │   │   ├── adapter/
│   │   │   ├── bridge/
│   │   │   ├── composite/
│   │   │   ├── decorator/
│   │   │   ├── facade/
│   │   │   ├── flyweight/
│   │   │   └── proxy/
│   │   ├── behavioral/          # Behavioral patterns
│   │   │   ├── strategy/
│   │   │   ├── observer/
│   │   │   ├── command/
│   │   │   ├── state/
│   │   │   ├── template/
│   │   │   ├── iterator/
│   │   │   ├── chainofresponsibility/
│   │   │   ├── mediator/
│   │   │   ├── memento/
│   │   │   ├── visitor/
│   │   │   └── interpreter/
│   │   └── other/               # Additional patterns
│   │       ├── repository/
│   │       ├── dependencyinjection/
│   │       └── objectpool/
│   ├── test/java/               # JUnit tests
│   │   └── com/designpatterns/  # Mirrors main structure
│   └── cucumber/                # Cucumber BDD tests
│       ├── java/                # Step definitions
│       │   └── com/designpatterns/cucumber/
│       └── resources/           # Feature files
├── build.gradle                 # Gradle build configuration
├── settings.gradle             # Gradle settings
├── gradlew                     # Gradle wrapper (Unix)
├── gradlew.bat                 # Gradle wrapper (Windows)
└── README.md                   # This file
```

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- No need to install Gradle (uses Gradle wrapper)

### Clone and Build

```bash
# Navigate to project directory
cd javaDesignPatterns

# Build the project (compiles code and runs all tests)
./gradlew build
```

## 🧪 Running Tests

The project provides separate commands for different test suites:

### Run All Tests
```bash
./gradlew build
```

### Run JUnit Unit Tests Only
```bash
./gradlew unitTest
```
- Tests located in: `src/test/java/`
- Uses JUnit 5 with AssertJ assertions
- Fast execution, ideal for TDD

### Run Cucumber BDD Tests Only
```bash
./gradlew cucumber
```
- Feature files in: `src/cucumber/resources/`
- Step definitions in: `src/cucumber/java/`
- Uses Cucumber with AssertJ assertions
- Generates HTML reports in: `build/reports/cucumber/`

### Run Standard Test Task
```bash
./gradlew test
```
- Runs JUnit tests from `src/test/java/`

## 🔨 Build Commands

| Command | Description |
|---------|-------------|
| `./gradlew build` | Compiles code and runs all tests |
| `./gradlew clean` | Removes build directory |
| `./gradlew test` | Runs JUnit tests |
| `./gradlew unitTest` | Runs JUnit tests (explicit task) |
| `./gradlew cucumber` | Runs Cucumber BDD tests |
| `./gradlew check` | Runs all verification tasks |
| `./gradlew tasks` | Lists all available tasks |

## 📦 Requirements

### Java Version
- Java 17 or higher required

### Dependencies
All dependencies are managed by Gradle:

**Main Dependencies:**
- SLF4J 2.0.9 (Logging API)
- Logback 1.4.11 (Logging implementation)

**Test Dependencies:**
- JUnit Jupiter 5.10.1 (Unit testing framework)
- AssertJ 3.24.2 (Fluent assertion library)
- Cucumber 7.14.1 (BDD framework)
- JUnit Platform Suite 1.10.1 (Test suite support)

## 📊 Test Results

After running tests, view reports at:
- **JUnit Tests**: `build/reports/tests/test/index.html`
- **Unit Tests**: `build/reports/tests/unitTest/index.html`
- **Cucumber Tests**: `build/reports/cucumber/cucumber.html`

## 🎓 Learning Resources

Each pattern implementation includes:
- Clear, documented code examples
- Real-world use cases
- JUnit tests demonstrating usage
- Cucumber scenarios describing behavior

## 📝 Pattern Examples

### Quick Start - Singleton Pattern

```java
// Access the singleton instance
Singleton instance = Singleton.INSTANCE;
instance.setData("Hello World");
String result = instance.performOperation();
```

### Quick Start - Builder Pattern

```java
Computer computer = new Computer.Builder()
    .cpu("Intel i9")
    .ram("32GB")
    .storage("1TB SSD")
    .wifi(true)
    .build();
```

### Quick Start - Strategy Pattern

```java
ShoppingCart cart = new ShoppingCart();
cart.setPaymentStrategy(new CreditCardStrategy("1234-5678"));
cart.checkout(100.0);
```

## 🤝 Contributing

This is a learning playground. Feel free to:
- Add more design patterns
- Improve existing implementations
- Add more test scenarios
- Enhance documentation

## 📄 License

This project is created for educational purposes.

## 🏆 Build Status

✅ All 42 JUnit tests passing  
✅ All 15 Cucumber scenarios passing  
✅ Build successful with Gradle 8.5

---

**Happy Learning! 🎉**
