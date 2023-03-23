package recursive

fun main() {
    println(gcd(8, 4))
    println(gcd(48, 18))
}

/**
 * GCD (Greatest Common Divisor) is the largest positive number
 * that divide the numbers without any remainder.
 *
 * Euclidean Algorithm
 * ex:
 * gcd(48,18)
 * #1. 48/18=2, remainder = 12
 * #2. 18/12=1, remainder 6
 * #3. 12/6 =2, remainder 0
 *
 * formula:
 * gcd(a, 0) = a
 * gcd(a, b) = gcd(b, a MOD b)
 */
fun gcd(num1: Int, num2: Int): Int {
    // constraint
    if (num1 < 0 || num2 < 0) {
        return -1
    }

    // stopping criteria
    if (num2 == 0) {
        return num1
    }

    // base flow
    return gcd(num2, num1 % num2)
}