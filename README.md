# DesignPatternsJava
Implementation of various design patterns in Java from "Head First Design Patterns" from O'Reilly

## Principles to follow:

* Encapsulate what varies
* Favor composition over inheritance
* Program to interfaces, not implementation
* Strive for loosely coupled designs between object that interacts
* Classes should be open for extension, closed for modification
* **Dependency Inversion Principle** (of course, this is a guideline, not rules)
  - No variable should hold a reference to a concrete class
  - No class should derive from a concrete class
  - No method should override an implemented method of any of its base class
* Depend on abstraction. Do not depend on concrete classes
* Principle of **Least Knowledge** - talk only to your immediate friends, i.e. only invoke methods that belong to:
  - The object itself
  - Objects passed in as a parameter to the method
  - Any object the method creates or instantiates
  - Any components of the object
* **Hollywood Principle** Don't call us, we will call you:
  - Avoid dependency rot: complex calls between several classes increasing in a useless manner the complexity
* **Single Responsibility Principle:**
A class should only have one reason to change (a class should hold only one responsibility, i.e. one area of change
to ensure a high degree of cohesion)

*Nota Bene: each folder contains one type of pattern, we did not improve to the maximum every each
of them, it is more each time about expliciting the pattern at stake*
