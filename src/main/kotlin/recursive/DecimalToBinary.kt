package recursive

fun main() {
    println("10 to Binary is : "+toBinary(10))
    println("13 to Binary is : "+toBinary(13))
    println("----------------------------------------")
    println("10 to Binary(1) is : "+toBinary1(10))
    println("13 to Binary(1) is : "+toBinary1(13))
}

/**
 * The Flow:
 * #1. Divide the number by 2
 * #2. Get the integer result (V) for the next iteration
 * #3. Get the remainder result for the binary digit
 * #4. Repeat the iteration until V == 0
 */
fun toBinary(number: Int): String {
    if (number == 0) {
        return ""
    }

    val result = number/2
    val remainder = number%2
    return toBinary(result) + "$remainder"
}

fun toBinary1(number: Int): Int {
    if (number == 0) {
        return 0
    }
    return number % 2 + 10 * toBinary1(number / 2)
}