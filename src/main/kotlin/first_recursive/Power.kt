package first_recursive

fun main(args: Array<String>) {
    println(power(2, 2))
    println(power(2, -1))
    println(power(10, 5))
}

fun power(base: Int, exp: Int): Int {
    /**
     * X^n = X * X^n-1
     *
     * Stopping criteria:
     * n^0 = 1
     * exp == 0
     */
    if (exp == 0) {
        return 1
    }

    /**
     * Constraint: exp > 0
     */
    if (exp < 0) {
        return -1
    }

    return base * power(base, exp - 1)
}

