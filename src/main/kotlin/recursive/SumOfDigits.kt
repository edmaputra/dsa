package recursive

/**
 * Sum the input
 * ex: 111 --> 3
 *     9138 --> 9 + 1 + 3 + 8 = 21
 */
fun main() {
    println(sumOfDigit(20))
    println(sumOfDigit(56))
    println(sumOfDigit(111))
}


fun sumOfDigit(number: Int): Int {

    /**
     * The Flow:
     * 20
     * 20/10=2, and remainder --> 20%10=0
     * 2/10=0 --> stop
     *
     * 56
     * 56/10=5, and remainder --> 56%10=6
     * 5/10=0 --> stop
     *
     * 111
     * 111/10=11, and remainder --> 111%10=1
     * 11/10=1, and remainder --> 11%10=1
     * 1/10=0 --> stop
     *
     * the remainder result will always be taken
     * if the divider result (d) != 0, take it
     * if d == 0, stop
     *
     * f(n) = n%10 + fn(n/10)
     */
    if (number <= 0) {
        return 0
    }
    return number%10 + sumOfDigit(number/10)
}