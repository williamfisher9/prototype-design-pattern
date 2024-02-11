## Prototype Design Pattern
- It is a Creational Design pattern (it provides a mechanism of object creation).
- Used when object creation is so costly and there exists other similar objects.
- It copies an existing object and then modifies it.
- In Java it uses cloning to copy the object.
- The object to be copies should have the copying feature. It should implement Cloneable interface.
- Based on the requirements, deep or shallow copy can be used. For primitive and immutable fields, we can use a shallow copy. For mutable fields, we should  use a deep copy
- It is suitable when the new object is slightly different from the existing object.
- Prototype design pattern allows us to hide the complexity of creating a new object instance from the client code.
- 