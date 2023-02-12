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
- Syntax: `[pubic | protected | package] interface interfaceName [extends parentInterface1, parentInterface2, ...] {}`
- Constants in interface: `static final ...;`
- All methods in an interface is by default `public abstract`, cannot use other access
  modifiers such as `private, protected, default (package-private), static, final`.
- All fields shall be `public static final` by default.
- An interface may extend a super-interface.
- **UML Notation:** solid line arrow from subclass to concrete/abstract superclass.
- **UML Notation:** dotted line arrow from subclass to interface.
- `~` in class diagram signifies `package-private` access.

#### Nested Classes