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
public class Book {
    private String isbn;
    private String name;
    private Author author; // Composition: a Book has an Author
    private double price;
    private int qty = 0;

    // Constructor
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getters
    
    public String getIsbn(){
        return isbn;
    }
    
    public String getName(){
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty(){
        return qty;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String getAuthorName(){
        return author.getName();
    }

    // toString
    public String toString() {
        return "Book" + "\nISBN: "+ isbn +"\nName: "+ name + "\nPrice: "+ price +"\nStock: "+ qty + ".\n" + author.toString();
    }
}
