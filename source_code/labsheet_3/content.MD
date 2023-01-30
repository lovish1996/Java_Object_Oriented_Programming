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
- 