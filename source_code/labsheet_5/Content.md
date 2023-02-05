#### Inheritance

- Organization of classes in hierarchy, to avoid duplication and redundancy.
- Classes in lower hierarchy `inherits` state variables and methods from classes in the higher hierarchy.
- Lower Hierarchy: `Subclass/ derived/ child/ extended class`
- Upper Hierarchy: `Superclass/ base/ parent class`
- Define a subclass using the keyword `extends`
- **UML Notiation:** solid line with a hollow arrowhead starting from subclass and reaching to superclass. By
  convention, superclass is on top of subclass.
- `class A{}` and `class B extends A{}`, then we can refer `A a = new B()`, but `B b = new A()` is not valid.

#### Polymorphism

- Polymorphism: one name, many forms
- Compile time polymorphism: `Method overloading`
- Run time polymorphism: `Method overriding`
- `Method overloading:` name of method remains the same, but number and type of parameters are different in the same
  class.
- `Overloaded` methods appear in the same class or a subclass (_inherited methods and new method in subclass_).
- `Overloaded` methods have the same name.
- `Overloaded` methods have different parameter lists.
- `Overloaded` methods can have different return types.
- `Constructor overloading:` multiple constructors with different parameter lists and different parameter types,
  compiler identifies by type and number of parameters.
- `Method overriding:` only applicable to inherited methods (Polymorphism is a fundamental concept in object-oriented
  programming and applies to inherited methods in Java. Polymorphism allows an object of a subclass to be treated as an
  object of its superclass, and for the behavior of a method to change based on the actual type of the object it is
  being called on. When a method is overridden in a subclass, the behavior of the method changes based on the actual
  type of the object it
  is being called on. For example, if a method is overridden in a subclass, when the method is called on an object of
  the
  subclass, the behavior of the method will be the behavior defined in the subclass. However, if the same method is
  called
  on an object of the superclass, the behavior of the method will be the behavior defined in the superclass. This is an
  important aspect of polymorphism, as it allows for the behavior of a method to change dynamically based on
  the type of the object it is being called on. This is one of the key benefits of inheritance and polymorphism in Java,
  as it allows for more flexible and extensible code. In short, the concept of polymorphism applies only to inherited
  methods, and it is related to the way that the behavior
  of a method can change based on the actual type of the object it is being called on. This allows for more flexible and
  dynamic behavior in Java, and is an important aspect of object-oriented programming.).

- Object type (not reference variable type) will determine which override method will be used at runtime.
- `Overriding` methods have same argument list else it will be `Overloading`.
- `Overriding` methods must have same return type.
- In Java, when a method in a subclass overrides a method in its superclass, the return type of the overriding method
  must be the same as the return type of the overridden method. This means that the return type of the overriding method
  must be exactly the same, or a subtype, of the return type of the overridden method. This restriction ensures that the
  behavior of the method remains consistent and predictable, even when it is overridden
  in a subclass. For example, if a method in the superclass returns an instance of a particular class, the overriding
  method in the subclass must also return an instance of that class or a subclass of that class. However, there is an
  exception to this rule called covariant return, which was introduced in Java 5. With covariant
  return, the return type of the overriding method can be a subclass of the return type of the overridden method. This
  allows the subclass to provide a more specific return type for the method, if desired. For example, if a method in the
  superclass returns an instance of the Object class, the overriding method in the
  subclass can return an instance of the String class. This is because the String class is a subclass of the Object
  class,
  and the return type of the overriding method is a subtype of the return type of the overridden method.

- `Overriding` methods must not have `more restrictive` access modifier, `less restrictive` is fine (In Java, when a
  method in a subclass overrides a method in its superclass, the access level of the overriding method must not be more
  restrictive than the access level of the overridden method. This means that the access level of the overriding method
  must be at least as accessible as the access level of the overridden method. For example, if the overridden method is
  declared as public, the overriding method must also be declared as public, or
  at least as protected. The overriding method cannot have a more restrictive access level, such as private or default (
  package-private). However, the overriding method in the subclass can have a less restrictive access level compared to
  the overridden
  method in the superclass. For example, if the overridden method is declared as protected, the overriding method can be
  declared as public. This allows the subclass to make the method more accessible to other classes if desired. This
  restriction on the access level of an overriding method is in place to ensure that the behavior of the method
  remains consistent and accessible, even when it is overridden in a subclass.).

- `Overriding` methods must not throw broader/ new checked exceptions, but may throw fewer/ narrower checked/ unchecked
  exceptions (In Java, when a method in a subclass overrides a method in its superclass, it must provide a compatible
  implementation for the method. This includes not only the method signature (name, parameter list, and return type),
  but also the exceptions that the method can throw. The overriding method in the subclass must not throw a new or
  broader checked exception compared to the overridden
  method in the superclass. This means that the set of checked exceptions that the overriding method can throw must be a
  subset of the set of checked exceptions that the overridden method can throw. For example, if the overridden method
  can
  throw a FileNotFoundException, the overriding method cannot throw a broader exception such as IOException. However,
  the overriding method in the subclass can throw fewer or narrower checked exceptions, or any unchecked
  exceptions, compared to the overridden method in the superclass. This allows the subclass to refine the behavior of
  the
  method and to handle exceptions in a way that is appropriate for the subclass. This restriction on the exceptions that
  can be thrown by an overriding method is in place to ensure that the behavior of
  the method remains consistent and predictable, even when it is overridden in a subclass.).

- `abstract` methods must be overridden (In Java, abstract methods are methods that are declared but have no
  implementation, and they must be overridden in any concrete (i.e., non-abstract) subclass that inherits them. Abstract
  methods are declared using the abstract keyword, and they are used to define a contract or a template for a method
  that must be implemented in a subclass. Since abstract methods have no implementation, concrete subclasses that
  inherit from an abstract class must provide an
  implementation for the abstract methods, by providing a concrete implementation in the subclass. If a concrete
  subclass
  does not provide an implementation for an abstract method, the subclass must also be declared as abstract. In this
  way, abstract methods ensure that subclasses provide a specific implementation for a method, and that the
  behavior of a method is defined for all subclasses that inherit from the abstract class. This is useful for defining a
  common behavior that must be followed by all concrete subclasses, and for ensuring that the behavior of a method is
  consistent across all subclasses)

- `final` methods cannot be overridden (In Java, when a method is declared as final, it cannot be overridden in any
  subclass. A final method is a method that has the final keyword added to its declaration, and it is a way to prevent
  subclasses from changing the behavior of a method inherited from its superclass. When a method is declared as final,
  the Java compiler prevents it from being overridden by checking for compatibility between the superclass method and
  the subclass method. This can be useful for ensuring that the behavior of a method remains constant, even when it is
  extended in a subclass).
- `static` methods cannot be overridden (In Java, static methods are methods that belong to a class, rather than to an
  instance of the class. Static methods can be called without having an instance of the class, and they cannot be
  overridden because they are bound to the class, not to an instance of the class. When a static method is defined in a
  subclass with the same signature as a static method in its superclass, it is said
  to hide the superclass method, not to override it. The subclass method will be called when the method is invoked on
  the
  subclass, but the superclass method will still be available if it is invoked on the superclass. Static methods are
  often used to define utility methods that don't need to access instance variables or call instance
  methods, so it makes sense that they cannot be overridden, as the behavior of a static method is not tied to the state
  of a particular object).

- `Constructors` cannot be overridden (Constructors cannot be overridden in Java because they are not methods in the
  traditional sense. Constructors are used to create an instance of an object and are called only once for each object,
  when it is created. They are not inherited by subclasses, and a subclass can only have a constructor if it explicitly
  defines one. Since constructors are not methods, they do not have a return type, and therefore cannot be overridden.
  Instead, a subclass can call its superclass constructor to reuse its behavior and initialize the object's state in a
  consistent way).