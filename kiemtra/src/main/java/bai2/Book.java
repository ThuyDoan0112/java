
package bai2;


public class Book extends Document{
    private int numberOfPage;
    private String author;

    public Book(int numberOfPage, String author) {
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public Book() {
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    
}
