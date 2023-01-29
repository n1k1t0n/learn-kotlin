package lessons.lesson7

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class House(var name: String = "NO NAME", var floors: Int?, var builtIn: LocalDate?) {

    constructor(): this(floors = null, builtIn = null)
    constructor(_floors: Int?, _builtInt: LocalDate?): this(floors = _floors, builtIn = _builtInt)

    fun getInfo() {
        println("House $name with $floors floors, built in $builtIn")
    }

    fun getAge(): Long {
        return ChronoUnit.YEARS.between(builtIn, LocalDate.now())
    }

}