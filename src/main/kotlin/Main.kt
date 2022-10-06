import java.util.Scanner

fun main() {
    // комментарий
    /*
    Многострочный
     */
    println("Hello World!")
    val a: Int = 100 // value - immutable variable
   // a = 200
    var b = 200   // mutable variable
    b = 300

    val a1: Byte = -10
    val b1: Short = 45
    var c1: Int = -250
    val d1: Long = 3000L

    var h: Double = 4.5
    val f: Float = 4.5F

    val flag: Boolean = true // false
    val ch: Char = 'A'
    val name = "Ivan"
    val lastname = "Ivanov"

    c1 = d1.toInt()
    h = f.toDouble()

    println("$name $lastname")
    println("")

    val x1 = 11
    val y1 = 5
    val z1 = x1/y1 // 2

    println(name::class)

    val x2 = 11
    val y2 = 5.0
    val z2 = x2/y2 // 2.2

    // % - остаток от деления
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()

    val v = readLine()?.toInt()
    val vv = readln().toInt()

    val(p1,p2) = readln().split(" ").map{ it.toInt() }

    // NPE - Null Pointer Exception
    var str: String = "abc"
    //str = null

    var str2: String? = "abc"
    str2 = null
    var l = if(str2 != null) str2.length else -1
    println(str2?.length) // ?. - оператор безопасного вызова
    var l2 = str2?.length ?: -1 // elvis expression

    var w1 = 5     // 6
    var w2 = ++w1  // 6

    var w3 = 5      // 6
    var w4 = w3++   // 5

    val g = 10
    if(g == 10) {
        println("10")
    } else if(g == 8) {

    } else {

    }
    val s = 10
    val p = 20
    val result = if(s > p) {
        println("s>p")
        s
    } else {
        println("p!!!")
        p
    }
    // < > != ==
    // and or
    // тип логической операции in
    val q = 5
    val r1 = q in 1..6 // [1,6] true or false
    var r2 = q !in 100 downTo 1 // true or false

    when(flag) {
        false -> println("")
        true -> {
            // логика
        }
        else -> println()
    }
    var m = 10
    when (m) {
       10,20,30 -> println("or")
       else -> println("")
    }
    when(m) {
        in 10..19 -> println()
        in 20..29 -> println()
        !in 10..20 -> println()
    }
    val j = 10
    val i = 5
    val ii = 3
    when(j+ii) {
        i-ii -> println("i-ii")
        i+100 -> println("")
    }
    val sum = 1000
    val rate = when(sum) {
        in 100..999 -> 10
        in 1000..100_000 -> 20
        else -> 80
    }
    val k1 = 15
    val k2 = 6
    when {
        (k1 > 10) -> println()
        (k2 < 5) -> {
            // логика
        }
    }

    when(val kk = k1+k2) {
        1000 -> println()
        2000 -> {
            // логика
        }
    }

}