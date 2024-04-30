package org.example;

import java.io.Serializable;

public class Character implements Serializable {
    private char ch;
    private final CharacterProperties properties;

    public Character(char ch, CharacterProperties properties){
        this.ch = ch;
        this.properties = properties;
    }

    public String display(){
        return "Character: " + ch + ", Font: " + properties.getFont() + ", Size: " + properties.getSize() + ", Color: " + properties.getColor();
    }

    public char render(){
        return ch;
    }
}
