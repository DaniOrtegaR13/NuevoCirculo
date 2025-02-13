package es.uah.matcomp.mp.e1.ejerciciosclases.e1b.AuthorBookOne;
// 2.3
public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    //
    public String getAuthorName() {
        return author.getName();
    }



    @Override

    public String toString() {
        StringBuilder authorDetails = new StringBuilder();

            authorDetails.append(" Author[name= ").append(author.getName())
                    .append(" email= ").append(author.getEmail())
                    .append("]");

        return "Book[ isbn = " + isbn + "name= " + name + authorDetails + " price= " + price + " qty= " + qty + "]";
    }
}


