package bigtask

class Book(private val name: String, private val pages: Int, condition: Float) {

    private val condition: Float

    init {
        this.condition = if(condition < 0 || condition > 1) 1f else condition
    }

    fun printName() {
        println(name)
    }

    override fun toString(): String {
        return "Book name: $name, pages: $pages, condition: $condition"
    }

}