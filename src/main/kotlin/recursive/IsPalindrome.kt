package recursive

fun main() {
    println(isPalindrome("foobar"))
    println(isPalindrome("foooof"))
    println(isPalindrome("sukus"))
    println(isPalindrome("aiueo"))
}

fun isPalindrome(s: String): Boolean {

    if (s.isEmpty() || s.length == 1) {
        return true
    }

    if (s[0] == s[s.length-1]) {
        val trimmedString = s.substring(1, s.length - 1)
        return isPalindrome(trimmedString)
    }

    return false
}
