fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println("List after removeIf: $list") // Output: List after removeIf: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println("Set after removeIf: $set") // Output: Set after removeIf: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    map.removeIf { it.key > 2 }
    println("Map after removeIf: $map") // Output: Map after removeIf: {1=one, 2=two}

    // Handling potential ConcurrentModificationException
    val anotherList = mutableListOf(1, 2, 3, 4, 5)
    anotherList.toMutableList().removeIf{ it >2 }
    println("List after removeIf (avoiding CME): $anotherList")
} 