# Kotlin removeIf() with Mutable Collections

This example showcases the behavior of the `removeIf()` function on different mutable collection types in Kotlin (List, Set, Map).

The `removeIf()` function provides a concise way to remove elements from a collection based on a predicate. However, it's crucial to understand its behavior and potential side effects, especially when working with maps.

## Key Observations:

* **In-place modification:** `removeIf()` modifies the original collection directly. It doesn't return a new collection.
* **Map behavior:** With maps, the `removeIf()` predicate receives the `Map.Entry` as input, making it necessary to access the key and value using `it.key` and `it.value` respectively.
* **Return value:** The function returns `true` if any elements were removed, otherwise `false`.