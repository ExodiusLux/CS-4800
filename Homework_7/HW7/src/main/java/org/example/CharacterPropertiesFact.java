package org.example;
import java.util.*;
public class CharacterPropertiesFact {
    private final Map<String, CharacterProperties> characterPropertiesMap = new HashMap<String, CharacterProperties>();
    public CharacterProperties getCharacterProperties(String font, int size, String color){
        String key = font+size+color;
        if(!characterPropertiesMap.containsKey(key)){
            characterPropertiesMap.put(key, new CharacterProperties(font, size, color));
        }
        return characterPropertiesMap.get(key);
    }
}