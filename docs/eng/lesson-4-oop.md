# Object-oriented programming (OOP)

<!--toc:start-->

- [Object-oriented programming (OOP)](#object-oriented-programming-oop)
  - [Objects and Classes](#objects-and-classes)
    - [Objects](#objects)
    - [Classes](#classes)
    - [Instance](#instance)
    - [Attribute](#attribute)
    - [Method](#method)
    - [Constructor](#constructor)
  - [Four principles](#four-principles)
    - [Encapsulation](#encapsulation)
    - [Inheritance](#inheritance)
    - [Polymorphism](#polymorphism)
    - [Abstraction](#abstraction)
  - [Why to use OOP?](#why-to-use-oop)

<!--toc:end-->

Object-Oriented Programming (OOP) is a programming paradigm that organizes code into objects, which are instances of classes. It's a way of designing and structuring code to promote modularity, reusability, and maintainability. Let's break down the key concepts of OOP in the easiest way:

## Objects and Classes

### Objects

- **Definition:** Objects are instances of classes. They represent real-world entities and encapsulate both data (attributes) and behavior (methods).
- **Example:** If "Car" is a class, an object would be a specific car instance with its unique characteristics (color, model, etc.) and behaviors (drive, brake).

### Classes

- **Definition:** Classes are blueprints or templates for creating objects. They define the attributes and methods that objects will have.
- **Example:** "Car" is a class that defines what attributes (color, model) and methods (drive, brake) an actual car object will have. We can create a Toyota car or a Mazda car using that blueprint "Car"

### Instance

- **Definition:** An instance is a specific occurrence of an object created from a class.
- **Example:** If "Dog" is a class, an instance could be an actual dog named "Buddy."

### Attribute

- **Definition:** An attribute is a property or characteristic of an object. It represents the state of an object.
- **Example:** In a "Person" class, "age" could be an attribute.

### Method

- **Definition:** A method is a function or behavior associated with an object. It defines the actions an object can perform.
- **Example:** In a "Car" class, `startEngine()` could be a method that initiates the car's engine.

### Constructor

- **Definition:** A constructor is a special method in a class that is called when an object is instantiated. It initializes the object's attributes.
- **Example:** In Java, it is the methods that have same name as Class name and also return nothing.

See [Car](/src/main/java/oop/objects_and_classes/Car.java)

## Four principles

### Encapsulation

- **Definition:** Encapsulation is the bundling of data (attributes) and the methods that operate on the data within a single unit (class).
- **Example:** A "BankAccount" class encapsulates account balance as an attribute and methods like `deposit()` and `withdraw()`.

Object-Oriented Programming provides a way to model and organize code that closely mirrors real-world entities and their interactions, making it easier to design, understand, and maintain software systems.

- **Example:** A "Person" class encapsulates data (name, age) and methods (eat, sleep) related to a person.

See [Person.java](/src/main/java/oop/encapsulation/Person.java)

### Inheritance

- **Definition:** Inheritance allows a class (subclass/derived class) to inherit properties and methods from another class (superclass/base class).
- **Example:** "Car" class may inherit common properties and methods from a more general "Vehicle" class.

See:

- [Animal.java](/src/main/java/oop/inheritance/Animal.java)
- [Dog.java](/src/main/java/oop/inheritance/Dog.java)

### Polymorphism

- **Definition:** Polymorphism allows objects of different types to be treated as objects of a common type. It enables flexibility in using different classes interchangeably.
- **Example:** Both a "Circle" and a "Rectangle" class might have a method called "area," allowing you to call `shape.area()` regardless of the specific shape.

See:

- [Circle.java](/src/main/java/oop/polymorphism/Circle.java)
- [Rectangle.java](/src/main/java/oop/polymorphism/Rectangle.java)
- [Shape.java](/src/main/java/oop/polymorphism/Shape.java)

### Abstraction

- **Definition:** Abstraction involves simplifying complex systems by modeling classes based on essential properties and behaviors while hiding unnecessary details.
- **Example:** A "DatabaseConnection" class abstracts the complexity of interacting with a database, providing methods like `connect()` and `query()`.

See:

- [DatabaseConnection.java](/src/main/java/oop/abstraction/DatabaseConnection.java)
- [MySqlConnection.java](/src/main/java/oop/abstraction/MySqlConnection.java)

## Why to use OOP?

Object-oriented programming (OOP) provides a modular and organized approach to software development by encapsulating data and behavior into objects. This fosters code reuse, making it more efficient to design and maintain complex systems. OOP enhances code readability and scalability, enabling easier collaboration among developers. By emphasizing concepts like inheritance and polymorphism, OOP promotes abstraction and encapsulation, contributing to the creation of robust and flexible software architectures.
