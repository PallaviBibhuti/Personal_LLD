import Books.Item;
import Books.Book;
import Library.LibraryManager;
import Users.Receipt;
import Users.User;
import enums.BookType;
import enums.Genre;

import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.addUser("123", "Pallavi");
        libraryManager.addUser("234", "BabyParmeshwar");
        libraryManager.addItem(BookType.Book,"Harry puttar","Pollobi",Genre.Fiction,3);
        libraryManager.addItem(BookType.Comic,"Batman","Nolan",Genre.Mystery,1);
        libraryManager.addItem(BookType.Book,"Harry puttar 2","PollobiSharma",Genre.Smut,3);

        Map<String,User> users = libraryManager.getUsers();
        users.forEach((s, user) -> {System.out.println(s); System.out.println(user.getUserName());});
        users.forEach((s, user) -> {System.out.println(s); System.out.println(user.getUserName());});

        libraryManager.showAllItems();
        Receipt receipt1 = libraryManager.rentItem("123","Harry puttar");
        System.out.println(receipt1.getReceiptId());
        Receipt receipt2 = libraryManager.rentItem("123","Harry puttar");
        System.out.println(receipt2.getReceiptId());
        Receipt receipt3 = libraryManager.rentItem("123","Harry puttar");
        System.out.println(receipt3.getReceiptId());
        Receipt receipt4 = libraryManager.rentItem("123","Harry puttar");
        int cost = libraryManager.returnItem("123",receipt1.getReceiptId());
        int cost2 = libraryManager.returnItem("123",receipt2.getReceiptId());
        int cost3 = libraryManager.returnItem("123",receipt3.getReceiptId());
        System.out.println(cost);
    }
}