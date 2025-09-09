package Books;

import enums.Genre;

import java.util.UUID;

public class Comic extends Item {

    public Comic(String BookTitle, String BookAuthor, Genre genre){
        super(BookTitle,BookAuthor,genre,true);
    }

}
