package Books;

import enums.Genre;

import java.util.UUID;

public class Book extends Item {

    public Book(String BookTitle, String BookAuthor, Genre genre){
        super(BookTitle,BookAuthor,genre,true);
    }

}
