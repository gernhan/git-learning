# Object-oriented programming (OOP)

<!--toc:start-->

- [Object-oriented programming (OOP)](#object-oriented-programming-oop)
  - [**Objects**](#objects)
  - [**Classes**](#classes)
  - [**Encapsulation**](#encapsulation)
  - [**Inheritance**](#inheritance)
  - [**Polymorphism**](#polymorphism)
  - [**Abstraction**](#abstraction)
  - [**Instance**](#instance)
  - [**Method**](#method)
  - [**Attribute**](#attribute)
  - [**Constructor**](#constructor)

<!--toc:end-->

Object-Oriented Programming (OOP) is a programming paradigm that organizes code into objects, which are instances of classes. It's a way of designing and structuring code to promote modularity, reusability, and maintainability. Let's break down the key concepts of OOP in the easiest way:

### Objects and Classes

#### Objects

- **Definition:** Objects are instances of classes. They represent real-world entities and encapsulate both data (attributes) and behavior (methods).
- **Example:** If "Car" is a class, an object would be a specific car instance with its unique characteristics (color, model, etc.) and behaviors (drive, brake).

#### Classes

- **Definition:** Classes are blueprints or templates for creating objects. They define the attributes and methods that objects will have.
- **Example:** "Car" is a class that defines what attributes (color, model) and methods (drive, brake) an actual car object will have. We can create a Toyota car or a Mazda car using that blueprint "Car"

See [text](/src/main/java/oop/objects_and_classes/Car.java) 

### Encapsulation

- **Definition:** Encapsulation is the bundling of data (attributes) and the methods that operate on the data within a single unit (class).
- **Example:** A "BankAccount" class encapsulates account balance as an attribute and methods like `deposit()` and `withdraw()`.

Object-Oriented Programming provides a way to model and organize code that closely mirrors real-world entities and their interactions, making it easier to design, understand, and maintain software systems.

- **Example:** A "Person" class encapsulates data (name, age) and methods (eat, sleep) related to a person.

### Inheritance

- **Definition:** Inheritance allows a class (subclass/derived class) to inherit properties and methods from another class (superclass/base class).
- **Example:** "Car" class may inherit common properties and methods from a more general "Vehicle" class.

### Polymorphism

- **Definition:** Polymorphism allows objects of different types to be treated as objects of a common type. It enables flexibility in using different classes interchangeably.
- **Example:** Both a "Circle" and a "Rectangle" class might have a method called "area," allowing you to call `shape.area()` regardless of the specific shape.

### Abstraction

- **Definition:** Abstraction involves simplifying complex systems by modeling classes based on essential properties and behaviors while hiding unnecessary details.
- **Example:** A "DatabaseConnection" class abstracts the complexity of interacting with a database, providing methods like `connect()` and `query()`.

### Instance

- **Definition:** An instance is a specific occurrence of an object created from a class.
- **Example:** If "Dog" is a class, an instance could be an actual dog named "Buddy."

### Method

- **Definition:** A method is a function or behavior associated with an object. It defines the actions an object can perform.
- **Example:** In a "Car" class, `startEngine()` could be a method that initiates the car's engine.

### Attribute

- **Definition:** An attribute is a property or characteristic of an object. It represents the state of an object.
- **Example:** In a "Person" class, "age" could be an attribute.

### Constructor

- **Definition:** A constructor is a special method in a class that is called when an object is instantiated. It initializes the object's attributes.
- **Example:** In Python, `__init__` is a constructor method that initializes object attributes.
