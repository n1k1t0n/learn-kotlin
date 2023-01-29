package lessons

import java.util.*

class Lesson6 {

    fun less6_1() {
        for (num in 10 .. 20) {
            println(num*num)
        }
    }

    fun less6_2() {
        val scanner = Scanner(System.`in`)
        var next = 0
        do {
            println("Please, enter 10")
            next = scanner.nextInt()
        } while (next != 10)
        println("Thank you!")
    }

    fun less6_3() {
        println("For loop:")
        for (num in -7 .. 12 step 3) {
            if (num !in arrayOf(-1, 5, 11)) {
                println(num)
            }
        }
        println("While loop:")
        var num = -7
        while (num < 12) {
            if (num !in arrayOf(-1, 5, 11)) {
                println(num)
            }
            num += 3
        }
    }

}