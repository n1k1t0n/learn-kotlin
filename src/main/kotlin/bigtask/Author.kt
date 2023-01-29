package bigtask

class Author(private val name: String, private val books: MutableList<Book> = ArrayList()) {

    fun addBook(book: Book) {
        books.add(book)
    }

    override fun toString(): String {
        var booksStr = ""
        books.forEach {book ->
            booksStr += "$book;\n"
        }
        return "Author's name: $name\nBooks:\n$booksStr"
    }

}