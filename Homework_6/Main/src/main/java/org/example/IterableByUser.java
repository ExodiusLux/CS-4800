package org.example;
import java.util.*;
public interface IterableByUser {
    Iterator<Message> iterator(User userToSearchWith);
}
