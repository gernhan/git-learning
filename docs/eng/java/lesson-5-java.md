## Java

- How to build and run a Java application

### Java Virtual Machine (JVM):

The Java Virtual Machine (JVM) is a crucial component of the Java platform. It is an abstract computing machine that provides an execution environment for Java `bytecode`. Here's a brief overview of how the JVM works:

#### Compilation

- Java source code is initially written in a human-readable form with a `.java` extension. To make it executable, it needs to be compiled into `bytecode`, which is a low-level representation of the code. This is done using the Java Compiler (`javac`), and the result is stored in files with a `.class` extension.

#### `Bytecode`

- `Bytecode` is a set of instructions that can be executed by the JVM. It is platform-independent and can be run on any device with a compatible JVM.

#### Java Virtual Machine

- The JVM is responsible for interpreting or Just-In-Time (JIT) compiling the `bytecode` into machine code that can be executed by the underlying hardware.

#### Execution

- When a Java application is run, the JVM loads the `bytecode`, performs necessary verification, and then executes the program. During execution, the JVM manages memory, handles exceptions, and provides other runtime services.

Now, let's look at a simple example to illustrate the process:

### Example:

Let's consider a simple Java program, a "Hello World" application.

```java
// HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### Compilation

- Save the above code in a file named `HelloWorld.java`.
- Open a terminal and navigate to the directory containing the file.
- Run the command: `javac HelloWorld.java`
- This will generate a file named `HelloWorld.class`, which contains the `bytecode`.

#### Execution

- Run the command: `java HelloWorld`
- The JVM loads and executes the `bytecode`, and you will see the output: `Hello, World!`

In this example, the `javac` compiler is used to compile the source code into `bytecode`. The `java` command is then used to execute the `bytecode` on the JVM. The JVM handles the platform-specific details, making the Java program run consistently across different environments.

This separation of compilation and execution, along with the platform independence provided by the JVM, is a key feature of Java's "Write Once, Run Anywhere" philosophy.

## Java SDK (Java Software Development Kit):

The Java Software Development Kit (Java SDK or JDK) is a set of software tools and libraries that developers use to develop, compile, and run Java applications. It includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (`javac`), an archiver (jar), a documentation generator (Javadoc), and other tools needed for Java development.

- JDK (Software Development Kit):

  - JRE (Java Runtime Environment): JVM + Class Library + Java Launcher
  - Compiler (`javac`)

- Java 8 SDK
- Java 11 SDK
- Java 14 SDK
- Java 17 SDK
- Java 21 SDK

### Components of the Java SDK:

#### JRE (Java Runtime Environment)

- The JRE provides the runtime support for executing Java applications. It includes the Java Virtual Machine (JVM), which interprets and executes Java `bytecode`.

#### Compiler (`javac`)

- The Java compiler (`javac`) translates Java source code into `bytecode`. It is a crucial component for converting human-readable code into a form that the JVM can execute.

#### Archiver (jar)

- The `jar` tool is used for packaging Java applications and their resources into JAR (Java Archive) files. JAR files are a standard way of packaging and distributing Java applications.

#### Documentation Generator (Javadoc)

- `Javadoc` is a tool for generating API documentation from the comments in the source code. It helps developers create and maintain documentation for their Java code.

#### Other Utilities

- The SDK includes various other utilities and tools that aid in Java development, such as key management tools (`keytool`), debugging tools (`jdb`), and more.

### Importance of the Java SDK:

- **Development:** Developers use the JDK during the development phase to write, compile, and test Java applications.

- **Build Process:** The SDK is an essential part of the build process. It allows developers to compile their code, package it into distributable JAR files, and document the code.

- **Runtime Environment:** The JRE included in the SDK ensures that the compiled Java applications can run on any system with a compatible JVM.

- **Documentation:** The SDK provides tools for generating documentation, making it easier for developers to create and maintain documentation for their code.

In summary, the Java SDK is a comprehensive package that provides everything needed for Java development—from writing code to compiling, testing, packaging, and running Java applications. It is a fundamental toolkit for Java developers.
