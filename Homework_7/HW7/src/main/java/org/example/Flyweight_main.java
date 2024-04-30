package org.example;
import java.util.*;
import java.io.*;
public class Flyweight_main {
    public static void loadDocument() {
        try (ObjectInputStream Oinput = new ObjectInputStream(new FileInputStream("document.ser"))) {
            Document loadedDocument = (Document) Oinput.readObject();
            List<Character> loadedCharacters = loadedDocument.getCharacters();

            System.out.println("Loaded characters:");
            for (Character character : loadedCharacters) {
                System.out.println(character.display());
            }

            for (Character character : loadedCharacters) {
                System.out.print(character.render());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("(1) Would you like to create a new file or (2) add to the old one?");
        Document document;
        Scanner scan = new Scanner(System.in);

        String selection = scan.nextLine();

        if(selection.equals("1")){
             document = new Document();
        }
        else if(selection.equals("2")){
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("document.ser"))) {
                document = (Document) ois.readObject();
                System.out.println("Document loaded successfully.");
            } catch (IOException | ClassNotFoundException e) {
                document = new Document();
                System.out.println("New document created as old one cannot be found.");
            }
        }
        else{
            System.out.println("Selection Not Recognized");
            return;
        }

        CharacterPropertiesFact factory = new CharacterPropertiesFact();

        CharacterProperties prop1 = factory.getCharacterProperties("Arial", 12, "Red");
        CharacterProperties prop2 = factory.getCharacterProperties("Calibri", 14, "Blue");
        CharacterProperties prop3 = factory.getCharacterProperties("Verdana", 16, "Green");
        CharacterProperties prop4 = factory.getCharacterProperties("Comic Sans", 16, "Yellow");

        ArrayList<Character> list = new ArrayList<Character>();

        Character char1 = new Character('H', prop1);
        list.add(char1);
        Character char2 = new Character('e', prop2);
        list.add(char2);
        Character char3 = new Character('l', prop3);
        list.add(char3);
        Character char4 = new Character('l', prop4);
        list.add(char4);
        Character char5 = new Character('o', prop1);
        list.add(char5);
        Character char6 = new Character('W', prop1);
        list.add(char6);
        Character char7 = new Character('o', prop1);
        list.add(char7);
        Character char8 = new Character('r', prop1);
        list.add(char8);
        Character char9 = new Character('l', prop1);
        list.add(char9);
        Character char10 = new Character('d', prop1);
        list.add(char10);
        Character char11 = new Character('C', prop2);
        list.add(char11);
        Character char12 = new Character('S', prop2);
        list.add(char12);
        Character char13 = new Character('5', prop4);
        list.add(char13);
        Character char14 = new Character('8', prop1);
        list.add(char14);
        Character char15 = new Character('0', prop3);
        list.add(char15);
        Character char16 = new Character('0', prop3);
        list.add(char16);

        for (Character character : list) {
            document.addCharacter(character);
        }

        try (ObjectOutputStream Ooutput = new ObjectOutputStream(new FileOutputStream("document.ser"))) {
            Ooutput.writeObject(document);
            System.out.println("Document saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        loadDocument();
    }
}
