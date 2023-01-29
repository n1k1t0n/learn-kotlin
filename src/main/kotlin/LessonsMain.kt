import lessons.lesson7.House
import java.time.LocalDate

//fun main(args: Array<String>) {
fun main1() {
//    less5(arrayOf(7, -4, 8, -2, 0, 4, 15, -9, 3))
//    Lesson6().less6_3()
    val oldHouse = House(3, LocalDate.of(1893, 12, 8))
    oldHouse.getInfo()
    oldHouse.name = "Old mansion"
    oldHouse.getInfo()
    var age = oldHouse.getAge()
    println("Total house age: $age years")

    val newHouse = House()
    newHouse.name = "SkyScraper"
    newHouse.floors = 100
    newHouse.builtIn = LocalDate.of(2013, 1, 2)
    age = newHouse.getAge()
    println("Total house age: $age years")
}

fun less2() {
    val int1 = 5
    val int2 = 17
    println(int1 + int2)
    println(int1 - int2)
    println(int1 * int2)
    println(int2 / int1)
}

fun less3(a: Int, b: Int) {
    if (a % 2 == 0) {
        println(a)
    } else {
        println(b)
    }

    val new: Int = if (a != b) 3 else 5

    when (new) {
        3 -> println("Three")
        5 -> println("Five")
        else -> println("Something")
    }

    if ((b < 8 && b != 5 && b > 2) ||
        b == -1
    ) {
        println("Gotcha!")
    }
}

fun less4_1(a: Int, b: Int): Char {
    if (a > b) {
        return '>'
    } else if (a < b) {
        return '<'
    } else {
        return '='
    }
}

fun less4_2(a: Int, b: Int, c: Int): Int {
    if (b == 0 || c == 0) {
        println("Zero division!")
        return 0
    }
    return a / b / c
}

fun less5(array: Array<Int>) {
    var max = array[0]
    var min = array[0]
    var negSum = 0
    println("Array:")
    array.forEachIndexed {idx, num ->
        print("[$idx]: $num; ")
        if (max < num)
            max = num
        if (min > num)
            min = num
        if (num < 0) {
            negSum += num
        }
    }
    println("\nMAX: $max")
    println("MIN: $min")
    println("NEG SUM: $negSum")
}

fun less6() {
    for (i in 0..5 step 2)
        println("$i")

    for(el in 'z' downTo 'a' step 5) {
        println(el)
    }

    val x = 20
    if(x in 5..30) {
        println("Variable: $x")
    }

    val names = arrayOf("Bob", "John", "Alex", 1, true)
    printSome()
    printSome(word = arrayOf("Hi"))
    printSome(word = arrayOf("Hi"), item = "Some")
    printSome("Hi", "Some", "hello")
    printSome("Hi", *names)
}

fun printSome(item: String = "Default item", vararg word: Any = arrayOf("Default word")) {
    print("$item: ")
    word.forEach { el -> print("$el ") }
    println()
}
