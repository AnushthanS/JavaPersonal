package Problems;

import java.time.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex7 {
    //Create a library management system which is capable of issuing books to the students. Book should have info like :
     /* 1.  Book Name
        2.  Book Author
        3.  Issued to
        4.  Issued on
        User should be able to add books, return issued books, issue books.
        Assume that all the users are registered with their names in the central database.
    */

    /*
     * Add books like <name>, <author>, <status>
     Eg-- Chainsaw Man, Tatsuki Fujimoto, Available
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        List<Book> bookList=new ArrayList<>();
        //Adding books to the library
        while(t-->0){
            StringTokenizer st=new StringTokenizer(sc.nextLine(),", ",false);
            bookList.add(new Book(st.nextToken(), st.nextToken(), st.nextToken()));
        }
        while(true){
            System.out.println( "1 - check book availability\n" +
                                "2 - issue book if available\n" +
                                "3 - get book info\n" +
                                "0 - list of all books");
            int choice=sc.nextInt();
            LibraRY library=new LibraRY();
            switch(choice){
                case 0->{library.listAllBooks(bookList);}
                case 1->{
                    String query= sc.nextLine().trim();
                    library.checkBookAvailability(query,bookList);
                }
                case 2->{}
                case 3->{}
                default-> System.out.println("Enter a valid choice");
            }
        }
    }
}

class LibraRY{

    static void checkBookAvailability(String query,List<Book> bookList){
        boolean flag=false;
        for(Book e: bookList){
            if(query.trim().equalsIgnoreCase(e.getName())){
                flag=true;
                if(e.status.equalsIgnoreCase("available")){
                    System.out.println(e.getName()+" by "+e.getAuthor()+" is available to borrow");
                }
                else if(e.status.equalsIgnoreCase("unavailable")){
                    System.out.println("Book has already been issued on "+ e.issuedOn+" to "+e.issuedTo);
                }
            }

        }
         if(!flag) {
            System.out.println("No such book exists");
        }
    }

    static void listAllBooks(List<Book> bookList){
        for(Book e: bookList){
            System.out.println(e.toString());
        }
    }
}

class Book{
    String name, author, issuedOn, issuedTo, status;
    Book(String name, String author, String status){
        this.name=name; this.author=author; this.status=status;
    }

    public void setIssuedOn(){
        Instant i= Instant.now();
        this.issuedOn= i.toString();
    }

    public void setIssuedTo(String issuedTo){
        this.issuedTo=issuedTo;
    }
    public String getIssuedTo(){
        return issuedTo;
    }

    public String getIssuedOn(){
        return issuedOn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getStatus() {
        return status;
    }

    public String toString(){
        return name+", "+author;
    }
}