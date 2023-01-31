#### Single dimensional array

- Collection of homogeneous items, contains a number of variables, and can be `empty` when number of variables is zero.
- Variables are called the components of the array and accessed by non-negative integer indexes.
- N components, index range `0 to N-1` inclusive, N is the length of the array.
- All the components have same type called `component type` of array, if component type is `T`, type of array
  becomes `T[]`.
- `java.lang.ArrayIndexOutOfBoundsException` is one of the common exceptions, make sure you are not accessing invalid
  index.

#### Strings, StringBuffer and StringTokenizer

[RetailStoreExample.java]()
**String**

- `java.lang.String`, represents character strings, all string literals `"Abc"` instance of the class.
- _Immutable_, hence they can be shared. Values can not be modified once created.

**StringBuffer**

- `java.lang.StringBuffer`, mutable string.
- length and content of string can be changed using certain method calls.

**StringTokenizer**

- `java.util.StringTokenizer`, used to break a String into `tokens`.
- Do not distinguish b/w identifiers, numbers, quoted strings, comments. They do not skip comments.
- Set of `delimiters` specified at instantiation.
- Token is essentially a substring of original string used for instantiation.
- Legacy class, use is discouraged.

**Class Design**

- Child class can access `public` and `protected` members from parent class.
- `protected` keyword is an `access modifier` in Java, and used to dictate that members can be accessed in same class
  and any subclass. Used to implement `inheritance` and `encapsulation` in Java.
- 