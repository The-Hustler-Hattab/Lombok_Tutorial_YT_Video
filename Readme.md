# Lombok Annotations Tutorial
## Youtube Tutorial
[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/yctKNTNRCHQ/0.jpg)](https://www.youtube.com/watch?v=yctKNTNRCHQ&ab_channel=MohammedHattab)

Welcome to the Lombok Annotations Tutorial! This guide will walk you through some of the most commonly used Lombok annotations to simplify and enhance your Java code. Lombok is a library that helps reduce boilerplate code in your Java projects, making your code cleaner and more maintainable.

In this tutorial, we will cover the following Lombok annotations:

- `@Data`
- `@ToString`
- `@AllArgsConstructor`
- `@NoArgsConstructor`
- `@Setter`
- `@Getter`
- `@EqualsAndHashCode`
- `@Builder`
- `@Cleanup`

Let's get started!

## Prerequisites

Before you begin, make sure you have Lombok integrated into your Java project. You can add Lombok as a dependency in your build tool (e.g., Maven or Gradle) and configure your IDE to support Lombok annotations.

### Maven Dependency

To add Lombok to your Maven project, include the following dependency in your `pom.xml` file:

```xml
<!-- This dependency is needed to use lombok annotations -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.30</version>
    <scope>provided</scope>
</dependency>
```

## `@Data`

The `@Data` annotation is a convenient shortcut that bundles the functionality of `@ToString`, `@EqualsAndHashCode`, `@Getter`, `@Setter`, and `@RequiredArgsConstructor`. It automatically generates getters and setters, a `toString` method, an `equals` method, and a constructor for all fields in the class.

Example:

```java
import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;
}
```
## `@ToString`
The @ToString annotation generates a toString method for the class. This method includes all non-static, non-transient fields of the class.

Example:

```java
import lombok.ToString;

@ToString
public class Book {
    private String title;
    private String author;
}
```
## `@AllArgsConstructor` and `@NoArgsConstructor`
The @AllArgsConstructor annotation generates a constructor with parameters for all fields in the class, while @NoArgsConstructor generates a no-argument constructor.

Example:

```java
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String make;
    private String model;
    private int year;
}
```
## `@Setter` and `@Getter`
The @Setter and @Getter annotations generate setter and getter methods for the fields in the class, respectively.

Example:

```java
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class Student {
    private String name;
    private int age;
}
```
## `@EqualsAndHashCode`
The @EqualsAndHashCode annotation generates equals and hashCode methods based on the fields in the class.

Example:

```java
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Product {
    private String name;
    private double price;
}
```
## `@Builder`
The @Builder annotation simplifies the creation of complex objects by generating a builder pattern for your class. When used with toBuilder = true, it allows you to create a modified version of an existing object.

Example:

```java
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private int employeeId;

    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .name("John Doe")
                .employeeId(12345)
                .build();


    
    }
}
```
## `@SuperBuilder`
The @SuperBuilder annotation in Lombok is an extension of the @Builder pattern. It is particularly useful for classes that are part of an inheritance hierarchy. This annotation generates a builder with support for subclass attributes, enabling fluent object construction in hierarchies.

Example:

```java
import lombok.experimental.SuperBuilder;

// Base class
@SuperBuilder
public class Vehicle {
    private String brand;
    private String model;
}

// Subclass
@SuperBuilder
public class Car extends Vehicle {
    private int seats;
    private double engineSize;
}

public class LombokSuperBuilderExample {
    public static void main(String[] args) {
        // Creating an instance of Car using SuperBuilder
        Car car = Car.builder()
                .brand("Toyota")
                .model("Camry")
                .seats(5)
                .engineSize(2.5)
                .build();

        System.out.println(car);
    }
}
```



## `@Cleanup`
The @Cleanup annotation automatically closes resources (e.g., streams) when they go out of scope, reducing the need for explicit resource management.

Example:

```java
import lombok.Cleanup;

public class FileExample {
    public void readAndPrintFile(String filePath) throws IOException {
        @Cleanup FileReader fileReader = new FileReader(filePath);
        int character;
        while ((character = fileReader.read()) != -1) {
            System.out.print((char) character);
        }
    }
}
```
That's it! You've learned how to use some of the most common Lombok annotations to simplify your Java code. Feel free to explore more Lombok features and experiment with these annotations in your projects.

Happy coding! 🚀