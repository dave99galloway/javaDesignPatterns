# Design Patterns Quick Reference

## Creational Patterns

### Singleton

**When to use:** Need exactly one instance of a class  
**Example:** Configuration manager, logging service  
**Key benefit:** Controlled access to single instance

### Factory Method

**When to use:** Need to create objects without specifying exact class  
**Example:** Creating different payment processors  
**Key benefit:** Loose coupling between creator and products

### Abstract Factory

**When to use:** Need to create families of related objects  
**Example:** UI components for different platforms (Windows/Mac)  
**Key benefit:** Ensures related objects work together

### Builder

**When to use:** Construct complex objects step by step  
**Example:** Building computer configurations, HTTP requests  
**Key benefit:** Flexible object construction

### Prototype

**When to use:** Clone existing objects instead of creating new  
**Example:** Copying shapes in graphics editor  
**Key benefit:** Avoid expensive creation operations

## Structural Patterns

### Adapter

**When to use:** Make incompatible interfaces work together  
**Example:** Adapting third-party library to your interface  
**Key benefit:** Reuse existing code with different interfaces

### Bridge

**When to use:** Separate abstraction from implementation  
**Example:** Shape and color as independent hierarchies  
**Key benefit:** Extend abstraction and implementation independently

### Composite

**When to use:** Treat individual and composite objects uniformly  
**Example:** File system (files and directories)  
**Key benefit:** Simplify client code for tree structures

### Decorator

**When to use:** Add responsibilities to objects dynamically  
**Example:** Adding toppings to coffee, stream wrappers  
**Key benefit:** Flexible alternative to subclassing

### Facade

**When to use:** Provide simple interface to complex subsystem  
**Example:** Home theater system control  
**Key benefit:** Reduce system complexity

### Flyweight

**When to use:** Share objects to support large numbers efficiently  
**Example:** Character glyphs in text editor  
**Key benefit:** Reduce memory usage

### Proxy

**When to use:** Control access to another object  
**Example:** Lazy loading, access control, caching  
**Key benefit:** Add functionality without changing original object

## Behavioral Patterns

### Strategy

**When to use:** Select algorithm at runtime  
**Example:** Different payment methods, sorting algorithms  
**Key benefit:** Interchange algorithms independently

### Observer

**When to use:** Notify dependent objects of state changes  
**Example:** Event handling, MVC architecture  
**Key benefit:** Loose coupling between subjects and observers

### Command

**When to use:** Encapsulate requests as objects  
**Example:** Menu actions, undo/redo, macro recording  
**Key benefit:** Parameterize and queue operations

### State

**When to use:** Alter behavior when internal state changes  
**Example:** Vending machine, TCP connection  
**Key benefit:** Clean state-specific behavior

### Template Method

**When to use:** Define algorithm skeleton, defer steps to subclasses  
**Example:** Data parsing (CSV, JSON, XML)  
**Key benefit:** Reuse common algorithm structure

### Iterator

**When to use:** Provide sequential access to collection  
**Example:** Iterating over custom collections  
**Key benefit:** Uniform traversal interface

### Chain of Responsibility

**When to use:** Pass request along chain of handlers  
**Example:** Approval workflow, event bubbling  
**Key benefit:** Decouple senders and receivers

### Mediator

**When to use:** Reduce coupling between communicating objects  
**Example:** Chat room, air traffic control  
**Key benefit:** Centralize complex communications

### Memento

**When to use:** Save and restore object state  
**Example:** Undo/redo functionality, game saves  
**Key benefit:** Maintain encapsulation while saving state

### Visitor

**When to use:** Add operations to object structure without modification  
**Example:** Compiler AST operations, report generation  
**Key benefit:** Add new operations easily

### Interpreter

**When to use:** Define grammar and interpret sentences  
**Example:** Expression evaluation, query languages  
**Key benefit:** Implement simple languages

## Additional Patterns

### Repository

**When to use:** Abstract data access logic  
**Example:** User data access, product catalog  
**Key benefit:** Separate business logic from data storage

### Dependency Injection

**When to use:** Invert control of dependencies  
**Example:** Service wiring, testing with mocks  
**Key benefit:** Loose coupling and testability

### Object Pool

**When to use:** Reuse expensive objects  
**Example:** Database connections, thread pools  
**Key benefit:** Improve performance

## Testing Commands

```bash
# Run all tests
./gradlew build

# Run JUnit tests only
./gradlew unitTest

# Run Cucumber tests only
./gradlew cucumber

# Clean and rebuild
./gradlew clean build
```

## Pattern Selection Guide

**Need to create objects?** → Use Creational Patterns  
**Need to compose objects?** → Use Structural Patterns  
**Need to manage object behavior?** → Use Behavioral Patterns

**Common mistakes to avoid:**

- Don't use Singleton when you could use dependency injection
- Don't use patterns just because they exist
- Don't over-engineer simple solutions
- Do understand the problem before applying a pattern
