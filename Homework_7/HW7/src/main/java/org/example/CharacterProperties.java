package org.example;

import java.io.Serializable;

public class CharacterProperties implements Serializable {
    String font;
    int size;
    String color;
    public CharacterProperties(String font, int size, String color){
        this.font = font;
        this.size = size;
        this.color = color;
    }
    public String getFont(){
        return font;
    }
    public int getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
}
