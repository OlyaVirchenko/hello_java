package gettters_setters;

public class ClassAccount {
    private long balance;
    private String ownerName;
    private boolean locked;

    public long getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}

//class Book {
//
//    private String title;
//    private int yearOfPublishing;
//    private String[] authors;
//
//    public String getTitle() {
//        return title;
//    }
//
//    public int getYearOfPublishing() {
//        return yearOfPublishing;
//    }
//
//    public String[] getAuthors() {
//        return authors;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setYearOfPublishing(int yearOfPublishing) {
//        this.yearOfPublishing = yearOfPublishing;
//    }
//
//    public void setAuthors(String[] authors) {
//        this.authors = authors;
//    }
//}
