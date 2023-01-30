#### Static variables

- class variable, not an object variable
- initialized once, before initialization of any instance variables, single copy shared amongst all the instances
- can be called without an instance being in existence, Syntax: `<class_name>.<variable_name>`
- instance and class variables are automatically initialized to default values, local variables are not automatically
  initialized.

#### Static methods

- class method, not an object method
- can access only static data (no access to non-static data), because it is not linked to an instance of a class
- can access only static methods (no access to non-static method), because it is not linked to an instance of a class
- can be called without an instance being in existence, Syntax: `<class_name>.<method_name>`
- can not refer to `this` or `super` keyword, because `this` keyword is linked to instance and `super` keyword needs a
  parent class in inheritance hierarchy and is applicable only for instance methods.
- **main** method is `static`, accessible for running application before any initialization of the containing class, JVM
  invokes *main* method

#### Static: More facts

- Initialization of a class consists of executing its static initializers, static fields initializers
- Initialization of an interface consists of executing fields initializers declared in interface
- Before class is initialized, direct superclass must be initialized, but interfaces implemented by class need not be
  initialized.
- Before interface is initialized, super interfaces of interface need not be initialized.
- Classes and all of it's related data (not instance variables) is stored in `Permanent Generation Section` of heap.
- Whenever we initialize an object using `Car car = new Car();`, it generates a reference variable `car` and an object
  is allocated on heap memory with instance variables initialized to default values.

#### Static blocks

- Static blocks a.k.a Static initialization blocks, code enclosed in `{}` and preceded by `static` keyword
- `static{ // lines of code }`
- A Class can have any number of static blocks at any place in the class
- Runtime system ensures ordered execution of static blocks
- Executed when JVM loads the class, combines everything into one big `static` block in that order before execution.
- Order of execution --> `static blocks` --> `constructor` --> `any call to static/ non-static method`

#### Constructor blocks

- Any code block without preceding `static` keyword i.e., `{}` is called Constructor block.
- Executed when class is instantiated, if there are multiple constructors, it will be copied to each one of them.
- Combines everything into one big  `constructor block`, and prepends to the content of each one of the constructors.

#### Advantages of a static block

- Initialize static variable using computations inside a static block, since static variables are initialized when JVM
  loads the class.

#### Disadvantages of a static block

- Limitation (JVM), size of static block should not exceed 64K.
- Cannot throw checked exceptions: Correct. You cannot throw checked exceptions inside a static block because they must
  be handled or declared to be thrown. Since a static block does not have an associated method signature, it cannot
  declare that it throws a checked exception. This means that any checked exceptions thrown inside a static block must
  be handled within the block itself. If an exception cannot be handled, it will propagate to the calling code,
  potentially causing the program to terminate.
- Does not return anything since it is not a method, only used for one time setup operations when class is loaded.
- Cannot use `this` keyword, no instance available.
- Cannot use `super` keyword, nothing like this for static blocks in parent class.
- Testing is very tough with static blocks.

