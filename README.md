# Chapter 2 - Object-Oriented Design
As the name implies, the main “actors” in the object-oriented paradigm are called **objects**.  
## Terminology
Each object is an **instance** of a **class**.  
Each class presents to the outside world a concise and consistent view of the objects that are instances of this class, without going into too much unnecessary detail or giving others access to the inner workings of the objects.  
The class definition typically specifies the **data fields**, also known as **instance variables**, that an object contains, as well as the methods (operations) that an object can execute. This view of computing fulfill several goals and incorporates design principles, which we will discuss in this chapter.
## Programming Goals
**Robustness** - We want software to be capagble of handling unexpected inputs that are not explicityly defined for its application.  
**Adaptability** - Software needs to be able to evolve over time in response to changing conditions in its environment.  
**Reusability** - The same code should be usable as a component of different systems in various applications.  
## Abstract Data Types  
**Abstraction** is to distill a system to its most fundamental parts.  
Applying the abstraction paradigm to the design of data structures gives rise to **abstract data types** (ADTs).  
An ADT is a model of a data structure that specifies the **type** of data stored, the **operations** supported on them, and the types of parameters of the operations.  
An ADT specifies what each operation does, but not how it does it.  
The collective set of behaviors supported by an ADT is its **public interface**.  
## Interfaces and Abstract Classes  
The main structural element in Java that enforces an application programmin interface (API) is an **interface**.  
An interface is a collection of method declarations with no data and no bodies.  
Interfaces do not have constructors and they cannot be directly instantiated.  
- When a class **implements** an interface, it must implement all of the methods declared in the interface.  

An abstract class also cannot be instantiated, but it can define one or more common methods that all implementations of the abstraction will have.  

## Design Patterns
A **Design Pattern** describes a solution to a *typical* software problem.  A pattern provides a general template for a solution that can be applied in many different situations.  
### Algorithmic Design Patterns  
- **Recursion** - a programming and mathematical technique where a function or definition calls itself to solve smaller instances of a complex problem, breaking it down until a base case is reached.  
- **Amoritzation** - a method for analyzing a given algorithm's complexity, or how much of a resource, especially time or memory, it takes to execute.  
- **Divide-and-conquer** - breaks down a problem into two or more sub-problems of the same or related type, until these become simple enough to be solved directly.  
- **Prune-and-search** - a recursive procedure in which at each step the input size is reduced ("pruned") by a constant factor.  
- **Brute Force** - systematically testing every possible candidate solution until the correct one is found.  
- **The Greedy Method** - at each step, makes the choice that is locally optimal, and subsequently does not reconsider past choices.  
- **Dynamic Programming** - used to solve complex problems by breaking them down into simpler, overlapping subproblems.  

### Software Design Patterns  
- **Iterator** - abstracts the process of scanning through a sequence of elements, one element at a time.  
- **Adapter** - applies to any context where we effectively want to modify an existing class so that its methods match those of a related, but different, class or interface.  
- **Position** - acts as a marker or token within a broader positional list.  
- **Composition** - used when we wish to treat a pair or collection of values as a single object.  
- **Template Method** - an abstract base class provides a concrete behavior that relies upon calls to other abstract behaviors.  




