import java.io.File
import java.io.FileInputStream
import java.util.*

fun main(args: Array<String>) {

    // write your code here
    val file = File("sample.txt")
    val sc = Scanner(FileInputStream(file))
    var count = 0
    while (sc.hasNext()) {
        sc.next()
        count++
    }
    println("Number of words: $count")
}