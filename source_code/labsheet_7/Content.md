#### Anonymous Inner Classes

- If we want to use inner class in a single place of our program, we use `Anonymous inner class`.
- Syntax: This constructor defines a new class without a name and create an instance of that class.

```
new superclass_name/ interface_name(parameter_list){
    // variables and methods
}
```

- Creates a (uniquely customized) new object same as superclass/ interface with more methods and attributes.
- If `interface` is used as a base, it must implement all the methods and `parameter_list` must be empty.

#### List Interface

- Ordered collection (a.k.a sequence), end user has control over where elements are inserted.
- It has all the operations inherited from the `Collection`.
- It has the following additional operations:
    - Positional access (Random access): we can manipulate objects on the basis of their positions.
    - Search: searches for a specific object and return its numerical position.
    - Iteration: iterator for taking advantage of sequential nature.
    - Range view: arbitrary range operations on a list.
- Implementations:
    - LinkedList: faster insertion/deletion.
    - ArrayList: faster random access

#### ArrayList

- Resizable array implementation of the List interface.
- Implements all optional list operations, and permits all elements including null.
- Dynamic arrays unlike standard Java arrays(fixed length).
- Provides methods to manipulate size of the underlying array.
- Syntax:

```
ArrayList array = new ArrayList();
array.add("A");
array.remove("B")   // remove by object
array.remove(1)     // remove by index
array.contains("I); // existence
array.size();
```

#### Iterator

- Each of the collection classes provides an iterator() method, returns an iterator to the start of the collection.
- `iterator()`: Iterator to the beginning of the collection.
- `hasNext()` in the loop call. As long as `hasNext()` returns true, keep on looping.
- `next()` to obtain elements inside of loop.

#### ListIterator

- Traverse the list in either direction.
- Modifies the list during iteration.
- Obtain iterators current position in the list.
- It has no current element, cursor position always lies b/w element that would be returned by calling `previous()`
  and `next()`.
- An iterator for a list of n elements has n+1 cursor positions.

#### LinkedList

- Linear data structure where each element is a separate object.
- Singly Linked List:
  - Each node contains content and a pointer to the next node in the list.
  - Does not have reference to previous node in the list.
  - Singly because each node only has single link to another node.
  - To store it, we need a reference to the head/first node of the linked list.
  - Last node points to `null`.
  - If list is empty, head is `null`, therefore, head is not a separate node.
  - Dynamic data structure, size can grow and shrink on demand.
- Disadvantages:
  - Does not allow random access.
  - Uses more memory in comparison to an array.
- `Node` class is used as an inner class to `LinkedList` because it is a helper class.
- Operations:
  - Insertion at beginning: `O(1)`
  - Insertion at end: `O(n)`
  - Delete at beginning: `O(1)`
  - Delete at end: `O(1)`
  - Search for an element: `O(n)`
