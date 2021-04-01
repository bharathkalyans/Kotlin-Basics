package telusko

import java.awt.print.Book

fun main(args : Array<String>){


    BookShelf.books.add(Books("Java",1111))
    BookShelf.books.add(Books("Kotlin",1201))
    BookShelf.showBook()
}


data class Books (var name: String,var price : Int)

object BookShelf{ //No need to create a Object this BookShelf itself is a Object
    var books = arrayListOf<Books>()


    fun showBook(){
        for (i in books){
            println(i)
        }
    }
}