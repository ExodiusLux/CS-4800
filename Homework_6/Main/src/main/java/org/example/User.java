package org.example;
import java.util.*;
public class User {
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
        System.out.println("[" + message.getTimestamp() + "] " + message.getSender());
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
}
