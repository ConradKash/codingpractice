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

- NB: Dont be `Subtype variable = new Supertype`

Methods of the super class cannot be directly acccessed by the variable
In the subclass you can't directly call the constructor of the superclass 
You can only call it in the contruct of the subclass using super() key word.
Therefore `Person p1 = new Person()` inside the subclass causes an error.

