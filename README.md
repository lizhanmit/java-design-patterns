# Java Design Patterns

Design Principles:

- Encapsulate the part in the application that may need changes. **DO NOT** mix them with those code that does not need change.
	- If the new requirement comes and some part of code needs to change accordingly, then this part of code needs to be extracted distinguishing with other stable code.

- Code against interface rather than implementation.
- Use composition more. Use inheritance less. (HAS-A is better than IS-A.)
	- When two classes are combined to use, that is composition, e.g. animal and its behavior.
	- Using composition makes system more flexible, which make it possible to change behaviors dynamically in runtime.
- Using interfaces makes code non reusable as there is no real code in interfaces and every implemented class needs to implement its methods.

---

## SOLID Principles of OOP

Single Responsibility Principle

- Every class should have a single responsibility.
- Your classes should be small.
- Avoid "god" classes.
- Split big classes into small classes.

Open/Close Principle

- Your classes should be open for extension but closed for modification.
- You should be able to extend a class's behavior, without modifying it.
- Make base classes as abstract.

Liskov Substitution Principle

- Objects in a program would be replaceable with instances of their subtypes without altering the correctness of the program.

Interface Segregation Principle

- Many fine-grained client specific interfaces are better than one "general purpose" interface.
- Keep your components focused and minimize dependencies between them.
- Avoid "god" interfaces.

Dependency Inversion Principle

- Abstractions should not depend upon details.
- Details should not depend upon abstractions.
- Make a distinction between the higher level and lower level objects. They should depend on the same abstract interaction.  

---

## Creational Patterns

### Factory Pattern

Use a factory class to create normal classes through specifying class type as input parameter rather than use new operator.

![factory-pattern.jpg](img/factory-pattern.jpg)

### Abstract Factory Pattern

Use a super-factory (factory producer) to create other factories through specifying factory type as input parameter rather than use new operator.

相当于再提一层。

![abstract-factory-pattern.jpg](img/abstract-factory-pattern.jpg)

### Singleton Pattern

Use a singleton class which is responsible to create an object which can be accessed directly without instantiating the class.

One class only has one object in memory. You cannot create multiple objects for this class.

For some classes, we only need one object, such as

- property file
- utility file
- thread pool
- cache
- log object
- task manager and recycle bin of Windows
- database connection pool
- bean in Spring by default
- Application in servlet

How to keep only one object in the memory for a specific class:

- Ideas:
    1. Forbid other programs to use this class to create objects.
    2. In this class, create an object itself in order to let other programs access its object.
    3. Provide methods for external access to this object.  

- Implementation by code:
    1. Make constructor of this class private.
    2. Create an object of this class in this class.
    3. Create a method to access this object externally.

![singleton-pattern.jpg](img/singleton-pattern.jpg)

Two kinds of implementations:

- Lazy
	- Lazy load. Utilization rate becomes higher.
	- Need to sync when calling `getInstance()` every time. Concurrency rate is low.
	- Use this one if you do not need to create the object frequently.

- Non-lazy
	- Once the class is loaded, the object will be created. If you do not use it, resources will be wasted.
	- Use this one if you need to create the object very often.

### Builder Pattern

Create a complex object (it is Meal here) which contains simple objects (it is Item here), e.g. a field of the complex object is a collection of other simple objects.

![builder-pattern.jpg](img/builder-pattern.jpg)

### Prototype Pattern

Create a duplicate or **clone** of current object while keeping performance in mind.

We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.

When to use:

- Creation of object directly is costly, e.g. costly database operation.

![prototype-pattern.jpg](img/prototype-pattern.jpg)

## Structural Patterns

### Adapter Pattern

Use a sinlge class to combine the capabilities or functionalities of two independent or incompatible interfaces.

A real life example could be a case of card reader which acts as an adapter between a memory card and a laptop. You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.

![adapter-pattern.jpg](img/adapter-pattern.jpg)

### Bridge Pattern

Use an interface which acts as a bridge to **decouple** an abstraction from its implementation so that the two can be altered independently without affecting each other.

Composition over inheritance.

Collections framework in Java has examples of the bridge interface: ArrayList and LinkedList are implement List. And List provides common methods to add, remove or check size.

Not applying bridge pattern:

![not-applying-bridge-pattern](img/not-applying-bridge-pattern.png)

Bridge pattern:  

![bridge-pattern](img/bridge-pattern.png)

Applying bridge pattern:

![applying-bridge-pattern](img/applying-bridge-pattern.png)

![applying-bridge-pattern-2](img/applying-bridge-pattern-2.png)

![applying-bridge-pattern-3.png](img/applying-bridge-pattern-3.png)

JDBC is a typical example of applying bridge pattern.

![jdbc-bridge-pattern.png](img/jdbc-bridge-pattern.png)

### Filter Pattern

It filters a set of objects using different criteria / filters and chaining them in a decoupled way through logical operations.

It combines multiple criteria / filters to obtain single criterion / filter.

![filter-pattern.jpg](img/filter-pattern.jpg)

For exapmle, we have original `CriterionMale`, `CriteriaFemale` and `CriteriaSingle` to filter people seperately. Now we add `AndCriteria` and `OrCriteria` to chain two of those three criteria together so as to get more complex criteria.

### Composite Pattern

Create a class that contains group of its own objects and make this group as an attribute of this class. And this class provides methods to modify this attribute.

![composite-pattern.jpg](img/composite-pattern.jpg)

### Decorator Pattern

Create a decorator class which wraps an existing class (contains its object as an attribute) in order to provide additional functionality without altering structure of the original class.

![decorator-pattern.jpg](img/decorator-pattern.jpg)

### Facade Pattern

Create a (facade) class as an interface to the existing system, which can be used by clients to access the system hiding its complexities.

Then the client do not need to create instances for each classes in the system. Instead, you make objects of those classes as attributes of the facade class and provide methods wrapping methods of those classes. Thereby, the client is able to only create an instance for the facade class to call methods of those classes in the system.

When creating the instance of the facade class using the constructor, the client does not need to pass objects as input parameters.

![facade-pattern.jpg](img/facade-pattern.jpg)

### Proxy Pattern

Create a proxy class to represent functionality of another (real) class in order to restrict its access from outside of the system.

The proxy class make the object of the real class as an attribute.

The method to be restricted in the real class is **private** rather than public. And this method is invoked in this constructor, so that it will be invoked only once when the instance of the real class is created.

![proxy-pattern.jpg](img/proxy-pattern.jpg)

## Behavioral Patterns

### Command Pattern

The command class which implements the command interface, makes the object as its attribute with execute method invoking specific methods of the object. The command executor class makes a list of command objects as its attribute with execute method invoking the execute method of the command class for each command object. After executing, the list of command objects should be cleared.  

![command-pattern.jpg](img/command-pattern.jpg)

### Observer Pattern

There is a Subject class that is observed, and some Observer classes that observe the Subject class. The Subject class has a list of Observer objects as an attribute.

If there is any change to the state attribute of Subject class, it will notify all Observer classes through `notifyAllObservers()` method, and these Observer classes will get updated accordingly through `update()` method .

The Subject class is able to attach new Observer classes into the list and detach old Observer classes from the list. This is realized by Observer class having the object of Subject class as an attribute, making it as the input parameter of its constructor and having it to attach the Observer instance in the constructor. Thus, when a new Observer instance is created, this instance itself will be attached to the list of Observer class objects through `this.subject.attachObserver(this)` method.

![observer-pattern.jpg](img/observer-pattern.jpg)

### Strategy Pattern

Create a Context class making the object of Strategy class as its attribute and input parameter of constructor.

When creating instances for this Context class using constructor, pass different types of instances of Strategy class as input parameter to realize different strategies.

![strategy-pattern.jpg](img/strategy-pattern.jpg)

## J2EE Patterns

### MVC Pattern

- Model
- View
- Controller - having object of Model class and View class as attributes.
  - Method names in Controller should be more meaningful and readable compared with those in Model class.

![mvc-pattern.jpg](img/mvc-pattern.jpg)

### DAO Pattern

Data Access Object (DAO) Pattern is used to separate low level data accessing API or operations from high level business services.

- Model
- Dao (interface)
- DaoImpl - having the list of students as an attribute.

![dao-pattern.jpg](img/dao-pattern.jpg)
