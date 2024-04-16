package org.example;
import java.util.*;
public class User implements IterableByUser{
    private String username;
    private ChatServer chatServer;

    public User (String username, ChatServer chatServer){
            this.username = username;
            this.chatServer = chatServer;
    }

    public void sendMessage(List<String> recipient, String content){
        chatServer.sendMessage(this, recipient, content);
    }

    public void receiveMessage(Message message){
        System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + " has sent a message to " + message.getRecipients());
    }

    public void undoLastMessage() {
        chatServer.undoLastMessage(this);
    }

    public void blockUser(String username){
        chatServer.blockUser(this, username);
    }

    public String getUsername(){
        return username;
    }
    @Override
    public Iterator<Message> iterator(User userToSearchWith) {
        return chatServer.getChatHistory(this).iterator(userToSearchWith);
    }

}
