package Books;

import enums.Genre;

import java.util.UUID;

public abstract class Item {

    private String itemId;
    private String bookTitle;
    private String bookAuthor;

    public String getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    private Genre genre;
    private boolean isAvailable;

    public Item(String bookTitle, String bookAuthor, Genre genre, boolean isAvailable) {
        this.itemId = UUID.randomUUID().toString();
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", genre=" + genre +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
