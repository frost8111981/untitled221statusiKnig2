package com.company;

public class FromArchievedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == requestedStatus) {
            System.out.println("Книга " + book.getName() + " уже находится в статусе " + book.getStatus());
        } else {
            book.setStatus(requestedStatus);
            System.out.println("Книга " + book.getName() + " переведена с статус " + book.getStatus());
        }
    }
}
