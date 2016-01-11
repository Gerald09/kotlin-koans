package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

fun todoTask1(collection: Collection<Int>): Nothing = TODO(
        """
        Task 1.
        Rewrite JavaCode1.task1 in Kotlin.
        In IntelliJ, you can just copy-paste the code and agree to automatically convert it to Kotlin,
        but only for this task!
    """,
        references = { JavaCode1().task1(collection) })


fun task1(collection: Collection<Int>): String {
    var sb: StringBuilder = StringBuilder()
    sb.append("{")
    collection.forEach {
        sb.append(it)
        sb.append(",")
    }
    if (sb.length > 1) {
        sb.deleteCharAt(sb.length - 1)
    }
    sb.append("}")
    return sb.toString()
}
