import java.util.List;

class LibraryManagementSystem {
    String userType;
    String username;
    String password;

    public LibraryManagementSystem(String userType, String username, String password) {
        this.userType = userType;
        this.username = username;
        this.password = password;
    }

    public void login() {}
    public void register() {}
    public void logout() {}
}

class User {
    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void verify() {}
    public void checkAccount() {}
}

class Student extends User {
    String studentClass;

    public Student(String name, int id, String studentClass) {
        super(name, id);
        this.studentClass = studentClass;
    }
}

class Staff extends User {
    String dept;

    public Staff(String name, int id, String dept) {
        super(name, id);
        this.dept = dept;
    }
}

class Librarian {
    String name;
    int id;
    String password;
    String searchString;

    public Librarian(String name, int id, String password, String searchString) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.searchString = searchString;
    }

    public void verifyLibrarian() {}
    public void search() {}
}

class Book {
    String title;
    String author;
    String ISBN;
    String publication;

    public Book(String title, String author, String ISBN, String publication) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication = publication;
    }

    public void showDueDt() {}
    public void reservationStatus() {}
    public void feedback() {}
    public void bookRequest() {}
    public void renewInfo() {}
}

class Account {
    int noBorrowedBooks;
    int noReservedBooks;
    int noReturnedBooks;
    int noLostBooks;
    double fineAmount;

    public Account(int noBorrowedBooks, int noReservedBooks, int noReturnedBooks, int noLostBooks, double fineAmount) {
        this.noBorrowedBooks = noBorrowedBooks;
        this.noReservedBooks = noReservedBooks;
        this.noReturnedBooks = noReturnedBooks;
        this.noLostBooks = noLostBooks;
        this.fineAmount = fineAmount;
    }

    public void calculateFine() {}
}

class LibraryDatabase {
    List<Book> listOfBooks;

    public LibraryDatabase(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void add() {}
    public void delete() {}
    public void update() {}
    public void display() {}
    public void search() {}
}
