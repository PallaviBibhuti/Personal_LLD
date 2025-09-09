package Library;

import Books.Book;
import Books.Collection;
import Books.Item;
import Books.ItemFactory;
import Users.Receipt;
import Users.User;
import enums.BookType;
import enums.Genre;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryManager {
    public Map<String, User> getUsers() {
        return users;
    }

    public Collection getCollection() {
        return collection;
    }

    Map<String,User> users = new HashMap<>();
    Collection collection = new Collection();

    public void addUser(String id, String name) {
        User user = new User(id, name);
        users.put(user.getUserId(),user);
    }
    public void addItem(BookType bookType, String bookTitle, String bookAuthor, Genre genre, int copies) {
        for(int i = 0; i < copies; i++){
            Item item = ItemFactory.CreateItem(bookType, bookTitle, bookAuthor, genre);
            switch (bookType) {
                case Book -> {
                    collection.addBookToCollection(item);
                    break;
                }
                case Comic -> {
                    collection.addComicToCollection(item);
                    break;
                }
                case Magazine -> {
                    collection.addMagazineToCollection(item);
                    break;
                }
            }
        }
    }
    public Receipt rentItem(String userId, String bookTitle){
        List<Book> books = collection.filterBooksByTitle(bookTitle);
        if(books.isEmpty()){System.out.println("No books in collection");
        return null;}
        Receipt receipt = new Receipt(userId, books.getFirst().getItemId());
        books.getFirst().setAvailable(false);
        users.get(userId).addReceipt(receipt);
        return receipt;
    }

    public int returnItem(String userId, String receiptId){
        List<Receipt> receipts = users.get(userId).getReceipts();
        int cost = 0;
        for(Receipt receipt : receipts){
            if(receipt.getReceiptId().equals(receiptId)){
                receipt.setReturnDate(LocalDate.now().plusDays(3));
                int duration = receipt.getReturnDate().getDayOfYear() -receipt.getIssueDate().getDayOfYear();
                cost = duration * 20;
            }
        }
        return cost;
    }
    public void showAllItems(){
        System.out.println(collection.toString());
    }
}
