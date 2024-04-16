package org.example;
import java.util.*;
public class SearchMessagesByUser implements Iterator<Message> {
    private Iterator<Message> iterator;
    private String username;

    public SearchMessagesByUser(Iterator<Message> iterator, String username){
        this.iterator = iterator;
        this.username = username;
    }

    @Override
    public boolean hasNext(){
        return iterator.hasNext();
    }

    @Override
    public Message next(){
        Message message = iterator.next();
        while(!message.getSender().equals(username) && !message.getRecipients().contains(username)){
            if(!iterator.hasNext()){
                throw new NoSuchElementException();
            }
            message = iterator.next();
        }
        return message;
    }

}
