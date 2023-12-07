package org.example.lambda.book;

import java.util.List;

public class BookService {

    public static void main(String[] args) {
        BookService bookService = new BookService();
        List<Book> bookList = bookService.getBooksSortedByName();
        System.out.println(bookList);
    }

    public List<Book> getBooksSortedByName() {
        List<Book> books = new BookDAO().getBooks();
//        books.sort(new MyComparator());

        //without lambda expression

        /*books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        //with lambda expression
        books.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        return books;
    }

   /* static class MyComparator implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }*/

}
