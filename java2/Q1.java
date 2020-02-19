//1. Create Java classes having suitable attributes for Library management system.
// Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
package java2;
import java.io.*;
public enum BookStatus

{

    AVAILABLE,

    NOTAVAILABLE

}

public enum AccountStatus{

    ACTIVE,

    CLOSED

}

    Person Class

public class Person {

    private String name;

    private String phone;

}

    Account Class

public abstract class Account

{

    private String id;

    private String password;

    private AccountStatus status;

    private Person person;

}

    Librarian Class

public class Librarian extends Account {

    public void addBookItem();

    Public void removeBookItem();

}

MemberClass

public class Member extends Account

{

    private int totalBooksIssued;

    public void getTotalBooksIssued();

    public void IssueBooks();

    public void returnBooks();

    private void checkForFine();

}




public  class BookIssue {

    private String memberId;

    public static getIssueDetails();

}

    Fine Class

public class Fine

{

    private String creationDate;

    private String bookname;

    private String memberId;

    public static void collectFine()

}

    Book Class

public abstract class Book {



    private String title;

    private String subject;

    private String publisher;



}

public class Books extends Book {

    private float price;

    private BookStatus status;

    public void checkoutBook();

}
public class Q1 {
    public static void main(String[] args) {

    }

}

