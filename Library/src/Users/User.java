package Users;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    private String userId;
    private String userName;
    private List<Receipt> receipts;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        receipts = new ArrayList<>();
    }

    public void addReceipt(Receipt receipt){
        this.receipts.add(receipt);
    }
    public void removeReceipt(Receipt receipt){
        this.receipts.remove(receipt);
    }
    public List<Receipt> getReceipts() {
        return this.receipts;
    }
}
