package org.example;
import java.util.*;
public class ChatServer {
    private Map<String, User> users;
    private Map<User, ChatHistory> chatHistories;
    private Map<User, String> blockedUsers;

    public ChatServer(){
        this.users = new HashMap<>();
        this.chatHistories = new HashMap<>();
        this.blockedUsers = new HashMap<>();
    }

    public void registerUser(User user){
        users.put(user.getUsername(), user);
        chatHistories.put(user, new ChatHistory());
    }

    public void sendMessage(User sender, List<String> recipients, String content){
        Message message  = new Message(sender.getUsername(), recipients, content);
        for(String recipient : recipients){
            if(!blockedUsers.containsKey(users.get(Recipients))){
                users.get(recipient).recieveMessage(message);
                chatHistories.get(users.get(recipient)).addMessage(message);
            }
        }
    }

    public void undoLastMessage(User user){
        chatHistories.get(user).undoLastMessage();
    }

    public void blockUser(User user){

    }


}
