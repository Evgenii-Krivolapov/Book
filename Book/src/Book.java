public class Book {

    private final String nameBook;
    private final String author; 
    private final int amount; 
    private final long number; 

    public Book (String nameBook, String author, int amount, int number) {
        this.nameBook = nameBook;
        this.author = author;
        this.amount = 256;
        this.number = 9780345342966L;
    }
    public String getNameBook () {
        return nameBook;
    }
    public String getAuthor () {
        return author;
    }
    public int getAmount () {
        return amount;
    }
    public long getNumber () {
        return number;
    }
}
