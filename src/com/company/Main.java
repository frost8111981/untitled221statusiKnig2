package com.company;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings",Status.AVAILABLE);
        FromAvailableStatusMover fromAvailableStatusMover = new FromAvailableStatusMover();
        FromArchievedStatusMover fromArchievedStatusMover = new FromArchievedStatusMover();
        FromBorrowedStatusMover fromBorrowedStatusMover = new FromBorrowedStatusMover();

        fromAvailableStatusMover.moveToStatus(book,Status.AVAILABLE);
        fromAvailableStatusMover.moveToStatus(book,Status.ARCHIVED);

        fromArchievedStatusMover.moveToStatus(book,Status.AVAILABLE);

        fromBorrowedStatusMover.moveToStatus(book,Status.BORROWED);
        fromBorrowedStatusMover.moveToStatus(book,Status.BORROWED);


    }
}
