package org.example;
import java.util.*;
public class ChatHistory {
    private Stack<String> messages;
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
    public Iterator<Message> iterator(){
        return messages.iterator();
    }
}
