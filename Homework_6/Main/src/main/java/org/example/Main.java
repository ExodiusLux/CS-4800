package org.example;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        ChatServer server = new ChatServer();

        User alice = new User("Alice", server);
        User john = new User("John", server);
        User charlie = new User("Charlie", server);

        server.registerUser(alice);
        server.registerUser(john);
        server.registerUser(charlie);

        alice.sendMessage(Arrays.asList("John", "Charlie"), "Hello John and Charlie!");
        john.sendMessage(Collections.singletonList("Alice"), "Hi Alice!");
        alice.sendMessage(Collections.singletonList("Charlie"), "Hellooo Charlie?");
        charlie.blockUser("Alice"); // Charlie blocks messages from Alice
        alice.sendMessage(Collections.singletonList("Charlie"), "Can you see this, Charlie?");
        charlie.sendMessage(Collections.singletonList("John"), "I think I accidentally blocked Alice but lets leave it like this, Ill remove the evidence I told you");



        System.out.println("\nAlice's chat history:");
        Iterator<Message> aliceIterator = alice.iterator(alice);
        while (aliceIterator.hasNext()) {
            Message message = aliceIterator.next();
            System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + ": " + message.getContent());
        }
        System.out.println("\nJohn's chat history:");
        Iterator<Message> johnIterator = john.iterator(john);
        while (johnIterator.hasNext()) {
            Message message = johnIterator.next();
            System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + ": " + message.getContent());
        }

        System.out.println("\nCharlie's chat history:");
        Iterator<Message> charlieIterator = charlie.iterator(charlie);
        while (charlieIterator.hasNext()) {
            Message message = charlieIterator.next();
            System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + ": " + message.getContent());
        }

        charlie.undoLastMessage();
        System.out.println("\nCharlie's chat history after deleting last message");

        charlieIterator = charlie.iterator(charlie);
        while (charlieIterator.hasNext()) {
            Message message = charlieIterator.next();
            System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + ": " + message.getContent());
        }

        System.out.println("\nJohn's chat history after Charlie deleted his message");
        johnIterator = john.iterator(john);
        while(johnIterator.hasNext()){
            Message message = johnIterator.next();
            System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + ": " + message.getContent());
        }
    }
}