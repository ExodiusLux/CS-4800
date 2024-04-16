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
            User recipientUser = users.get(recipient);
            if(recipientUser != null && !blockedUsers.containsKey(recipientUser)) {
                recipientUser.receiveMessage(message);
                chatHistories.get(recipientUser).addMessage(message);
            }
            else{
                System.out.println(sender.getUsername() + " cannot send a message to a user because they have been blocked");
            }
        }
        chatHistories.get(sender).addMessage(message);
    }

    public void undoLastMessage(User user){
        ChatHistory userChatHistory = chatHistories.get(user);
        Message lastMessage = userChatHistory.getLastMessage();
        if (lastMessage != null) {
            userChatHistory.undoLastMessage();
            for (String recipient : lastMessage.getRecipients()) {
                User recipientUser = users.get(recipient);
                if (recipientUser != null) {
                    chatHistories.get(recipientUser).undoLastMessage();
                }
            }
        }
    }

    public void blockUser(User blocker, String username){
        blockedUsers.put(users.get(blocker.getUsername()), username);
        System.out.println("User:" + blocker.getUsername() + " has blocked " + username);
    }

    public ChatHistory getChatHistory(User user){
        return chatHistories.get(user);
    }

}
