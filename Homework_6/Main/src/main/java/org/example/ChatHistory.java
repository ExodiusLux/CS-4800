package org.example;
import java.util.*;
public class ChatHistory implements IterableByUser {
    private Stack<Message> messages;
    public ChatHistory(){
        this.messages = new Stack<>();
    }

    public void addMessage(Message message){
        messages.push(message);
    }

    public Message getLastMessage(){
        if(!messages.isEmpty()){
            return messages.peek();
        }
        return null;
    }

    public void undoLastMessage(){
        if(!messages.isEmpty()){
            messages.pop();
        }
    }
    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return new SearchMessagesByUser(messages.iterator(), userToSearchWith.getUsername());
    }
}
