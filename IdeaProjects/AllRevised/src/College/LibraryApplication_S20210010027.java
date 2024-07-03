package College;
class Book{
    private String title;
    private String author;
    private String ISBN;
    private int copiesAvailable;
    private int copiesIssued;

    public Book() {
        // Use of this keyword to set details of the current object
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.copiesIssued = 0;
        this.copiesAvailable = 0;
    }

    public Book(String title) {
        // Use of this keyword to call a constructor coded above
        this();
        this.title = title;
    }

    public Book(String title, String author, String ISBN) {
        this(title);
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public int getCopiesIssued() {
        return copiesIssued;
    }

    public void setCopiesIssued(int copiesIssued) {
        this.copiesIssued = copiesIssued;
    }

    public void printBookDetails(){
        System.out.println("Title :    "+ getTitle());
        System.out.println("Author:    "+ getAuthor());
        System.out.println("ISBN  :    "+ getISBN());
        System.out.println("Copies Available : "+ getCopiesAvailable());
        System.out.println("Copies Issued    : "+ getCopiesIssued());
    }


    public void printUpperCase(){
        System.out.println("Title :    "+ getTitle().toUpperCase());
        System.out.println("Author:    "+ getAuthor().toUpperCase());
        System.out.println("ISBN  :    "+ getISBN());
        System.out.println("Copies Available : "+ getCopiesAvailable());
        System.out.println("Copies Issued    : "+ getCopiesIssued());
    }

    public void updateBookName(String old, String replacement){
        if(getTitle().toLowerCase().contains(replacement.toLowerCase())){
            setTitle(getTitle().replace(old, replacement));
        }
    }

    public void searchBook(String input){
        if(getTitle().toLowerCase().contains(input.toLowerCase())) {
            printBookDetails();
        }
    }

    public void issueBook(){
        if(getCopiesAvailable() > 0){
            System.out.println("Issued "+getTitle());
            setCopiesIssued(getCopiesIssued() + 1);
            setCopiesAvailable(getCopiesAvailable() - 1);
        } else System.out.println("No copies available for the selected book");
    }
    public void returnBook(){
        if(getCopiesIssued() > 0){
            System.out.println(getTitle()+" returned");
            setCopiesAvailable(getCopiesAvailable() + 1);
            setCopiesIssued(getCopiesIssued() - 1);
        } else System.out.println("No copies issued for "+getTitle());
    }

    public boolean addBook(String title, String author, String ISBN, int copiesAvailable, int copiesIssued) {
        if(getTitle().toLowerCase().contains(title.toLowerCase())){
            setCopiesAvailable(getCopiesAvailable() + 1);
            return false;
        } else {
            setTitle(title);
            setAuthor(author);
            setISBN(ISBN);
            setCopiesAvailable(copiesAvailable);
            setCopiesIssued(copiesIssued);
        }
        return true;
    }
}

public class LibraryApplication_S20210010027 {
    static Book book1, book2, book3, book4;

    static void showBooks(){
        String[] bookList = {book1.getTitle(), book2.getTitle(), book3.getTitle(), book4.getTitle()};

        for(int i = 0; i< bookList.length; i++){
            boolean swapped=false;
            for(int j = 1; j< bookList.length - i; j++){
                if(bookList[j].compareToIgnoreCase(bookList[j-1]) < 0){
                    String temp = bookList[j];
                    bookList[j] = bookList[j-1];
                    bookList[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
        System.out.println("Names of books in ascending order:");
        for(String book: bookList){
            System.out.println(book);
        }
    }
    public static void main(String[] args) {
        boolean flag2;
        book1 = new Book();
        book1.addBook("The deathly Hallows", "J.K. Rowling", "1231231232", 10, 0);

        book1.updateBookName("deathly", "Deathly");

        book2 = new Book("The Half-Blood Prince");
        book2.setAuthor(book1.getAuthor());
        book2.setISBN("2122212122312");
        book2.setCopiesIssued(0);
        book2.setCopiesAvailable(10);

        book3 = new Book("The Murder on the Orient Express", "Agatha Cristie", "43321091932");
        book3.setCopiesAvailable(5);

        book4 = new Book();
        book4.addBook("The Turn of the Screw", "Henry James", "12341010102121", 10, 0);

        showBooks();
        System.out.println();

        flag2 = book4.addBook("Turn of the Screw", "H. James", "12341010102121", 1, 0);
        if(!flag2){
            System.out.println("Available copies for "+book4.getTitle()+" increased to "+book4.getCopiesAvailable());
        }

        book1.issueBook();
        book2.returnBook();

        book3.printUpperCase();
        System.out.println();
        book4.printBookDetails();
        System.out.println();

        //search
        Book[] list = {book1, book2, book3, book4};
        for(Book book: list){
            book.searchBook("Hallows");
        }
    }
}
