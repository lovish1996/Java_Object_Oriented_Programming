#### Interfaces

- An `interface` is a contract for what the classes can do, does not specify how classes should do it.
- 100% abstract superclass, defines a set of methods, it's subclasses must implement.
- Interface contains only `public abstract` methods (only signature/ no implementation).
- Interface may contain `constants`, `public static final` variables.
- Keyword `interface` is used in place of `class`.
- Methods don't need to have `public abstract` keyword in front of them as interfaces always have `public abstract`
  methods.
- **Naming convention:** Usually an adjective (ends with `able`), camel-case. For example, Serializable, Cloneable,
  Movable, Runnable etc.
- Similar to `abstract class`, `interface` can not be instantiated because it is incomplete.
- To instantiate, we must implement interface using subclass, now we can instantiate subclasses since they have
  implementation for all the abstract methods in the interface.
- `implements` keyword for implementing interfaces and `extends` keyword for extending superclass/ abstract class.
- Subclass implementing interface must `@Override` all the abstract methods in the interface, otherwise subclass can not
  be compiled.
- We can upcast subclass instances to `interface` via `polymorphism` similar to an abstract class.

#### Implementing multiple interfaces

- Java supports `single inheritance`, i.e., `subclass` can be derived from one and only one `superclass`.
- Does not support `multiple inheritance` to avoid conflicting properties from superclasses.
- A `subclass` can implement more than one `interfaces`, as interfaces supports abstract methods which are less likely
  to inherit conflicting properties.
- Java indirectly supports `multiple inheritance` via implementing `multiple interfaces`.
- `public class Circle extends Shape implements Movable, Displayable {}`
- Syntax:

```
[pubic | protected | package] interface interfaceName 
[extends parentInterface1, parentInterface2, ...] {
    // abstract methods signatures
}
```

- Constants in interface: `static final ...;`
- All methods in an interface is by default `public abstract`, cannot use other access
  modifiers such as `private, protected, default (package-private), static, final`.
- All fields shall be `public static final` by default.
- An interface may extend a super-interface.
- **UML Notation:** solid line arrow from subclass to concrete/abstract superclass.
- **UML Notation:** dotted line arrow from subclass to interface.
- `~` in class diagram signifies `package-private` access.

#### Nested Classes

- Classes declared inside body of another class.
- Use Case:
    - Grouping of logical classes: if any `class B` is used by only one specific `class A`, we should nest `class B`
      inside `class A`.
    - Encapsulation: By writing nested classes, they are available only to enclosing classes, and not to the outside
      world.
    - Maintainability and re-usability of code: Encapsulation brings the beauty of maintainability of code. In our
      earlier example, we can write another class B which is visible to the entire world. This has nothing to do with
      the one already present inside class A.
- Nested class is of two kinds:
    - Inner class
    - Static nested class
- Inner class is of three types:
    - Inner class (member class)
    - Method-local inner class
    - Anonymous inner class
- Nested class behave just like any other member of its enclosing class.
- Nested class has access to all the members of its enclosing class.

#### Inner Class

- `Inner class` is defined as:
    - declared inside the body of another class (member class)
    - not declared inside method of another class
    - not a static nested class
    - not an anonymous inner class

```
class Outer{
 
    class Inner{
        // implementation
    }
    
}
```

- After compilation, we get `Outer.class` and `Outer$Inner.class`, inner class is tied to its inner class.
- An inner class cannot have any static code including `public static void main(String[] args){}`
- Only classes with `public static void main(String[] args){}` can be called using `java className` command.
- Inner class being a member of the outer class has access to all the members (private as well) of the outer enclosing
  class.
- Inner class with no `public static void main(String[] args){}` can not be called using `java Outer$Inner`.

#### Instantiating an inner class

- We need an instance of an outer class since inner class can not stand on its own.
- There are two ways:
    - Within its outer class
    - Outside its outer class

```
class Outer{
  Inner inner = new Inner();
  class Inner{
  
  }
}
```

#### Method-local inner classes

- Defined within a method of the enclosing class.
- For using inner class, it must be initialized inside the method after class definition code in the same method.
- A method-local inner class cannot use variables/parameters from the method unless they are final.
- We can only apply `abstract` or `final` to method-local inner class. These two cannot be clubbed together though.
