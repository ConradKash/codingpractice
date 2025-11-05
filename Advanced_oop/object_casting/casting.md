For casting to happen in objects there must be an {{ is - a }} relationship

### Two types of casting

- Implicit casting (Widening casting)
- explicit casting (Narrow casting)

#### Implicit casting

    Supertype variable = new Subtype
    Example
    Person p = new Student {Every Student is a person}

x = 3 y =5
double z = x/y Both x and Y are int

- NB: Don't do `Subtype variable = new Supertype`

Methods of the super class cannot be directly accessed by the variable
In the subclass you can't directly call the constructor of the superclass
You can only call it in the constructor of the subclass using super() keyword.
Therefore `Person p1 = new Person()` inside the subclass causes an error.

#### Explicit Casting (Narrowing/Downcasting)

Explicit casting is used when you want to convert a superclass reference back to a subclass reference. This is also known as **downcasting**.

**Syntax:**

```java
Subtype variable = (Subtype) supertypeVariable;
```

**Example:**

```java
Animal animal = new Cat();  // Implicit casting (upcasting)
Cat cat = (Cat) animal;     // Explicit casting (downcasting)
```

##### Key Points about Explicit Casting:

1. **Manual Process**: You must explicitly specify the target type in parentheses
2. **Runtime Check**: Java performs a runtime check to ensure the cast is valid
3. **ClassCastException**: If the object is not actually an instance of the target class, a `ClassCastException` is thrown
4. **Access to Subclass Members**: After casting, you can access subclass-specific methods and fields

##### When to Use Explicit Casting:

- When you have a superclass reference but need to access subclass-specific methods
- When working with collections that store superclass references
- When you're certain about the actual type of the object at runtime

##### Example with Code:

```java
// Superclass reference pointing to subclass object
Animal myAnimal = new Cat();

// To access Cat-specific methods, we need to downcast
Cat myCat = (Cast) myAnimal;
myCat.meow();  // Now we can call Cat-specific methods
myCat.area = "Living room";  // Access Cat-specific fields
```

##### Safe Casting with instanceof:

To avoid `ClassCastException`, always check the type before casting:

```java
if (myAnimal instanceof Cat) {
    Cat myCat = (Cat) myAnimal;
    myCat.meow();
} else {
    System.out.println("Not a Cat!");
}
```

##### Common Pitfalls:

1. **Invalid Cast**: Trying to cast to a type the object is not an instance of

   ```java
   Animal animal = new Dog();
   Cat cat = (Cat) animal;  // ClassCastException!
   ```

2. **Unnecessary Casting**: Casting when implicit casting would work
   ```java
   Cat cat = new Cat();
   Animal animal = (Animal) cat;  // Unnecessary, implicit casting works
   ```

##### Benefits of Explicit Casting:

- **Polymorphism**: Allows you to work with objects generically and then access specific behavior when needed
- **Flexibility**: Enables writing more generic code that can handle multiple types
- **Collection Handling**: Essential when retrieving objects from collections that store superclass references
