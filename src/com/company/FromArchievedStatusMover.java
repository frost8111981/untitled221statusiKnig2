package com.company;

public class FromArchievedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
//        if (book.getStatus() == requestedStatus) {
//            System.out.println("Книга " + book.getName() + " уже находится в статусе " + book.getStatus());
//        } else {
//            book.setStatus(requestedStatus);
//            System.out.println("Книга " + book.getName() + " переведена в статус " + book.getStatus());
//        }

        if(book.getStatus() == Status.ARCHIVED){
            if (requestedStatus == Status.AVAILABLE) {
                book.setStatus(requestedStatus);
                System.out.println("Книга переведена в статус - " + book.getStatus());
            } else {
                System.out.println("Книга уже находится в этом статусе или перевод возможен только в AVAILABLE!");
            }
        }
    }
}
