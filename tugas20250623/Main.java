/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas20250623;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Marcus Aurelius", "marcus@gmail.com");
        Book book = new Book("80001","Stoicism", author, 90000, 20);

        System.out.println(book.toString());
    }
}

