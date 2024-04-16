package org.example;
import java.util.*;
public class Message {
    private String sender;
    private List<String> recipients;
    private Date timestamp;
    private String content;

    public Message (String sender, List<String> recipient, String content){
        this.sender = sender;
        this.recipients = recipient;
        this.content = content;
        this.timestamp = new Date();
    }
    public String getSender(){
        return sender;
    }

    public List<String> getRecipients(){
        return recipients;
    }

    public Date getTimestamp(){
        return timestamp;
    }

    public String getContent(){
        return content;
    }
}
