package com.company;

public class FromBorrowedStatusMover extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
//        if (book.getStatus() == requestedStatus) {
//            System.out.println("Книга " + book.getName() + " уже находится в статусе " + book.getStatus());
//        } else {
//            book.setStatus(requestedStatus);
//            System.out.println("Книга " + book.getName() + " переведена в статус " + book.getStatus());
//        }

        if(book.getStatus() == Status.BORROWED){
            switch (requestedStatus){
                case AVAILABLE:
                case ARCHIVED:
                    book.setStatus(requestedStatus);
                    System.out.println("Книга переведена в статус - " + book.getStatus());
                    break;
                default:
                    System.out.println("Книга уже находится в этом статусе!");
            }
        }
    }
}
