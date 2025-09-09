package Users;

import java.time.LocalDate;
import java.util.UUID;

public class Receipt {
    private String receiptId;
    private String userId;
    private String bookId;
    private LocalDate issueDate;
    private LocalDate returnDate;

    public Receipt(String userId, String bookId) {
        this.receiptId = UUID.randomUUID().toString();
        this.userId = userId;
        this.bookId = bookId;
        this.issueDate = LocalDate.now();
        this.returnDate = null;
    }

    public String getUserId(){
        return userId;
    }
    public String getBookId() {
        return bookId;
    }
    public String getReceiptId() {
        return receiptId;
    }
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
    public LocalDate getIssueDate() {
        return this.issueDate;
    }
    public LocalDate getReturnDate() {
        return this.returnDate;
    }
}
