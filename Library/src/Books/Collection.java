package Books;

import enums.Genre;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public List<Item> allBooks;
    public List<Item> allComics;
    public List<Item> allMagazines;

    public Collection() {
        this.allBooks = new ArrayList<>();
        this.allComics = new ArrayList<>();
        this.allMagazines = new ArrayList<>();
    }


    public void addBookToCollection(Item bookItem) {
        this.allBooks.add(bookItem);
    }
    public void addComicToCollection(Item comicItem) {
        this.allComics.add(comicItem);
    }
    public void addMagazineToCollection(Item magazine) {
        this.allMagazines.add(magazine);
    }

    public List<Item> filterByGenre(Genre genre) {
        List<Item> itemsOfGenre = new ArrayList<>();
        for(Item item : allBooks) {
            if(item.getGenre().equals(genre) && item.isAvailable()) {
                itemsOfGenre.add(item);
            }
        }
        for(Item item : allComics) {
            if(item.getGenre().equals(genre) && item.isAvailable()) {
                itemsOfGenre.add(item);
            }
        }
        for(Item item : allMagazines) {
            if(item.getGenre().equals(genre) && item.isAvailable()) {
                itemsOfGenre.add(item);
            }
        }
        return itemsOfGenre;
    }
    public List<Book> filterBooksByAuthor(String author) {
        List<Book> books = new ArrayList<>();
        for(Item book : allBooks) {
            if(book.getBookAuthor().trim().equalsIgnoreCase(author.trim()) && book.isAvailable()) {
                books.add((Book) book);
            }
        }
        return books;
    }
    public List<Book> filterBooksByTitle(String title) {
        List<Book> books = new ArrayList<>();
        for(Item book : allBooks) {
            if(book.getBookTitle().trim().toLowerCase().equals(title.trim().toLowerCase()) && book.isAvailable()) {
                books.add((Book) book);
            }
        }
        return books;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "allBooks=" + allBooks +
                ", allComics=" + allComics +
                ", allMagazines=" + allMagazines +
                '}';
    }
}
