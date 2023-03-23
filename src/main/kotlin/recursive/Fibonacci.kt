package recursive

fun main() {
    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(10))
}

fun fibonacci(number: Int): Int {
    if (number < 0) {
        return -1
    }

    if (number == 0 ||  number == 1) {
        return number
    }

    return fibonacci(number - 2) + fibonacci(number - 1)
}