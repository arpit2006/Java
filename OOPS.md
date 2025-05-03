# 🔥 Java OOPs Concepts - Quick Revision

A short and clear revision of **Object-Oriented Programming (OOP)** principles in **Java**.

---

## 🧱 4 Pillars of OOP

| Concept           | Description                                                                      | Example                               |
| ----------------- | -------------------------------------------------------------------------------- | ------------------------------------- |
| **Encapsulation** | Binding data and methods into one unit. Uses `private` fields + getters/setters. | `Student` class with private `marks`  |
| **Inheritance**   | One class inherits another using `extends`. Promotes code reuse.                 | `Dog extends Animal`                  |
| **Polymorphism**  | One method behaves differently (overloading & overriding).                       | `area()` in `Circle` and `Rectangle`  |
| **Abstraction**   | Hiding internal details using `abstract class` or `interface`.                   | `interface Vehicle { void drive(); }` |

---

## 📆 Key Concepts

### ✅ Class

A blueprint of objects.

```java
class Car {
    String color;
    void drive() { System.out.println("Driving..."); }
}
```

### ✅ Object

Instance of a class.

```java
Car myCar = new Car();
myCar.drive();
```

### ✅ Constructor

Special method to initialize objects.

```java
Car(String color) {
    this.color = color;
}
```

### ✅ Method Overloading (Compile-Time Polymorphism)

Same method name, different parameters.

```java
void show(int a) {}
void show(String b) {}
```

### ✅ Method Overriding (Runtime Polymorphism)

Subclass changes behavior of parent method.

```java
@Override
void drive() { System.out.println("Fast Driving"); }
```

---

## 🧪 Sample Code (All Concepts Combined)

```java
abstract class Animal {
    abstract void sound(); // Abstraction
}

class Dog extends Animal { // Inheritance
    @Override
    void sound() {          // Polymorphism (Overriding)
        System.out.println("Barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
```

---

## 🧐 Real-Life Analogy

| OOP Concept   | Real Life Example                    |
| ------------- | ------------------------------------ |
| Class         | Blueprint of a House                 |
| Object        | A house built from blueprint         |
| Encapsulation | Medicine capsule                     |
| Inheritance   | Child inherits traits                |
| Polymorphism  | Same person, different roles         |
| Abstraction   | Car driving without engine knowledge |

---

# 🔥 Java OOPs Concepts - Quick Revision

A short and clear revision of **Object-Oriented Programming (OOP)** principles in **Java** with examples for each concept.

---

## 🧱 4 Pillars of OOP

### 1. ✨ Encapsulation

**Definition:** Binding data and methods into one unit. Keeps data safe from outside interference.

```java
class Student {
    private int marks;

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}
```

### 2. 🔹 Inheritance

**Definition:** One class inherits another using `extends`. Promotes code reuse.

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

### 3. 🔀 Polymorphism

**Definition:** One method behaves differently depending on context. Two types: Overloading and Overriding.

#### ➕ Method Overloading (Compile-Time)

```java
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

#### ↺ Method Overriding (Runtime)

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

### 4. 🔮 Abstraction

**Definition:** Hiding internal details and showing only necessary parts.

#### Using Abstract Class

```java
abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}
```

#### Using Interface

```java
interface Playable {
    void play();
}

class MusicPlayer implements Playable {
    public void play() {
        System.out.println("Playing music...");
    }
}
```

---

## 📆 Key Concepts Recap

### ✅ Class & Object

```java
class Car {
    String color;
    void drive() { System.out.println("Driving..." + color); }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "Red";
        c.drive();
    }
}
```

### ✅ Constructor Example

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}
```

---
```java
📝 Important Points

//1. Every Java program starts execution from the main() method.
//2. Java supports both interface-based and abstract class based abstraction.
//3. super keyword refers to the parent class.
//4. this keyword refers to the current class instance.
//5. Java supports single, multilevel, and hierarchical inheritance, but not multiple inheritance through classes (handled via interfaces).
//6. Access modifiers: private < default < protected < public.
//7. Constructors can be overloaded but cannot be overridden.
//8. Final class cannot be inherited. Final method cannot be overridden.
//9. Abstract classes can have constructors, interfaces cannot.
```