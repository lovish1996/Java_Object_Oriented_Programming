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
- 