package cWH;

class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books=new String[50];
        no_of_books=0;
    }

    void addBook(String book){
        this.books[no_of_books++]=book;
        System.out.println(book+" has been added!");
    }

    void showAvailableBooks(){
        System.out.println("The following titles are available:");
        for(String el: this.books){
            if (el==null){
                continue;
            }
            else System.out.println("* "+el);
        }
    }

    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]==book){
                System.out.println(book+ " has been issued!");
                this.books[i]=null;
            }
        }
    }

    void returnBook(String book){
        addBook(book);
    }

}

public class Ex4 {
    public static void main(String[] args) {
        Library solution = new Library();
        solution.addBook("3 days of happiness");
        solution.addBook("Chainsaw man");
        solution.addBook("Ikigai");
        solution.addBook("March comes in like a lion");
        solution.showAvailableBooks();
        solution.issueBook("3 days of happiness");
        solution.showAvailableBooks();
        solution.returnBook("3 days of happiness");
        solution.showAvailableBooks();
    }
}
