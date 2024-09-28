fun main() {
    print(isValid("]"))
}

fun isValid(s: String): Boolean {
    val charArr = s.toCharArray()
    val stack = Stack<Char>()

    for (c in charArr) {
        if (c == '{' || c == '(' || c == '[') {
            stack.push(c)
        } else if (c == '}' && stack.isNotEmpty() && stack.peek() == '{') {
            stack.pop()
        } else if (c == ']' && stack.isNotEmpty() && stack.peek() == '[') {
            stack.pop()
        } else if (c == ')' && stack.isNotEmpty() && stack.peek() == '(') {
            stack.pop()
        } else {
            return false
        }
    }
    return stack.isEmpty()
}

