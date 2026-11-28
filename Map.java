# Map in Java

## 1. What is Map?

`Map` is an interface in Java that stores data as **key-value pairs**.

Each key must be unique, but values can be duplicated.

Example:
- Key: Account Number
- Value: Account Object

## 2. Why does Java have Map?

Map makes it easy to find data using a unique key instead of searching through every element.

For example, in a Bank Account project, we can find an account using its account number.

## 3. How does it work?

- Each key is connected to a value.
- Keys cannot be duplicated.
- Adding an existing key replaces its previous value.
- Values can be duplicated.
- You retrieve a value using its key.

## 4. Syntax and Example

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> accounts = new HashMap<>();

        accounts.put(1001, "Barham");
        accounts.put(1002, "Ahmed");
        accounts.put(1003, "Ali");

        System.out.println(accounts.get(1001));
    }
}
```

Output:

```text
Barham
```

Important lines:

- `Map<Integer, String>` → Keys are Integers, values are Strings.
- `new HashMap<>()` → Creates a HashMap.
- `put()` → Adds or updates a key-value pair.
- `get()` → Retrieves a value using its key.

## 5. When Should I Use Map in a Project?

Use Map when you need to find data using a unique key.

Realistic Bank Account example:

- Key → Account Number.
- Value → Account Object.

```java
Map<Integer, Account> accounts = new HashMap<>();
```

Now you can retrieve an account directly:

```java
Account account = accounts.get(1001);
```

You do NOT need Map when:
- You only need to store a simple collection of objects.
- You need to access elements using indexes.
- You do not need key-value relationships.

For example, your existing `ArrayList<Account>` is perfectly fine for storing accounts. You do not need to replace it with a Map unless you need key-based lookup.

## 6. Important Map Implementations

### HashMap
- Does not guarantee ordering.
- Allows one null key and multiple null values.
- Fast lookup (O(1) average).
- Most common general-purpose Map implementation.

### LinkedHashMap
- Maintains insertion order by default.
- Allows one null key and multiple null values.
- Useful when you need predictable iteration order.

### TreeMap
- Automatically sorts keys.
- Does not allow null keys with natural ordering.
- Allows null values.
- Operations take O(log n).

### Hashtable
- Older Map implementation.
- Synchronized methods.
- Does not allow null keys or values.
- Rarely used in modern Java.

### ConcurrentHashMap
- Designed for concurrent access.
- Allows multiple threads to work with the Map safely.
- Does not allow null keys or values.
- Preferred over Hashtable for most modern concurrent Map use cases.

## 7. Important Map Methods

- `put(key, value)` → Adds or updates an entry.
- `get(key)` → Returns the value associated with a key.
- `remove(key)` → Removes an entry.
- `containsKey(key)` → Checks whether a key exists.
- `containsValue(value)` → Checks whether a value exists.
- `keySet()` → Returns all keys.
- `values()` → Returns all values.
- `entrySet()` → Returns all key-value entries.
- `getOrDefault(key, defaultValue)` → Returns a default value if the key does not exist.
- `putIfAbsent(key, value)` → Adds a value only if the key is absent.

## 8. Common Mistakes

1. Thinking Map allows duplicate keys. It does not.
2. Thinking adding an existing key creates another entry. It replaces the old value.
3. Thinking HashMap maintains insertion order. It does not guarantee any order.
4. Calling `get()` for a missing key. It returns `null` (unless using a default-value alternative).
5. Using `==` to compare String keys instead of `equals()`.

## 9. What Happens Without Map?

You can use a List, such as ArrayList.

However, finding an object by its account number usually requires searching through the List.

Map provides direct key-based lookup, which is often more convenient.

## 10. What Should I Remember?

- Map stores key-value pairs.
- Keys must be unique; values can be duplicated.
- HashMap is the common general-purpose choice.
- TreeMap sorts keys.
- LinkedHashMap maintains insertion order.
- ConcurrentHashMap supports concurrent access.
- Hashtable is an older implementation.

**Most important idea:** Use List when you need a collection of elements. Use Map when you need to find values using unique keys.
