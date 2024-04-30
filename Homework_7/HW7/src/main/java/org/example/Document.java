package org.example;
import java.io.*;
import java.util.*;
public class Document implements Serializable {
        private List<Character> characters;
        public Document() {
            characters = new ArrayList<Character>();
        }
        public void addCharacter(Character character) {
            characters.add(character);
        }
        public List<Character> getCharacters() {
            return characters;
        }


}
