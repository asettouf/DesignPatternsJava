# DesignPatternsJava
Implementation of various design patterns in Java from "Head First Design Patterns" from O'Reilly

**A Pattern** is a solution to a problem in a context

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


*Classic pattern catalogue: the GoF (Gang of Four)*

## Conclusion

* Keep it simple: the goal is to have the simplest solution. Patterns generate complexity.
* Three categories: Behavioral Patterns, Structural, and Creational 
* Use a pattern when there are complex problems, check the intent and applicability in pattern catalogues. 
Use a pattern as well for simple problems, when the system is expected to vary
* Patterns are great for refactoring (for example a lot of conditionnal statements might suggest to use a State Pattern)
* Use Patterns to improve the design of the application, always think simple

## Books and websites to go further:
- *Design Patterns Elements of Reusable Object-Oriented Software*
- *A Pattern Language*
- *The timeless way of building*
- The Portland patterns repository (website)
- The Hillside Group (website)


*Nota Bene: each folder contains one type of pattern, we did not improve to the maximum every each
of them, it is more each time about expliciting the pattern at stake*