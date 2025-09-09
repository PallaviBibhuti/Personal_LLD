package Books;

import enums.BookType;
import enums.Genre;

public class ItemFactory {
    public static Item CreateItem(BookType BookType, String BookTitle, String BookAuthor, Genre genre){
        Item item = null;
        switch(BookType){
            case Book: {
                item = new Book(BookTitle, BookAuthor, genre);
                break;
            }
            case Magazine: {
                item = new Magazine(BookTitle, BookAuthor, genre);
                break;
            }
            case Comic: {
                item = new Comic(BookTitle, BookAuthor, genre);
                break;
            }
            default : throw new IllegalArgumentException("Illegal Book Type");
        }
        return item;
    }
}
