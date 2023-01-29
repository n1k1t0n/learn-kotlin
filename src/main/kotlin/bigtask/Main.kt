import bigtask.Author
import bigtask.Book

fun main(args: Array<String>) {
    val book1 = Book("War&Peace", 3082, 0.7f)
    val author1 = Author("Lev Tolstoy")
    author1.addBook(book1)
    print(author1.toString())
}


