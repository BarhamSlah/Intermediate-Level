# Set in Java

## 1. What is Set?

`Set` is an interface in Java that stores unique elements.

- Does not allow duplicate elements.
- Does not provide index-based access.
- Ordering depends on the implementation.

## 2. Set Implementations

### HashSet
- Does not allow duplicates.
- Does not guarantee ordering.
- Fast lookup (O(1) average).
- Allows one null element.

### LinkedHashSet
- Does not allow duplicates.
- Maintains insertion order.
- Allows one null element.

### TreeSet
- Does not allow duplicates.
- Automatically sorts elements.
- Does not normally allow null elements.
- Operations take O(log n).

## 3. Example

```java
Set<Integer> numbers = new HashSet<>();

numbers.add(10);
numbers.add(20);
numbers.add(10);
numbers.add(30);

System.out.println(numbers);
```

Output:

```text
[10, 20, 30]
```

Notice that `10` appears only once because Set does not allow duplicates.

## 4. Important Methods

- `add(element)` → Adds an element.
- `remove(element)` → Removes an element.
- `contains(element)` → Checks if an element exists.
- `size()` → Returns the number of elements.
- `isEmpty()` → Checks if the Set is empty.
- `clear()` → Removes all elements.

## 5. Set vs List

**List:**
- Allows duplicates.
- Provides index-based access.
- Example: ArrayList.

**Set:**
- Does not allow duplicates.
- No index-based access.
- Example: HashSet.

## 6. When Should You Use Set?

- Removing duplicate elements.
- Storing unique usernames or IDs.
- Checking whether an element already exists.
- Storing unique elements in sorted order using TreeSet.

## 7. Important Notes

- Set is an interface, not a class.
- HashSet uses `hashCode()` and `equals()` to identify duplicates.
- LinkedHashSet maintains insertion order.
- TreeSet sorts elements.
- Set does not allow duplicate elements.

## Summary

- List → Allows duplicates.
- Set → Does not allow duplicates.
- HashSet → Unique elements, no guaranteed order.
- LinkedHashSet → Unique elements, insertion order.
- TreeSet → Unique elements, sorted order.

**Most important idea:** Use Set when you need to store unique elements.
