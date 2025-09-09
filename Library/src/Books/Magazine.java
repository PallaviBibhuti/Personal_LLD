package Books;

import enums.Genre;

import java.util.UUID;

public class Magazine extends Item {
    public String magazineItemId;

    public Magazine(String BookTitle, String BookAuthor, Genre genre){
        super(BookTitle,BookAuthor,genre,true);
    }
}
