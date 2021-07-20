# OOP

### Table of contents

- General info
- Technologies
- Setup
- Things learned
- Programming paradigms. 
- What is object oriented programming
- 4 pillars of object oriented programming.
- Class declaration.
- Object creation.
- What is a constructor method.
- Variable declaration.
- Creation and use of methods.
- Inheritance.

------------

### General info

In the OOP course I learned the basics of OOP, especially analyzing objects and abstracting information from them so that classes with attributes and behaviors can be generated. In the course I worked with 4 programming languages which were Java, Javascript, Php and Python. I learned the basic structure in the 4 languages to create classes and create objects with behaviors based on those classes. Inside the folders of this repository there are the same files but written in each language. The files that served as super classes were Account, Payment and Car while the rest of the files inherit from these classes depending on the business logic. For example, UberX inherits from Car while User inherits from Account.

------------

### Technologies

- VisualStudioCode 1.57
- Python
- Java
- JavaScript
- Php
------------

### Setup

##### Install VisualStudioCode
- Go to https://code.visualstudio.com/ and select your OS and the clic on the donwload button.
- Complete the installation process.

##### Install Python
- Go to https://www.python.org/downloads/release/python-396/ and donwload the latest version.

##### Install Java
- Inside VisualStudioCode, clic on the "Extensions" tab.
- Search "Debugger of java" extension and install it.
- Search also "Java Extension Pack" extension and install it.

##### Install Php
- Inside VisualStudioCode, clic on the "Extensions" tab.
- Search "Extension PHP server" and install it.

##### Install JavaScript
- It doesn't requiere installation.
------------


### Things learned
- Analyzing objects and abstracting information from them.
- 4 pillars of object oriented programming. Inheritance, Encapsulation, Abstraction and Polymorphism.
- Programming paradigms: Are a way to classify programming languages based on their features. Languages can be classified into multiple paradigms. Common programming paradigms include: object oriented programming. Functional. Reactive.
- What is object oriented programming. Is a programming paradigm that relies on the concept of classes and objects. It is used to structure a software program into simple, reusable pieces of code blueprints (usually called classes), which are used to create individual instances of objects. There are many object-oriented programming languages including JavaScript, C++, Java, and Python.
- UML modeling symbols and rules.
- Class declaration. 
- Object creation. Example: **ClassName className = new ClassName();**
- Constructor method. It tells the minimum requiered data to create an object from a class. There can be multiple constructor methods for a single class. **public ClassName(String requieredString, int requieredInt){}**. Another example: **public ClasName(){}** this constructor doesn´t requeire any data to create an object.
- Modularity principles.
- Always reuse code. 
- Variable declaration. **int exampleNumber** = 8; or **int anotherExample;**
- Creation and use of methods. We use **void** to indicate a method won't return a value. If the method does return a value we use return inside the method code. **public exampleMethod(int requieredNumber){return requiredNumber + 1;}**
- If/Else declaration.
- How inheritance works. In java we use "extends" to indicate a class inherits from another class. This daughter class can use all the methods and variables defined in the super class. A single class can not inherit from several classes at a the same time.
- Getters and Setters. 

